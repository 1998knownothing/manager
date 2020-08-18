package com.shop.manager.controller;

import com.shop.manager.dao.ProductDao;
import com.shop.manager.dto.ProductCondition;
import com.shop.manager.entity.Product;
import com.shop.manager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: manager
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-18 19:45
 **/
@RestController
@RequestMapping("/api/pro")
public class ProductController {

    @Autowired
    private ProductService productService;
    /*
    * 商品信息录入
    * */
    @PostMapping("/add")
    public Map<String,Object> add(Product product){
        Map<String,Object> map=new HashMap<>();
        if(product==null){
            map.put("code","2020");
            map.put("msg","参数不能为空");
            map.put("data",null);
            return map;
        }
        boolean b = productService.insert(product);
        if(b){
            map.put("code","2021");
            map.put("msg","系统出错");
            map.put("data",null);
        }
        return map;
    }
    @PostMapping("/get")
    public Map<String,Object> get(ProductCondition productCondition){
        Map<String,Object> map=new HashMap<>();

        List<Product> products= productService.query(productCondition);
            map.put("code","200");
            map.put("msg","success");
            map.put("data",products);
        return map;
    }
    @GetMapping("/del")
    public Map<String,Object> del(Integer id){
        Map<String,Object> map=new HashMap<>();

        boolean delete = productService.delete(id);
        if(delete){
            map.put("code","2021");
            map.put("msg","系统出错");
            map.put("data",null);
        }
        map.put("code","200");
        map.put("msg","success delete:"+id);
        map.put("data",null);
        return map;
    }
    @PostMapping("/sell")
    public Map<String,Object> sell(Integer num,String pid){
      /*  Map<String,Object> map=new HashMap<>();
        if(product==null){
            map.put("code","2020");
            map.put("msg","参数不能为空");
            map.put("data",null);
            return map;
        }
        boolean b = productService.insert(product);
        if(b){
            map.put("code","2021");
            map.put("msg","系统出错");
            map.put("data",null);
        }
        return map;*/
      return null;
    }
    /*
    * （2）浏览所有商品信息：
（3）查询商品信息（可以按照商品名称、库存量范围、售出价范围进行查询）
修改商品信息
（4）删除商品信息
（5）出售商品
    * */
}
