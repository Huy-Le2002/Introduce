package com.consolestudent.service;

import com.consolestudent.dal.ConsoleStudentDB;
import com.consolestudent.model.ConsoleStudent;

import java.io.IOException;
import java.util.Map;

public class ConsoleStudentService {
    ConsoleStudentDB consoleStudentDB = new ConsoleStudentDB();
    public void addStudent(ConsoleStudent consoleStudent) throws IOException {
        consoleStudentDB.add(consoleStudent);
        consoleStudentDB.saveFile();
    }
    public boolean removeStudent(int maSV) throws IOException {
        boolean rs = consoleStudentDB.move(maSV);
        consoleStudentDB.saveFile();
        return rs;
    }
    public void loadFile() throws IOException {
        consoleStudentDB.readFile();
    }

    public ConsoleStudent findStudent(int maSV) {
        return ConsoleStudentDB.consoleStudentDBMap.get(maSV);
    }
    public void updateFile() {
        try {
            consoleStudentDB.saveFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print() {
        for (Map.Entry<Integer, ConsoleStudent> entry: ConsoleStudentDB.consoleStudentDBMap.entrySet()) {
            System.out.println(entry.getKey() + "***" + entry.getValue().toString());
        }
    }
    public void printStudent() {
        for (Map.Entry<Integer, ConsoleStudent> entry: ConsoleStudentDB.consoleStudentDBMap.entrySet()) {
            System.out.println(entry.getKey() + "***" + entry.getValue().toStringStudent());
        }
    }
}
