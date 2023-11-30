package com.ecust.prototype;

/**
 * @author: caohao
 * @date: 2023/11/30
 * @time: 15:59
 */
//浅克隆
public class TestQinClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("cao",22,new Address("江苏","常州"));
        //Person和clonePerson是两个对象
        Person clonePerson = (Person)person.clone();
        //但是里面的Address对象只有一个 所以clonePerson修改了
        clonePerson.getAddress().setPro("浙江");
        //打印出来的person的也修改了
        System.out.println(person.getAddress());
    }
}
