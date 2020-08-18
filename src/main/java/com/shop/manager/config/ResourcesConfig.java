package com.shop.manager.config;


import com.shop.manager.security.ApiFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: weaf
 * @description:
 * @author: Mr.liu
 * @create: 2020-06-24 17:36
 **/
@Configuration
public class ResourcesConfig implements WebMvcConfigurer {


    @Autowired
    ApiFilter apiFilter;
    /**
     * 自定义拦截规则
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(apiFilter).addPathPatterns("/api/**");
    }
}
