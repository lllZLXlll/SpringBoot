package com.qhjys.fund.salesman;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableSwagger2
@ComponentScan("com.qhjys.fund")
@SpringBootApplication
public class SalesmanApplication {

    public static void main(String[] args) {
        log.info("--------------salesman is starting-------------");
        SpringApplication.run(SalesmanApplication.class, args);
        log.info("--------------salesman is started-------------");
    }
}
