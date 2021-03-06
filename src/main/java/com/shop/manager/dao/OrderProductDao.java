package com.shop.manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.manager.entity.OrderProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (OrderProduct)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-18 19:33:20
 */
@Repository
@Mapper
public interface OrderProductDao extends BaseMapper<OrderProduct> {



}