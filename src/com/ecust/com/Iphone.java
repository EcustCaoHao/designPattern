package com.ecust.com;

/**
 * 手机有很多款 苹果是其中一款
 */
public class Iphone implements Phone{
    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("苹果手机法发短信");
    }

}
