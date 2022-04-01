package com.frankfurtlin.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author frankfurtlin
 * @since 2022-04-01
 */
@Data
@TableName("blog")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 文章题目
     */
    private String title;

    /**
     * 文章介绍
     */
    private String description;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 文章发表时间
     */
    private Date createTime;

    /**
     * 文章更新时间
     */
    private Date updateTime;

    /**
     * 文章状态
     */
    private Integer status;

}
