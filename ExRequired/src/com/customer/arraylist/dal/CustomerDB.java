package com.customer.arraylist.dal;

import com.customer.arraylist.model.Customer;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CustomerDB {
    public static ArrayList<Customer> customerArrayList;
    public static int count;
    static {
        customerArrayList = new ArrayList<>();
        count = 0;
    }

    public void saveFile() throws IOException {
        File file = new File("UseArrayListCutomer.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("UseArrayListCutomer.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (int i = 0; i < customerArrayList.size(); i++) {
            bufferedOutputStream.write(customerArrayList.get(i).toStringCSV().getBytes());
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
    }
    public void readFile() throws IOException {
        File file = new File("UseArrayListCutomer.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader("UseArrayListCutomer.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Customer customer = new Customer(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],Integer.parseInt(arr[6]));
            add(customer);
        }
    }

    public void add(Customer customer) {
        count++;
        customer.setRollNo(count);
        customerArrayList.add(customer);
    }


}
