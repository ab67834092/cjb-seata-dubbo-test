package com.cjb.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.LocalTCC;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

@LocalTCC
public interface BusinessService {

    //模拟seata AT模式
    void testAT();

    //模拟tcc
    @TwoPhaseBusinessAction(name = "testTCC", commitMethod = "commit", rollbackMethod = "rollback")
    boolean testTCC(BusinessActionContext actionContext);

    /**
     * Commit boolean.
     *
     * @param actionContext the action context
     * @return the boolean
     */
    boolean commit(BusinessActionContext actionContext);

    /**
     * Rollback boolean.
     *
     * @param actionContext the action context
     * @return the boolean
     */
    boolean rollback(BusinessActionContext actionContext);
}
