package com.ecust.jdkProxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:40
 */
//被代理类
public class DataQueryImpl implements DataQuery{

    @Override
    public String query(String queryKey) {
        System.out.println("正在从数据库中查数据");
        return "result";
    }

    @Override
    public String queryAll(String queryKey) {
        System.out.println("正在从数据库中查数据");
        return "All results";
    }
}
