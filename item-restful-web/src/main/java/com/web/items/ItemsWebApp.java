package com.web.items;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * springboot启动类
 */
@SpringBootApplication
@MapperScan("com.web.items.mapper")
public class ItemsWebApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemsWebApp.class,args);
    }
}
