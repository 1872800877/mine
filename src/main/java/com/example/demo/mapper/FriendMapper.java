package com.example.demo.mapper;

import com.example.demo.entity.Friend;
import com.example.demo.entity.FriendExample;
import java.util.List;

public interface FriendMapper {
    long countByExample(FriendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Friend record);

    int insertSelective(Friend record);

    List<Friend> selectByExample(FriendExample example);

    Friend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);
}