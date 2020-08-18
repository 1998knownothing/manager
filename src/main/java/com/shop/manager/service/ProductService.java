package com.shop.manager.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.manager.dao.ProductDao;
import com.shop.manager.dto.ProductCondition;
import com.shop.manager.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: manager
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-18 20:31
 **/
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductDao productDao;

    /*
    * 添加
    * */
    public boolean insert(Product product){
        int i = productDao.insert(product);
        if(i<=0){
            return false;
        }
        else return true;
    }
/*
* 查询
* */
    public List<Product> query(ProductCondition productCondition){
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        LambdaQueryWrapper<Product> lambda = queryWrapper.lambda();

        if(productCondition.getProductName()!=null){
            lambda.eq(Product::getPname,productCondition.getProductName());
        }
        if(productCondition.getStartPrice()!=null){
            lambda.ge(Product::getPrice,productCondition.getStartPrice());
        }
        if(productCondition.getEndPrice()!=null){
            lambda.le(Product::getPrice,productCondition.getEndPrice());
        }
        if(productCondition.getStartNum()!=null){
            lambda.ge(Product::getPrice,productCondition.getStartNum());
        }
        if(productCondition.getEndNum()!=null){
            lambda.le(Product::getPrice,productCondition.getEndNum());
        }
        List<Product> products = productDao.selectList(lambda);
        return products;
    }

    public boolean delete(Integer id){

        int i = productDao.deleteById(id);
        if(i<=0){
            return false;
        }
        else return true;
    }
}
