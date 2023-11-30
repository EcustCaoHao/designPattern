package com.ecust.deepClone.xulieClone;

import java.io.*;

/**
 * @author: caohao
 * @date: 2023/11/30
 * @time: 19:46
 */
public class Student implements Serializable {

    private String name;
    private int age;
    private Dog dog;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog getDog() {
        return dog;
    }

    public Student(String name, int age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    //深度拷贝
    public Object deepClone() throws Exception{
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        //序列化是将对象写到流中便于传输，而反序列化则是把对象从流中读取出来。这里写到流中的对象则是原始对象的一个拷贝，因为原始对象还存在 JVM 中
        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }
}
