package com.xust.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章和标签关联
 */
@Data
public class ArticleTagRef implements Serializable {
    private static final long serialVersionUID = -5816783232020910492L;

    private Integer articleId;//文章ID

    private Integer tagId;//文章标签

    public ArticleTagRef() {
    }

    public ArticleTagRef(Integer articleId, Integer tagId) {
        this.articleId = articleId;
        this.tagId = tagId;
    }
}
