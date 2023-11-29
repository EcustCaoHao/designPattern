package com.ecust.securityProxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:06
 */
//这是一个敏感数据的查询接口 只有具有特定权限的用户才能访问
public interface SensitiveDataQuery {

    String queryData(String userId);

}
