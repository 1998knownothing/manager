package com.shop.manager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author makejava
 * @since 2020-08-18 19:31:03
 */
@Data
@TableName("product")
public class Product implements Serializable {
    private static final long serialVersionUID = 697807964043762501L;
    
    private Integer pid;
    
    private Date createTime;
    
    private Integer status;
    
    private String pname;
    
    private Integer pnum;
    
    private Double price;
    
    private String purchasePrice;



}