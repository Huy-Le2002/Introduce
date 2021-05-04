package com.consolestudent.dal;

import com.consolestudent.model.ConsoleStudent;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ConsoleStudentDB {
    public static Map<Integer, ConsoleStudent> consoleStudentDBMap;
    public static int count;
    static {
        consoleStudentDBMap = new HashMap<>();
        count = 0;
    }

    public void saveFile() throws IOException {
        File file = new File("DataConsoleStudent.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("DataConsoleStudent.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (Map.Entry<Integer, ConsoleStudent> entry: consoleStudentDBMap.entrySet()) {
            bufferedOutputStream.write(entry.getValue().toStringCSV().getBytes());
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
    public void readFile() throws IOException {
        File file = new File("DataConsoleStudent.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader("DataConsoleStudent.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            ConsoleStudent consoleStudent = new ConsoleStudent(
                    arr[0],
                    Integer.parseInt(arr[1]),
                    Float.parseFloat(arr[3]),Float.parseFloat(arr[4]),Float.parseFloat(arr[5]),Float.parseFloat(arr[6]),Float.parseFloat(arr[7]));
            add(consoleStudent);
        }
    }

    public void add(ConsoleStudent consoleStudent) {
        count++;
        consoleStudent.setMaSV(count);
        consoleStudentDBMap.put(count,consoleStudent);
    }
    public boolean move(int maSV) {
        boolean rs = consoleStudentDBMap.remove(maSV) == null ? false : true;
        return rs;
    }
}
