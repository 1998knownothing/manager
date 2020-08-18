package com.shop.manager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (OrderProduct)实体类
 *
 * @author makejava
 * @since 2020-08-18 19:31:03
 */
@Data
@TableName("order_product")
public class OrderProduct implements Serializable {
    private static final long serialVersionUID = 873898149983725760L;
    
    private Integer id;
    
    private Integer orderId;
    
    private Integer productId;
    
    private Integer num;
    
    private Double singlePrice;
    
    private Double sumPrice;


}