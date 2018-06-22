package com.qhjys.fund.task.schedule;

import com.qhjys.fund.service.FundUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class ServiceTask {

    @Resource
    private FundUserService fundUserService;

    @Scheduled(cron = "0 0 19 * * *")
    public void sendNoticeForExposure() {

    }
}
