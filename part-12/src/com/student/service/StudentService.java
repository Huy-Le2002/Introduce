package com.student.service;

import com.student.dal.StudentDB;
import com.student.model.Student;

import java.io.IOException;
import java.util.Map;

public class StudentService {
    public StudentDB studentDB= new StudentDB();
    public void add(Student student) throws IOException {
        studentDB.add(student);
        studentDB.saveFile();
    }
    public boolean remove(int id) throws IOException {
        boolean rs = studentDB.remove(id);
        studentDB.saveFile();
        return rs;
    }
    public Student find(int id) {
        return StudentDB.studentMapList.get(id);
    }
    public void loadData() throws IOException {
        studentDB.readFile();
    }
    public void updateFile() {
        try {
            studentDB.saveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        for (Map.Entry<Integer, Student> entry: StudentDB.studentMapList.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().toString());
        }
    }
}