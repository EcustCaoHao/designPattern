package com.ecust.deepClone.xulieClone;

/**
 * @author: caohao
 * @date: 2023/11/30
 * @time: 19:55
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        Student student = new Student("h",34,new Dog("金毛","金色"));
        Student cloneStudent = (Student)student.deepClone();
        System.out.println(student);
        student.getDog().setColour("黄色");
        System.out.println(cloneStudent.getDog().getColour());
        System.out.println(student.getDog().getColour());
    }
}
