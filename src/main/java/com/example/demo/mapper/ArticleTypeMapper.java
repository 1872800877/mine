package com.example.demo.mapper;

import com.example.demo.entity.ArticleType;
import com.example.demo.entity.ArticleTypeExample;
import java.util.List;

public interface ArticleTypeMapper {
    long countByExample(ArticleTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    List<ArticleType> selectByExample(ArticleTypeExample example);

    ArticleType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKey(ArticleType record);
}