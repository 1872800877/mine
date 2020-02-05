package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Master;
import com.example.demo.service.MasterService;
import com.example.demo.util.PostHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.naming.Name;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping(value = "login")
public class loginController {
    @Autowired
    MasterService masterService;
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request, HttpServletResponse response){
        JSONObject parameters = PostHandle.PostHandleJson(request);
        JSONObject jsonObject = new JSONObject();
        Map result = new HashMap();
        if (result==null){
            result.put("code", "01");
            result.put("message", "参数不能为空");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        String verifyCode = parameters.getString("verifyCode");
        Master master = new Master();
        master.setMasterUsername(parameters.getString("username"));
        master.setMasterPassword(parameters.getString("password"));
        String sessionVerifyCode = (String) request.getSession().getAttribute("verifyCode");
        request.getSession().removeAttribute("verifyCode");
        if (verifyCode==null){
            result.put("code", "01");
            result.put("message", "验证码不能为空");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        if (master.getMasterUsername()==null||"".equals(master.getMasterUsername())){
            result.put("code", "01");
            result.put("message", "用户名不能为空");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        if (master.getMasterPassword()==null||"".equals(master.getMasterPassword())){
            result.put("code", "01");
            result.put("message", "密码不能为空");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        if (sessionVerifyCode!=null&&!verifyCode.equals(sessionVerifyCode)){
            result.put("code", "01");
            result.put("message", "验证码不正确");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        List<Master> masters = null;
        try {
            masters = masterService.getMasterByUserNameAndPassword(master);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (masters.size()==0) {
            result.put("code", "01");
            result.put("message", "用户名或密码错误");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }else if(masters.size()>1){
            result.put("code", "01");
            result.put("message", "该用户名存在两个账号，请联系管理员处理");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        master = masters.get(0);
        request.getSession().setAttribute("user", master);
        master.setMasterPassword(null);
        result.put("code", "00");
        result.put("message", "登录成功");
        result.put("user", master);
        jsonObject.put("result", result);
        return jsonObject.toJSONString();
    }
    @RequestMapping(value = "register")
    @ResponseBody
    public String register(HttpServletRequest request, HttpServletResponse response){
        JSONObject parameters = PostHandle.PostHandleJson(request);
        String password = parameters.getString("password");
        String username = parameters.getString("username");
        String nickName = parameters.getString("nickName");
        String confirmPassword = parameters.getString("confirmPassword");
        JSONObject jsonObject = new JSONObject();
        Map result = new HashMap();
        if (password==null||"".equals(password)){
                result.put("code", "01");
                result.put("message", "密码不能为空");
                jsonObject.put("result", result);
                return jsonObject.toJSONString();
        }
        if (confirmPassword==null||"".equals(confirmPassword)){
            result.put("code", "01");
            result.put("message", "确认密码不能为空");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        if (username==null||"".equals(username)){
            result.put("code", "01");
            result.put("message", "用户名不能为空");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        if (nickName==null||"".equals(nickName)){
            result.put("code", "01");
            result.put("message", "昵称不能为空");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        if(!password.equals(confirmPassword)){
            result.put("code", "01");
            result.put("message", "两次密码不同");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        Master master = new Master();
        master.setMasterPassword(password);
        master.setMasterUsername(username);
        master.setMasterNickname(nickName);
        master.setMasterSex(0);
        master.setMasterOicq("123");
        List<Master> masters = null;
        try {
            masters = masterService.getMasterByUsername(master);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (masters.size()>0){
            try {
                masterService.saveMaster(master);
            } catch (Exception e) {
                e.printStackTrace();
            }
            result.put("code", "01");
            result.put("message", "存在该用户名");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        try {
            masterService.saveMaster(master);
            result.put("code", "00");
            result.put("message", "注册成功");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }catch (Exception e){
            result.put("code", "01");
            result.put("message", "注册失败,"+e.getMessage());
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
    }
    @RequestMapping(value = "exit")
    public void exit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("user");
        request.getRequestDispatcher("/").forward(request, response);
    }

    @RequestMapping(value = "getVerifyCode")
    public void getVerifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Pragma","No-cache");
        response.setHeader("Cache-Control","no-cache");
        response.setDateHeader("Expires", 0);

        Random random = new Random();
        HttpSession session = request.getSession(false);
        if(session==null)session = request.getSession(true);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int sum=num1+num2;
        //生成随机类
        int funNo = random.nextInt(3);  //产生[0,2]之间的随机整数
        switch (funNo) {
            case 0: sum = num1 + num2; break;
            case 1: sum = num1 - num2; break;
            case 2: sum = num1 * num2; break;
        }
        BufferedImage image = this.createVerificationImage(num1, num2, funNo);
        session.setAttribute("verifyCode", String.valueOf(sum));
        ImageIO.write(image, "JPEG", response.getOutputStream());
    }
    public Color getRandColor(int fc, int bc) {
        //给定范围获得随机颜色
        Random random = new Random();
        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

    public BufferedImage createVerificationImage(int num1, int num2, int funNo) {
        // 在内存中创建图象
        int width = 60, height = 20;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 获取图形上下文
        Graphics g = image.getGraphics();
        // 生成随机类
        Random random = new Random();
        // 设定背景色
        g.setColor(getRandColor(240, 250));
        g.fillRect(0, 0, width, height);
        // 设定字体
        g.setFont(new Font("Arail",Font.PLAIN,18));
        // 随机产生60条干扰线，使图象中的认证码不易被其它程序探测到
        g.setColor(getRandColor(120, 160));
        for (int i = 0; i < 60; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }

        String funMethod = "";
        switch (funNo) {
            case 0:
                funMethod = "+";
                break;
            case 1:
                funMethod = "-";
                break;
            case 2:
                funMethod = "×";
                break;
        }
        String calc = num1 + "" + funMethod + "" + num2 + "=?";
        g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
        g.drawString(calc, 2, 15);
        g.dispose();
        return image;
    }
}
