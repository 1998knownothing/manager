package com.shop.manager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Stock)实体类
 *
 * @author makejava
 * @since 2020-08-18 19:31:03
 */
@Data
@TableName("stock")
public class Stock implements Serializable {
    private static final long serialVersionUID = 320766223986389375L;
    
    private Integer id;
    
    private Date createTime;
    
    private String username;
    
    private Double sum;



}