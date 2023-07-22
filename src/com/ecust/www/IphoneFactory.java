package com.ecust.www;

/**
 * 生产苹果手机的工厂
 */
public class IphoneFactory implements PhoneFactory{
    @Override
    public Phone create() {
        return new Iphone();
    }

}
