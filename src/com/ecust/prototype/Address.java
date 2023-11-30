package com.ecust.prototype;

/**
 * @author: caohao
 * @date: 2023/11/30
 * @time: 15:51
 */
public class Address {

    private String pro;
    private String city;

    public Address(){

    }

    public String getPro() {
        return pro;
    }

    public String getCity() {
        return city;
    }

    public Address(String pro, String city){
        this.pro = pro;
        this.city = city;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pro='" + pro + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
