package com.example.BeanApplicationContext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class VnEngine implements Engine {
    @Override
    public void run() {
        System.out.println("VietNam Engine has bad quality");
    }
}
