package com.example.demo.service;

import com.example.demo.entity.ArticleType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleTypeService {
    public List<ArticleType> getAllArticleType() throws Exception;
}
