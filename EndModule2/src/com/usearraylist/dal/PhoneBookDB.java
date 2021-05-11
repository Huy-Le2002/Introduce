package com.usearraylist.dal;

import com.usearraylist.model.PhoneBook;

import java.io.*;
import java.util.ArrayList;

public class PhoneBookDB {
    public static ArrayList<PhoneBook> phoneBookArrayList = new ArrayList<>();
    public void saveFile() throws IOException {
        File file = new File("data/contacts.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("data/contacts.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (int i = 0; i < phoneBookArrayList.size(); i++) {
            bufferedOutputStream.write(phoneBookArrayList.get(i).toStringCSV().getBytes());
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
    public void readFile() throws IOException {
        File file = new File("data/contacts.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader("data/contacts.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            PhoneBook phoneBook = new PhoneBook(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
            phoneBookArrayList.add(phoneBook);
        }
    }

//    public boolean remove(String tel) {
//        return phoneBookArrayList.remove(tel);
//    }


}
