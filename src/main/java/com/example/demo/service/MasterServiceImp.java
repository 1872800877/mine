package com.example.demo.service;

import com.example.demo.entity.Master;
import com.example.demo.entity.MasterExample;
import com.example.demo.mapper.MasterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MasterServiceImp implements MasterService{

    @Resource
    MasterMapper masterMapper;

    @Override
    public Master getMasterById(Master master)  throws Exception{
        if (master!=null&&master.getId()!=null){
            return masterMapper.selectByPrimaryKey(master.getId());
        }else {
            return null;
        }
    }

    @Override
    public void saveMaster(Master master)  throws Exception{
        if (master!=null){
            masterMapper.insert(master);
        }
    }

    @Override
    public void deleteMasterById(Master master)  throws Exception{
        if (master!=null){
            masterMapper.deleteByPrimaryKey(master.getId());
        }
    }

    @Override
    public void updateMaster(Master master)  throws Exception{
        if (master!=null){
            masterMapper.updateByPrimaryKey(master);
        }
    }

    @Override
    public List<Master> getMasterByUserNameAndPassword(Master master)  throws Exception{
        if (master!=null){
            MasterExample example = new MasterExample();
            MasterExample.Criteria criteria =  example.createCriteria();
            criteria.andMasterUsernameIsNotNull();
            criteria.andMasterPasswordEqualTo(master.getMasterPassword());
            criteria.andMasterPasswordIsNotNull();
            criteria.andMasterUsernameEqualTo(master.getMasterUsername());
            return masterMapper.selectByExample(example);
        }
        return null;
    }

    @Override
    public List<Master> getMasterByUsername(Master master)  throws Exception{
        if (master!=null&&master.getMasterUsername()!=null&&!"".equals(master.getMasterUsername())){
            MasterExample example = new MasterExample();
            MasterExample.Criteria criteria =  example.createCriteria();
            criteria.andMasterUsernameEqualTo(master.getMasterUsername());
            return masterMapper.selectByExample(example);
        }
        return null;
    }
}
