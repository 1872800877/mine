package com.example.demo.service;

import com.example.demo.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {
    public Article getArticleById(Article article) throws Exception;
    public void updeArticle(Article article) throws Exception;
    public void deleteArticle(Article article) throws Exception;
    public void saveArticle(Article article) throws Exception;
    public List<Article> getHotArticle() throws Exception;
}
