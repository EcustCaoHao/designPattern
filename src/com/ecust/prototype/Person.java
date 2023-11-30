package com.ecust.prototype;

/**
 * @author: caohao
 * @date: 2023/11/30
 * @time: 15:50
 */
public class Person implements Cloneable{

    private String name;
    private int age;
    private Address address;

    public Person(){

    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
