package com.xust.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 */
@Data
public class User implements Serializable{
    private static final long serialVersionUID = -4415517704211731385L;
    private Integer userId;//用户ID

    private String userName;//用户名

    private String userPass;//用户密码

    private String userNickname;//用户昵称

    private String userEmail;//用户Email

    private String userUrl;//用户Url

    private String userAvatar;//用户简介

    private String userLastLoginIp;//用户最后登录ip

    private Date userRegisterTime;//用户创建时间

    private Date userLastLoginTime;//用户最后登录时间

    private Integer userStatus;

    /**
     * 文章数量（不是数据库字段）
     */
    private Integer articleCount;

}