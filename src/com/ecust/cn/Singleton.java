package com.ecust.cn;

public class Singleton {

    //1.构造方法私有化
    private Singleton(){};

    //3.需要一个已经实例化好的对象
    private static final Singleton instance = new Singleton();

    //2.提供一个供外部访问的方法
    public static Singleton getSingleInstance(){
        return instance;
    }


}


