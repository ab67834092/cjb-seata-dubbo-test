package com.cjb.service;

import com.cjb.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    @Transactional
    public void test(){
        //下订单
        orderDao.test("order:"+UUID.randomUUID().toString());

    }
}
