package com.example.demo.mapper;

import com.example.demo.entity.Master;
import com.example.demo.entity.MasterExample;
import java.util.List;

public interface MasterMapper {
    long countByExample(MasterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Master record);

    int insertSelective(Master record);

    List<Master> selectByExample(MasterExample example);

    Master selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Master record);

    int updateByPrimaryKey(Master record);
}