package com.example.demo.entity;

import java.util.Date;
public class Photo {

    private Integer id;

    private String photoAddr;

    private Date photoAdtime;

    private String photoInfo;

    private Integer photoMasterid;

    public Photo(Integer id, String photoAddr, Date photoAdtime, String photoInfo, Integer photoMasterid) {
        this.id = id;
        this.photoAddr = photoAddr;
        this.photoAdtime = photoAdtime;
        this.photoInfo = photoInfo;
        this.photoMasterid = photoMasterid;
    }

    public Photo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhotoAddr() {
        return photoAddr;
    }

    public void setPhotoAddr(String photoAddr) {
        this.photoAddr = photoAddr == null ? null : photoAddr.trim();
    }

    public Date getPhotoAdtime() {
        return photoAdtime;
    }

    public void setPhotoAdtime(Date photoAdtime) {
        this.photoAdtime = photoAdtime;
    }

    public String getPhotoInfo() {
        return photoInfo;
    }

    public void setPhotoInfo(String photoInfo) {
        this.photoInfo = photoInfo == null ? null : photoInfo.trim();
    }

    public Integer getPhotoMasterid() {
        return photoMasterid;
    }

    public void setPhotoMasterid(Integer photoMasterid) {
        this.photoMasterid = photoMasterid;
    }
}