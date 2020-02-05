package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Article;
import com.example.demo.entity.Master;
import com.example.demo.service.ArticleService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "article")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    @RequestMapping(value = "saveArticle")
    @ResponseBody
    public String saveArticle(@RequestBody Article article, HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        Master master = (Master) session.getAttribute("user");
        JSONObject jsonObject = new JSONObject();
        Map result = new HashMap();
        if (master==null){
            result.put("code", "01");
            result.put("message", "请登录");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        if (article==null||article.getArticleContent()==null||article.getArticleTitle()==null||article.getArticleTypeid()==null){
            result.put("code", "01");
            result.put("message", "请填写完毕");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        article.setArticleCount(0);
        article.setArticleDate(new Date());
        article.setArticleMasterid(master.getId());
        article.setArticleFrom(0);
        try {
            articleService.saveArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", "01");
            result.put("message", "请填写完毕");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        result.put("code", "00");
        result.put("message", "保存成功");
        jsonObject.put("result", result);
        return jsonObject.toJSONString();
    }
    @RequestMapping(value = "deleteArticleById")
    @ResponseBody
    public String deleteArticleById(@RequestBody Article article, HttpServletRequest request, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();
        Map result = new HashMap();
        HttpSession session = request.getSession();
        Master master = (Master)session.getAttribute("user");
        if (master==null){
            result.put("code", "01");
            result.put("message", "请登录");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        if (article==null||article.getId()==null){
            result.put("code", "01");
            result.put("message", "操作失败");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        try {
            article = articleService.getArticleById(article);
            if (master.getId()!=article.getArticleMasterid()){
                result.put("code", "01");
                result.put("message", "没有操作权限");
                jsonObject.put("result", result);
                return jsonObject.toJSONString();
            }
            articleService.deleteArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", "01");
            result.put("message", "操作失败");
            jsonObject.put("result", result);
            return jsonObject.toJSONString();
        }
        result.put("code", "00");
        result.put("message", "删除成功");
        jsonObject.put("result", result);
        return jsonObject.toJSONString();
    }
}
