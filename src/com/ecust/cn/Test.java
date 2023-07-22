package com.ecust.cn;

public class Test {

    public static void main(String[] args) {
        LanSingleton instance = LanSingleton.getInstance();
        LanSingleton instance1 = LanSingleton.getInstance();
        System.out.println(instance == instance1);
    }
}
