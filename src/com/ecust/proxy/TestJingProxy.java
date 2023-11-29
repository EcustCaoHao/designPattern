package com.ecust.proxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 21:45
 */
public class TestJingProxy {

    //在客户端代码中使用缓存代理
    public static void main(String[] args) {
        DataQuery dataQuery = new DatabaseDataQuery();
        CachingDataQueryProxy cachingDataQueryProxy = new CachingDataQueryProxy(dataQuery);
        String key1 = "key1";
        String key2 = "key2";
        //从数据库查询
        System.out.println(cachingDataQueryProxy.query(key1));
        //从缓存里查询
        System.out.println(cachingDataQueryProxy.query(key1));
        //从数据库查询
        System.out.println(cachingDataQueryProxy.query(key2));
    }
}
