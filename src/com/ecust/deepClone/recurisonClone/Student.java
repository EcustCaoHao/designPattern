package com.ecust.deepClone.recurisonClone;

/**
 * @author: caohao
 * @date: 2023/11/30
 * @time: 19:46
 */
public class Student implements Cloneable{

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //使用浅拷贝拷过来基本属性
        Student cloneStudent = (Student) super.clone();
        Dog dog = cloneStudent.getDog();
        //对于引用类型的属性重新创建
        Dog cloneDog = new Dog(dog.getType(),dog.getColour());
        cloneStudent.setDog(cloneDog);
        return cloneStudent;
    }
}
