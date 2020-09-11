package com.xust.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章评论
 */

@Data
public class Comment implements Serializable{

    private static final long serialVersionUID = -1038897351672911219L;
    private Integer commentId;//评论ID

    private Integer commentPid;//评论用户PID

    private String commentPname;//评论用户

    private Integer commentArticleId;//评论文章ID

    private String commentAuthorName;//评论作者名

    private String commentAuthorEmail;//评论作者Email

    private String commentAuthorUrl;//评论作者url链接

    private String commentAuthorAvatar;//评论作者答复

    private String commentContent;//评论内容

    private String commentAgent;//评论主题

    private String commentIp;//创建Ip

    private Date commentCreateTime;//创建时间

    /**
     * 角色(管理员1，访客0)
     */
    private Integer commentRole;

    /**
     * 非数据库字段
     */
    private Article article;//文章

}