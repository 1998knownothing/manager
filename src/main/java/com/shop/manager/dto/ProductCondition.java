package com.shop.manager.dto;

import lombok.Data;

/**
 * @program: manager
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-18 20:36
 **/
@Data
public class ProductCondition {
    String productName;

    Integer startNum;

    Integer endNum;

    Double startPrice;

    Double endPrice;
}
