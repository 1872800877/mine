package com.example.demo.entity;

public class ArticleType {
    private Integer id;

    private String articletypeName;

    private String articletypeInfo;

    public ArticleType(Integer id, String articletypeName, String articletypeInfo) {
        this.id = id;
        this.articletypeName = articletypeName;
        this.articletypeInfo = articletypeInfo;
    }

    public ArticleType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticletypeName() {
        return articletypeName;
    }

    public void setArticletypeName(String articletypeName) {
        this.articletypeName = articletypeName == null ? null : articletypeName.trim();
    }

    public String getArticletypeInfo() {
        return articletypeInfo;
    }

    public void setArticletypeInfo(String articletypeInfo) {
        this.articletypeInfo = articletypeInfo == null ? null : articletypeInfo.trim();
    }
}