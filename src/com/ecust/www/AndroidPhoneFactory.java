package com.ecust.www;

/**
 * 生产安卓手机的工厂
 */
public class AndroidPhoneFactory implements PhoneFactory{
    @Override
    public Phone create() {
        return new AndroidPhone();
    }

}
