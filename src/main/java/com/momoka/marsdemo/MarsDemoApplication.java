package com.momoka.marsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.momoka.marsdemo.dao")
public class MarsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarsDemoApplication.class, args);
    }

}
