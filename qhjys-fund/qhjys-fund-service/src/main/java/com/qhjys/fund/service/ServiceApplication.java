package com.qhjys.fund.service;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@MapperScan("com.qhjys.fund.service.mapper")
@ComponentScan("com.qhjys.fund")
@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) {
        log.info("--------------service is starting-------------");
        SpringApplication.run(ServiceApplication.class, args);
        log.info("--------------service is started-------------");
    }

}
