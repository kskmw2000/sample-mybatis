package me.angeloper.samplemybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.angeloper.samplemybatis.repository")
public class SampleMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleMybatisApplication.class, args);
    }

}
