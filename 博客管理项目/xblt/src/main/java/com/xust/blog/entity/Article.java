package com.xust.blog.entity;

/**
 * @ClassName Article
 * @Version 1.0
 **/
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
//文章属性

@Data
public class Article implements Serializable {
    private static final long serialVersionUID = 5207865247400761539L;

    private Integer articleId;//文章ID

    private Integer articleUserId;//文章用户ID

    private String articleTitle;//文章标题

    private Integer articleViewCount;//文章访问量

    private Integer articleCommentCount;//文章评论数

    private Integer articleLikeCount;//文章点击数

    private Date articleCreateTime;//创建时间

    private Date articleUpdateTime;//修改时间

    private Integer articleIsComment;//评论内容

    private Integer articleStatus;//状态

    private Integer articleOrder;//文章回复

    private String articleContent;//文章内容

    private String articleSummary;//文章摘要

    private User user;//用户

    private List<Tag> tagList;//标签

    private List<Category> categoryList;//分类
}
