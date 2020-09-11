package com.xust.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 */
@Data
public class Tag implements Serializable{
    private static final long serialVersionUID = 605449151900057035L;
    private Integer tagId;//标签id

    private String tagName;//标签名

    private String tagDescription;//标签描述

    /**
     * 文章数量(不是数据库字段)
     */
    private Integer articleCount;

    public Tag() {
    }

    public Tag(Integer tagId) {
        this.tagId = tagId;
    }

    public Tag(Integer tagId, String tagName, String tagDescription, Integer articleCount) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.tagDescription = tagDescription;
        this.articleCount = articleCount;
    }
}