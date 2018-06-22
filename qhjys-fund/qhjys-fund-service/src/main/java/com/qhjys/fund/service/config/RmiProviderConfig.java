package com.qhjys.fund.service.config;

import com.qhjys.fund.service.FundUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import javax.annotation.Resource;

@Configuration
public class RmiProviderConfig {

    //@Value("${qhjys.rmi.port}")
    private int port = 1111;

    @Resource
    private FundUserService fundUserService;

    @Bean
    public RmiServiceExporter fundUserServiceRmi() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(fundUserService);
        rmiServiceExporter.setServiceName("fundUserService");
        rmiServiceExporter.setServiceInterface(FundUserService.class);
        rmiServiceExporter.setRegistryPort(port);
        return rmiServiceExporter;
    }

}