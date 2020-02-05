package com.example.demo.entity;

import java.util.Date;

public class Word {

    private Integer id;

    private String wordTitle;

    private String wordContent;

    private Date wordSdtime;

    private Integer wordAuthorid;

    private Integer wordMasterid;

    public Word(Integer id, String wordTitle, String wordContent, Date wordSdtime, Integer wordAuthorid, Integer wordMasterid) {
        this.id = id;
        this.wordTitle = wordTitle;
        this.wordContent = wordContent;
        this.wordSdtime = wordSdtime;
        this.wordAuthorid = wordAuthorid;
        this.wordMasterid = wordMasterid;
    }

    public Word() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWordTitle() {
        return wordTitle;
    }

    public void setWordTitle(String wordTitle) {
        this.wordTitle = wordTitle == null ? null : wordTitle.trim();
    }

    public String getWordContent() {
        return wordContent;
    }

    public void setWordContent(String wordContent) {
        this.wordContent = wordContent == null ? null : wordContent.trim();
    }

    public Date getWordSdtime() {
        return wordSdtime;
    }

    public void setWordSdtime(Date wordSdtime) {
        this.wordSdtime = wordSdtime;
    }

    public Integer getWordAuthorid() {
        return wordAuthorid;
    }

    public void setWordAuthorid(Integer wordAuthorid) {
        this.wordAuthorid = wordAuthorid;
    }

    public Integer getWordMasterid() {
        return wordMasterid;
    }

    public void setWordMasterid(Integer wordMasterid) {
        this.wordMasterid = wordMasterid;
    }
}