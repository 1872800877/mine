package com.example.demo.entity;

import java.util.Date;
public class Master {
    private Integer id;

    private String masterUsername;

    private String masterNickname;

    private String masterPassword;

    private String masterOicq;

    private Integer masterSex;

    private Date masterLogintime;

    public Master(Integer id, String masterUsername, String masterNickname, String masterPassword, String masterOicq, Integer masterSex, Date masterLogintime) {
        this.id = id;
        this.masterUsername = masterUsername;
        this.masterNickname = masterNickname;
        this.masterPassword = masterPassword;
        this.masterOicq = masterOicq;
        this.masterSex = masterSex;
        this.masterLogintime = masterLogintime;
    }

    public Master() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMasterUsername() {
        return masterUsername;
    }

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername == null ? null : masterUsername.trim();
    }

    public String getMasterNickname() {
        return masterNickname;
    }

    public void setMasterNickname(String masterNickname) {
        this.masterNickname = masterNickname == null ? null : masterNickname.trim();
    }

    public String getMasterPassword() {
        return masterPassword;
    }

    public void setMasterPassword(String masterPassword) {
        this.masterPassword = masterPassword == null ? null : masterPassword.trim();
    }

    public String getMasterOicq() {
        return masterOicq;
    }

    public void setMasterOicq(String masterOicq) {
        this.masterOicq = masterOicq == null ? null : masterOicq.trim();
    }

    public Integer getMasterSex() {
        return masterSex;
    }

    public void setMasterSex(Integer masterSex) {
        this.masterSex = masterSex;
    }

    public Date getMasterLogintime() {
        return masterLogintime;
    }

    public void setMasterLogintime(Date masterLogintime) {
        this.masterLogintime = masterLogintime;
    }
}