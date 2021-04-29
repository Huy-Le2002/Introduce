package com.student.presentation;

import com.student.dal.StudentDB;
import com.student.model.Student;
import com.student.service.StudentService;

import java.io.IOException;

public class Test Student {
    public static void main(String[] args) {
        StudentService st1 = new StudentService();
        StudentDB studentDB = new StudentDB();
        try {
            studentDB.readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        st1.print();
        Student han = new Student("Hân",21,0,"nữ");
        Student duong = new Student("Dương",27,0,"nam");
//        System.out.println("***********");
//        st1.add(han);
//        st1.print();
//        System.out.println("********");
//        st1.add(duong);
//        st1.add(han);
//        st1.remove(5);
//        st1.print();
        st1.add(han);
        st1.add(duong);
        try {
            studentDB.saveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
