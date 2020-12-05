package com.ruoan.secshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ruoan
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ruoan.secshopping.mapper")
public class SpringbootSecShoppingApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecShoppingApplication.class, args);
    }
}
