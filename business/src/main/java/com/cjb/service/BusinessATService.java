package com.cjb.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.LocalTCC;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

public interface BusinessATService {

    //模拟seata AT模式
    public void testAT();

}
