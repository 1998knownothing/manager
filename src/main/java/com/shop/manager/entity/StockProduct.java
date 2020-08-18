package com.shop.manager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (StockProduct)实体类
 *
 * @author makejava
 * @since 2020-08-18 19:31:03
 */
@Data
@TableName("stock_product")
public class StockProduct implements Serializable {
    private static final long serialVersionUID = -93558059468856471L;
    
    private Integer id;
    
    private Integer stockId;
    
    private Integer productId;
    
    private Integer singlePrice;
    
    private Double sumPrice;
    
    private Integer num;



}