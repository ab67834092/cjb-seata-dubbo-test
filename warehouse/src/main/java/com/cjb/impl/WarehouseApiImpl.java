package com.cjb.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cjb.api.WarehouseApi;
import com.cjb.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0",protocol = "${dubbo.protocol.id}",
        application = "${dubbo.application.id}",registry = "${dubbo.registry.id}",
        timeout = 3000)
public class WarehouseApiImpl implements WarehouseApi {

    @Autowired
    WarehouseService warehouseService;

    @Override
    public void test() {
        warehouseService.test();
    }
}
