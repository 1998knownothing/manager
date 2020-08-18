package com.shop.manager.controller;

import com.shop.manager.entity.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: manager
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-18 19:45
 **/
@RestController
@RequestMapping("/api/order")
public class OrderController {

    /*
    * 添加订单
    * */
    @PostMapping("/add")
    public Map<String,Object> add(){
     /*   Map<String,Object> map=new HashMap<>();
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
}
