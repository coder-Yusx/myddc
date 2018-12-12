package com.zxyy.yusx.myddc.config;

import com.zxyy.yusx.myddc.interceptor.ProcessInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author yushengxian
 * mvc静态资源拦截
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /* @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ProcessInterceptor()).addPathPatterns("/report1");
    }*/

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*")
                .allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS")
                .allowCredentials(false).maxAge(3600);
    }
}