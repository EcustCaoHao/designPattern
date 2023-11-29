package com.ecust.securityProxy;

import java.util.Arrays;
import java.util.List;

/**
 * @author: caohao
 * @date: 2023/11/29
 * @time: 22:10
 */
//这个类用来模拟已经授权的用户列表
public class UserAuthenticator {
    //代表已经授权的用户
    private List<String> userIds;

    public UserAuthenticator(){
        userIds = Arrays.asList("user1","user2","user3");
    }

    /**
     * 判断是否是授权的用户
     * @param userId 用户id
     * @return true代表有权限 false代表没有权限
     */
    public boolean hasPermission(String userId){
        return userIds.contains(userId);
    }
}
