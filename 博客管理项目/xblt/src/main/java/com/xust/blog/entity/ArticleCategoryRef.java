package com.xust.blog.entity;

import lombok.Data;
/**
 * 文章分类关联表
 *
 */
@Data
public class ArticleCategoryRef  {

    private static final long serialVersionUID = -6809206515467725995L;

    private Integer articleId;//文章ID

    private Integer categoryId;//栏目ID

    public ArticleCategoryRef() {
    }

    public ArticleCategoryRef(Integer articleId, Integer categoryId) {
        this.articleId = articleId;
        this.categoryId = categoryId;
    }
}