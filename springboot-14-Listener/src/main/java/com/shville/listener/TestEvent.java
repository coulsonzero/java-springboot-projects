package com.shville.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class TestEvent extends ApplicationEvent {
    public TestEvent(Object source) {
        super(source);
    }
}
