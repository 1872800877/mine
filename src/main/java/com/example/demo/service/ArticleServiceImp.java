package com.example.demo.service;

import com.example.demo.entity.Article;
import com.example.demo.entity.ArticleExample;
import com.example.demo.mapper.ArticleMapper;
import com.example.demo.mapper.customMapper.ArticleMapperCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ArticleServiceImp implements ArticleService{
    @Resource
    ArticleMapper articleMapper;
    @Resource
    ArticleMapperCustom articleMapperCustom;
    @Override
    public Article getArticleById(Article article)  throws Exception{
        if (article!=null){
            return articleMapper.selectByPrimaryKey(article.getId());
        }
        return null;
    }

    @Override
    public void updeArticle(Article article)  throws Exception{
        if (article!=null){
            articleMapper.updateByPrimaryKey(article);
        }
    }

    @Override
    public void deleteArticle(Article article)  throws Exception{
        if (article!=null){
            articleMapper.deleteByPrimaryKey(article.getId());
        }
    }

    @Override
    public void saveArticle(Article article)  throws Exception{
        if (article!=null){
            articleMapper.insert(article);
        }
    }

    @Override
    public List<Article> getHotArticle() throws Exception {
        return  articleMapperCustom.selectHotArticle();
    }

}
