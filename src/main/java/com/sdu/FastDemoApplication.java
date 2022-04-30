package com.sdu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sdu.dao")
public class FastDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastDemoApplication.class, args);
    }

}
