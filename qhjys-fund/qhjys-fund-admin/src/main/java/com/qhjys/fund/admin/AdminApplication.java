package com.qhjys.fund.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableSwagger2
@ComponentScan("com.qhjys.fund")
@SpringBootApplication
public class AdminApplication {

    public static void main(String[] args) {
        log.info("--------------admin is starting-------------");
        SpringApplication.run(AdminApplication.class, args);
        log.info("--------------admin is started-------------");
    }
}
