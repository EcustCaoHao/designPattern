package com.ecust.securityProxy;


/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:08
 */
//这是真正查询敏感数据的方法
public class SensitiveDataQueryImpl implements SensitiveDataQuery {

    @Override
    public String queryData(String userId) {
        return userId+"可以查询敏感数据";
    }
}
