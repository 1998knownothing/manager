package com.shop.manager.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.manager.dao.UserDao;
import com.shop.manager.entity.Product;
import com.shop.manager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @create: 2020-08-18 19:46
 **/
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserDao userDao;
    @GetMapping("/login")
    public Map<String,Object> login(HttpServletRequest request,String username, String password){

        Map<String,Object> map=new HashMap<>();

        if(username==null||"".equals(username)||password==null||"".equals(password)){
            map.put("code","401");
            map.put("msg","账号密码不能为空！！！");
            map.put("data",null);
            return map;
        }
        //数据库取出
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        LambdaQueryWrapper<User> lambda = queryWrapper.lambda();
        lambda.eq(User::getUsername,username);
        User user = userDao.selectOne(lambda);
        if(password.equals(user.getPassword())){
            request.getSession().setAttribute("username",username);
        }else {
            map.put("code","200");
            map.put("msg","登陆失败，密码错误");
            map.put("data",null);
            return map;
        }
        map.put("code","200");
        map.put("msg","成功登陆");
        map.put("data",null);
        return map;
    }
    @GetMapping("/logout")
    public Map<String,Object> logout(HttpServletRequest request){
        String username = (String)request.getSession().getAttribute("username");
        Map<String,Object> map=new HashMap<>();
        if(username==null){
            map.put("code","402");
            map.put("msg","未登录，无法退出账号");
            map.put("data",null);
            return map;
        }
        request.getSession().removeAttribute("username");
        map.put("code","200");
        map.put("msg","成功退出");
        map.put("data",null);
        return map;
    }

}
