package com.example.demo.service;

import com.example.demo.entity.Master;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MasterService {
    public Master getMasterById(Master master) throws Exception;
    public void saveMaster(Master master) throws Exception;
    public void deleteMasterById(Master master) throws Exception;
    public void  updateMaster(Master master) throws Exception;
    public List<Master> getMasterByUserNameAndPassword(Master master) throws Exception;
    public List<Master> getMasterByUsername(Master master) throws Exception;
}
