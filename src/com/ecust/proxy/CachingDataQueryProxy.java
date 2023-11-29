package com.ecust.proxy;


import java.util.HashMap;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 20:04
 */
//这个代理类和被代理类一样 需要实现同一个接口 DataQuery
public class CachingDataQueryProxy implements DataQuery{
    //实际需要调用被代理类的方法
    private DataQuery dataQuery;
    //用作缓存队列
    private HashMap<String,String> hashMap;

    public CachingDataQueryProxy(DataQuery dataQuery){
        this.dataQuery = dataQuery;
        this.hashMap = new HashMap<>();
    }
    //这里就是可以做方法的增强了
    @Override
    public String query(String queryKey) {
        //1.先从缓存里面查询
        String result = hashMap.get(queryKey);
        //2.如果缓存里面没有的话
        if (result == null){
            //2.1没有就从数据库里查询
            result = dataQuery.query(queryKey);
            //2.2写进缓存
            hashMap.put(queryKey,result);
            System.out.println("从数据库中查询");
        }else{
            System.out.println("从缓存里面查询");
        }
        return result;
    }
}
