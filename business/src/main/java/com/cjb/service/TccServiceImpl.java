package com.cjb.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cjb.api.OrderApi;
import com.cjb.api.WarehouseApi;
import io.seata.core.context.RootContext;
import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TccServiceImpl implements TccService {

    @Autowired
    BusinessService businessService;


    @Override
    @GlobalTransactional
    public void testTCC() {
        boolean result = businessService.testTCC(null);
        System.out.println("testTCC result:"+result);
    }
}
