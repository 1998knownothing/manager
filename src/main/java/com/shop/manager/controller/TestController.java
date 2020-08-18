package com.shop.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: manager
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-18 20:18
 **/
@RestController
public class TestController {
    @GetMapping("/api/test")
    public Map<String,Object> test(HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        map.put("code","200");
        map.put("msg","test");
        map.put("data",null);
        return map;
    }
    @GetMapping("/ce/test")
    public Map<String,Object> ce(HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        map.put("code","200");
        map.put("msg","testce");
        map.put("data",null);
        return map;
    }
}
