package com.ecust.com;

/**
 * 手机有很多款 安卓手机也是其中一款
 */
public class AndroidPhone implements Phone{
    @Override
    public void call() {
        System.out.println("安卓手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("安卓手机发短信");
    }


}
