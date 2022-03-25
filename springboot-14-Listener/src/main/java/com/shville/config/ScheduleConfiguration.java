package com.shville.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Configuration
public class ScheduleConfiguration {

    // 此后每2h执行一次，固定分钟设置为30分： 18：30，20：30，22：30
    @Scheduled(cron = "0 30 */2 * * ?")
    public void test3() {
        System.out.println("我是定时任务3: " + new Date());
    }

    // 3s
    @Scheduled(fixedRate = 3000)
    public void test() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是定时任务1: " + new Date());
    }


    // 4s
    @Scheduled(fixedDelay = 3000)
    public void test2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是定时任务2: " + new Date());
    }
}
