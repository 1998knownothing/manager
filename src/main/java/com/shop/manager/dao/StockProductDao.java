package com.shop.manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.manager.entity.StockProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (StockProduct)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-18 19:33:24
 */
@Repository
@Mapper
public interface StockProductDao extends BaseMapper<StockProduct> {



}