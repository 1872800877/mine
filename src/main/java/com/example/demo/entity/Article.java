package com.example.demo.entity;

import java.util.Date;
public class Article {
    private Integer id;
    private Integer articleTypeid;

    private String articleTitle;

    private Integer articleCount;

    private Integer articleFrom;

    private Integer articleMasterid;

    private Date articleDate;

    private String articleContent;

    public Article(Integer id, Integer articleTypeid, String articleTitle, Integer articleCount, Integer articleFrom, Integer articleMasterid, Date articleDate) {
        this.id = id;
        this.articleTypeid = articleTypeid;
        this.articleTitle = articleTitle;
        this.articleCount = articleCount;
        this.articleFrom = articleFrom;
        this.articleMasterid = articleMasterid;
        this.articleDate = articleDate;
    }

    public Article(Integer id, Integer articleTypeid, String articleTitle, Integer articleCount, Integer articleFrom, Integer articleMasterid, Date articleDate, String articleContent) {
        this.id = id;
        this.articleTypeid = articleTypeid;
        this.articleTitle = articleTitle;
        this.articleCount = articleCount;
        this.articleFrom = articleFrom;
        this.articleMasterid = articleMasterid;
        this.articleDate = articleDate;
        this.articleContent = articleContent;
    }

    public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleTypeid() {
        return articleTypeid;
    }

    public void setArticleTypeid(Integer articleTypeid) {
        this.articleTypeid = articleTypeid;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    public Integer getArticleFrom() {
        return articleFrom;
    }

    public void setArticleFrom(Integer articleFrom) {
        this.articleFrom = articleFrom;
    }

    public Integer getArticleMasterid() {
        return articleMasterid;
    }

    public void setArticleMasterid(Integer articleMasterid) {
        this.articleMasterid = articleMasterid;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}