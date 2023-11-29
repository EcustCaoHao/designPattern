package com.ecust.securityProxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:14
 */
//被代理类除了实现代理类的功能外需要进行权限的审查
public class SecurityProxy implements SensitiveDataQuery{
    //用来实现代理类的功能
    private SensitiveDataQuery sensitiveDataQuery;
    //用来进行权限校验
    private UserAuthenticator userAuthenticator;

    public SecurityProxy(SensitiveDataQuery sensitiveDataQuery,UserAuthenticator userAuthenticator){
        this.sensitiveDataQuery = sensitiveDataQuery;
        this.userAuthenticator = userAuthenticator;
    }

    @Override
    public String queryData(String userId) {
        //如果有权限
        if (userAuthenticator.hasPermission(userId))
            //调用被代理类里面的方法
            return sensitiveDataQuery.queryData(userId);
        //没有权限就不能访问被代理类的方法
        else
            return "Access Denied: Insufficient permission for " + userId;
    }
}
