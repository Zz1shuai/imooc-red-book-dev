package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Create by 猪小帅
 * @date 2023/6/6 23:05
 * @mood happy
 */

@SpringBootApplication
@MapperScan(basePackages = "com.imooc.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
