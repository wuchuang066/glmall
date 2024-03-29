package com.zpark.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//通用mapper扫描包
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zpark.user.mapper")
public class GlmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GlmallUserApplication.class, args);
    }
}
