package com.ecust.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:54
 */
public class Main {
    public static void main(String[] args) {
        //1.被代理类的类加载器
        ClassLoader classLoader = DataQueryImpl.class.getClassLoader();
        //2.代理类需要实现的接口数组
        Class[] interfaces = new Class[]{DataQuery.class};
        //3.InvocationHandler
        CacheInvocationHandler cacheInvocationHandler = new CacheInvocationHandler();
        //4.代理对象
        DataQuery dataQuery = (DataQuery)Proxy.newProxyInstance(classLoader, interfaces, cacheInvocationHandler);
        dataQuery.query("String");
        dataQuery.query("String");
        dataQuery.queryAll("String");
    }
}
