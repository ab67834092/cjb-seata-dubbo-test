package com.cjb.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cjb.api.OrderApi;
import com.cjb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0",protocol = "${dubbo.protocol.id}",
        application = "${dubbo.application.id}",registry = "${dubbo.registry.id}",
        timeout = 3000)
public class OrderApiImpl implements OrderApi {

    @Autowired
    OrderService orderService;

    @Override
    public void test() {
        orderService.test();
    }
}
