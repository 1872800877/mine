package com.example.demo.mapper;

import com.example.demo.entity.Word;
import com.example.demo.entity.WordExample;
import java.util.List;

public interface WordMapper {
    long countByExample(WordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Word record);

    int insertSelective(Word record);

    List<Word> selectByExample(WordExample example);

    Word selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Word record);

    int updateByPrimaryKey(Word record);
}