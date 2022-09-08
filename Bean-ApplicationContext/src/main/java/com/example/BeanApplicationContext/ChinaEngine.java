package com.example.BeanApplicationContext;

import org.springframework.stereotype.Component;

@Component
public class ChinaEngine implements Engine {
    @Override
    public void run() {
        System.out.println("China Engine has good performance and very cheap");
    }
}
