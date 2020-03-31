package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

@Component("ryTask")
public class Test {
    public void task(String params)
    {
        System.out.println("执行有参方法：" + params);
    }
}
