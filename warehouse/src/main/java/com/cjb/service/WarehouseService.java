package com.cjb.service;

import com.cjb.dao.WarehouseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WarehouseService {

    @Autowired
    WarehouseDao warehouseDao;

    @Transactional
    public void test(){
        //扣减库存
        warehouseDao.test();
    }
}
