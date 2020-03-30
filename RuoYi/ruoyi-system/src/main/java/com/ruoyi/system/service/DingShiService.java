package com.ruoyi.system.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DingShiService {
    @Scheduled(cron = "0 0/1 * * * ?")
    public void timerToNow(){
        System.out.println(new Date());
    }
}
