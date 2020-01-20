package com.cjb.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cjb.api.OrderApi;
import com.cjb.api.WarehouseApi;
import io.seata.core.context.RootContext;
import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

@Service
public class BusinessTCCServiceImpl implements BusinessTCCService {

    @Reference(version = "1.0.0")
    public OrderApi orderApi;

    @Reference(version = "1.0.0")
    public WarehouseApi warehouseApi;


    @Override
    public boolean testTCC(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("TCC全局事务， prepare, xid:" + xid +  ")");
        orderApi.test();
        warehouseApi.test();
        return true;
    }

    @Override
    public boolean commit(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("testTCC commit, xid:" + xid + ")");
        return true;
    }

    @Override
    public boolean rollback(BusinessActionContext actionContext) {
        String xid = actionContext.getXid();
        System.out.println("testTCC rollback, xid:" + xid + ")");
        return true;
    }

}
