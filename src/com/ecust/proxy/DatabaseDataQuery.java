package com.ecust.proxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 20:01
 */
//这是一个真实的数据查询类，可以从数据库中查询数据
public class DatabaseDataQuery implements DataQuery{
    /**
     * 查询数据并将结果返回
     * @param queryKey 查询的key
     * @return 返回的结果
     */
    @Override
    public String query(String queryKey) {
        return "result from database"+queryKey;
    }
}
