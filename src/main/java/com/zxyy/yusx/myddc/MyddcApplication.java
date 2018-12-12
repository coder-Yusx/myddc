package com.zxyy.yusx.myddc;

//import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.zxyy.yusx.myddc.mapper"})
public class MyddcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyddcApplication.class, args);
    }
}
