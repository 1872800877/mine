package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.ArticleType;
import com.example.demo.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "articleType")
public class ArticleTypeController {
    @Autowired
    ArticleTypeService articleTypeService;
    @RequestMapping(value ="getAllArticleType")
    @ResponseBody
    public String getAllArticleType(HttpServletRequest request, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        List<ArticleType> articleTypes = null;
        try {
            articleTypes = articleTypeService.getAllArticleType();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jsonObject.put("articleTypes", articleTypes);
        return jsonObject.toJSONString();
    }
}
