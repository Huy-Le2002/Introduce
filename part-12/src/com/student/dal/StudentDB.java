package com.student.dal;

import com.student.model.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StudentDB {
    public static Map<Integer, Student> studentMapList;
    public static int count;
    static {
        studentMapList = new HashMap<>();
        count = 0;
    }
    public void saveFile() throws IOException {
        File file = new File("Data.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("Data.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (Map.Entry<Integer,Student> entry: studentMapList.entrySet()) {
            bufferedOutputStream.write(entry.getValue().toStringCSV().getBytes());
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
    public void add(Student student) {
        count++;
        student.setId(count);
        studentMapList.put(count,student);
    }
    public void readFile() throws IOException {
        File file = new File("Data.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader("Data.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Student st = new Student(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3],arr[4]);
            add(st);
        }
    }
    public boolean remove(int id) {
        boolean rs = studentMapList.remove(id) == null ? false : true;
        return rs;
    }
}