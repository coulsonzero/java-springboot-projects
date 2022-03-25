package com.shville.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestAsyncService {
    @Async
    public void testAsync() {
        try {
            Thread.sleep(3000);
            System.out.println("This is a 异步任务");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
