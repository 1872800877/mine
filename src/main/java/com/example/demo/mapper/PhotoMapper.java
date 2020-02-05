package com.example.demo.mapper;

import com.example.demo.entity.Photo;
import com.example.demo.entity.PhotoExample;
import java.util.List;

public interface PhotoMapper {
    long countByExample(PhotoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Photo record);

    int insertSelective(Photo record);

    List<Photo> selectByExample(PhotoExample example);

    Photo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Photo record);

    int updateByPrimaryKey(Photo record);
}