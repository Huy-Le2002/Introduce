package com.customer.dal;

import com.customer.model.Customer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CustomerDB {
   public static Map<String, Customer> customerMapList;
   static {
       customerMapList = new HashMap<>();
   }
   public void saveFile() throws IOException {
       File file = new File("DataCustomer.csv");
       if (!file.exists()) {
           file.createNewFile();
       }
       FileOutputStream fileOutputStream = new FileOutputStream("DataCustomer.csv");
       BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
       for (Map.Entry<String, Customer> entry: customerMapList.entrySet()) {
           bufferedOutputStream.write(entry.getValue().toStringCSV().getBytes());
       }
       bufferedOutputStream.flush();
       bufferedOutputStream.close();
       fileOutputStream.close();
   }
   public void readFile() throws IOException {
       File file = new File("DataCustomer.csv");
       if (!file.exists()) {
           file.createNewFile();
       }
       FileReader fileReader = new  FileReader("DataCustomer.csv");
       BufferedReader bufferedReader = new BufferedReader(fileReader);
       String line;
       while ((line = bufferedReader.readLine()) != null) {
           String[] arr = line.split(",");
           Customer customer = new Customer(arr[0],arr[1],arr[2],arr[3],arr[4],Integer.parseInt(arr[5]));
           add(customer);
       }
   }
    public void add(Customer customer) {
       customerMapList.put(customer.getSdt(),customer);
    }
}
