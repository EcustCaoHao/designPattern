package com.ecust.jdkProxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:38
 */
//查询数据的接口
public interface DataQuery {

    String query(String queryKey);

    String queryAll(String queryKey);
}
