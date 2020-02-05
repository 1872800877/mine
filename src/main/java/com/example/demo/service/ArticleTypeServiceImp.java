package com.example.demo.service;

import com.example.demo.entity.ArticleType;
import com.example.demo.entity.ArticleTypeExample;
import com.example.demo.mapper.ArticleTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ArticleTypeServiceImp implements ArticleTypeService{

    @Resource
    ArticleTypeMapper articleTypeMapper;

    @Override
    public List<ArticleType> getAllArticleType() throws Exception{
        ArticleTypeExample example = new ArticleTypeExample();
        ArticleTypeExample.Criteria criteria = example.createCriteria();
        criteria.andArticletypeNameIsNotNull();
        return articleTypeMapper.selectByExample(example);
    }
}
