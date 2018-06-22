package com.qhjys.fund.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan("com.qhjys.fund")
@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {
        log.info("--------------task is starting-------------");
        SpringApplication.run(TaskApplication.class, args);
        log.info("--------------task is started-------------");
    }
}
