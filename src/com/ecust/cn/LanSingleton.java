package com.ecust.cn;

public class LanSingleton {

    //1.构造方法私有化
    public LanSingleton(){};

    //3.定义这样一个实例
    private volatile static LanSingleton instance;

    //2.对外提供可以访问的一个方法
    public static LanSingleton getInstance(){
            if (instance == null){
                synchronized (Singleton.class){
                    if (instance == null) {
                        instance = new LanSingleton();
                    }
                }
            }
        return instance;
    }

}
