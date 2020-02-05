package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Article;
import com.example.demo.mapper.customMapper.ArticleMapperCustom;
import com.example.demo.service.ArticleService;
import com.example.demo.util.Img2String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class indexController {
    private static String BGPATH = "static/SliceRevealer/img";
    private static String HTMLBGPATH = "/mine/SliceRevealer/img";

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        try {
            ClassPathResource classPathResource = new ClassPathResource(BGPATH);
            jsonObject = findFileList(classPathResource.getFile());
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("bgImgs", jsonObject);
        request.setAttribute("user", request.getSession().getAttribute("user"));
        return "main";
    }
    @RequestMapping(value = "getHotArticle")
    @ResponseBody
    public String getHotArticle(HttpServletRequest request, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();
        List<Article> articles = null;
        try {
            articles = articleService.getHotArticle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jsonObject.put("hotArticles",articles);
        return jsonObject.toJSONString();
    }
    //返回目录下所有是文件的名字，json
    public JSONObject findFileList(File dir) {
        JSONObject jsonObject = new JSONObject();
        if (!dir.exists() || !dir.isDirectory()) {// 判断是否存在目录
            return jsonObject;
        }
        String[] files = dir.list();// 读取目录下的所有目录文件信息
        for (int i = 0; i < files.length; i++) {// 循环，添加文件名或回调自身
            File file = new File(dir, files[i]);
            if (file.isFile()) {// 如果文件
                jsonObject.put(String.valueOf(i), HTMLBGPATH+"/"+file.getName());
            }
        }
        return jsonObject;
    }
}
