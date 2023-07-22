package com.ecust.com;

public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone iphone = PhoneFactory.getPhone("iphone");
        iphone.call();
        iphone.sendMessage();
    }
}
