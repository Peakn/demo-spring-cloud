package com.nelson.org;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @auther 1301913120@qq.com
 * @create 2019-06-20 15:18
 * @todo
 */
@SpringBootApplication
@MapperScan("com.nelson.org.mapper")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class);
    }
}
