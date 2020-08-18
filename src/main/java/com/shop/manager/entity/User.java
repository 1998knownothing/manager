package com.shop.manager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-08-18 19:31:03
 */
@Data
@TableName("user")
public class User implements Serializable {
    private static final long serialVersionUID = -63847489288957597L;
    
    private Integer userId;
    
    private String username;
    
    private String password;



}