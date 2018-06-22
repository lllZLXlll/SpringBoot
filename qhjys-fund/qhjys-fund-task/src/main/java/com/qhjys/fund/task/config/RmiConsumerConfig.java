package com.qhjys.fund.task.config;

import com.qhjys.fund.service.FundUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class RmiConsumerConfig {

    //@Value("${qhjys.rmi.host}")
    private String host = "localhost";

    //@Value("${qhjys.rmi.port}")
    private int port = 1111;

    @Bean
    public RmiProxyFactoryBean fundUserServiceRmi() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://" + host + ":" + port + "/fundUserService");
        rmiProxyFactoryBean.setServiceInterface(FundUserService.class);
        return rmiProxyFactoryBean;
    }

}
