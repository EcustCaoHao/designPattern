package com.ecust.cn;

/**
 * 可以使用内部类的方式来实现单例
 * 将创建对象的工作交给内部类
 */
public class InterSingleton {


    private InterSingleton(){};

    public static InterSingleton getInstance(){
        return CreateInterSingleton.instance;
    }


    private static class CreateInterSingleton{
        static InterSingleton instance = new InterSingleton();
    }
}
