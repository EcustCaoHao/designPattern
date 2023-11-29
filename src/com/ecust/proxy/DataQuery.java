package com.ecust.proxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 19:59
 */
//这是一个查询数据的接口
public interface DataQuery {
    //在没有缓存代理的情况下都需要执行这个方法从数据库中查询数据
    String query(String queryKey);
}
