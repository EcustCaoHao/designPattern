package com.ecust.www;

public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new AndroidPhoneFactory();
        Phone phone = phoneFactory.create();
        phone.call();
        phone.sendMessage();
    }
}
