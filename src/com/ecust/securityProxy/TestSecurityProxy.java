package com.ecust.securityProxy;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:21
 */
public class TestSecurityProxy {
    public static void main(String[] args) {
        SensitiveDataQuery sensitiveDataQuery = new SensitiveDataQueryImpl();
        UserAuthenticator userAuthenticator = new UserAuthenticator();
        SecurityProxy securityProxy = new SecurityProxy(sensitiveDataQuery,userAuthenticator);
        //有访问权限
        String userId1 = "user1";
        //没有访问权限
        String userId4 = "user4";
        System.out.println(securityProxy.queryData(userId1));
        System.out.println(securityProxy.queryData(userId4));
    }
}
