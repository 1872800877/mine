package com.example.demo.entity;

import java.util.Date;

public class Review {

    private Integer id;

    private Integer reviewArticleid;

    private Integer reviewMasterid;

    private String reviewContent;

    private Date reviewSdtime;

    private Integer reviewAuthorid;

    public Review(Integer id, Integer reviewArticleid, Integer reviewMasterid, String reviewContent, Date reviewSdtime, Integer reviewAuthorid) {
        this.id = id;
        this.reviewArticleid = reviewArticleid;
        this.reviewMasterid = reviewMasterid;
        this.reviewContent = reviewContent;
        this.reviewSdtime = reviewSdtime;
        this.reviewAuthorid = reviewAuthorid;
    }

    public Review() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReviewArticleid() {
        return reviewArticleid;
    }

    public void setReviewArticleid(Integer reviewArticleid) {
        this.reviewArticleid = reviewArticleid;
    }

    public Integer getReviewMasterid() {
        return reviewMasterid;
    }

    public void setReviewMasterid(Integer reviewMasterid) {
        this.reviewMasterid = reviewMasterid;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent == null ? null : reviewContent.trim();
    }

    public Date getReviewSdtime() {
        return reviewSdtime;
    }

    public void setReviewSdtime(Date reviewSdtime) {
        this.reviewSdtime = reviewSdtime;
    }

    public Integer getReviewAuthorid() {
        return reviewAuthorid;
    }

    public void setReviewAuthorid(Integer reviewAuthorid) {
        this.reviewAuthorid = reviewAuthorid;
    }
}