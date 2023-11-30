package com.ecust.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:46
 */
//代理类需要实现InvocationHandler方法
public class CacheInvocationHandler implements InvocationHandler {

    private final DataQuery dataQuery;
    private HashMap<String,String> hashMap;

    public CacheInvocationHandler(){
        this.dataQuery = new DataQueryImpl();
        this.hashMap = new HashMap<>();
    }
    /**
     *
     * @param proxy proxy
     * @param method 被代理对象的方法
     * @param args 被代理对象的参数
     * @return 方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理对象的所有方法都会走个里面 所以我只对query()方法进行增强
        if (method.getName().equals("query")){
            if (hashMap.containsKey((String) args[0])){
                System.out.println("命中了缓存");
                return hashMap.get((String) args[0]);
            }
            else{
                System.out.println("从数据库查询");
                String result = (String)method.invoke(dataQuery, args);
                hashMap.put(args[0].toString(),result);
                return result;
            }
        }
        //如果不是query方法直接执行原方法
        return method.invoke(dataQuery,args);
    }
}
