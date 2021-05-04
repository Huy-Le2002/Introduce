package com.customer.service;

import com.customer.dal.CustomerDB;
import com.customer.model.Customer;

import java.io.IOException;
import java.util.Map;

public class CustomerService {
    CustomerDB customerDB = new CustomerDB();
    public void addCustomer(Customer customer) throws IOException {
        customerDB.add(customer);
        customerDB.saveFile();
    }

    public Customer find(String sdt) {
        return CustomerDB.customerMapList.get(sdt);
    }
    public void increaseBill() throws IOException {
        customerDB.saveFile();
    }
    public void loadDB() throws IOException {
        customerDB.readFile();
    }
    public void print() {
        for (Map.Entry<String, Customer> entry: CustomerDB.customerMapList.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

}
