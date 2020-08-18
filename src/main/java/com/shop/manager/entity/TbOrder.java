package com.shop.manager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbOrder)实体类
 *
 * @author makejava
 * @since 2020-08-18 19:31:03
 */
@Data
@TableName("tb_order")
public class TbOrder implements Serializable {
    private static final long serialVersionUID = -64801567690621197L;
    
    private Integer orderId;
    
    private Date createTime;
    
    private Integer status;
    
    private String username;
    
    private Double sum;




}