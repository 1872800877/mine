package com.example.demo.mapper.customMapper;

import com.example.demo.entity.Article;

import java.util.List;

public interface ArticleMapperCustom {
    public List<Article> selectHotArticle();
}
