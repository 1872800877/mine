package com.example.demo.mapper;

import com.example.demo.entity.Review;
import com.example.demo.entity.ReviewExample;
import java.util.List;

public interface ReviewMapper {
    long countByExample(ReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}