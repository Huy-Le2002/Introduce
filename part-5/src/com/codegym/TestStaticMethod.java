package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Huy");
        s1.display();
//        System.out.println(s1.change());
    }

}
