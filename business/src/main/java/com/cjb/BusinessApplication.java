package com.cjb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.cjb.service.TccService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubbo
public class BusinessApplication {

    static TccService tccService;

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BusinessApplication.class, args);
    }

}
