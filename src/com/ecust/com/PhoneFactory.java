package com.ecust.com;

/**
 * 生产手机的工厂 可以用来根据客户的要求生产苹果还是安卓
 */
public class PhoneFactory {

    public static Phone getPhone(String type){
        if ("iphone".equals(type))
            return new Iphone();
        else if ("android".equals(type))
            return new AndroidPhone();
        return null;
    }

}
