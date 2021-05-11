package com.customer.arraylist.service;

import com.customer.arraylist.dal.CustomerDB;
import com.customer.arraylist.model.Customer;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class CustomerService {
    CustomerDB customerDB = new CustomerDB();
    public void addCustomer(Customer customer) throws IOException {
//        for (int i = 0; i < CustomerDB.customerArrayList.size(); i++) {
//            if (CustomerDB.customerArrayList.get(i).getPhoneNumber().equals(customer.getPhoneNumber())
//                || CustomerDB.customerArrayList.get(i).getEmail().equals(customer.getEmail())) {
//                System.out.println("Khách hàng đã tồn tại");
//                return;
//            }
//        }
        customerDB.add(customer);
        customerDB.saveFile();
        System.out.println("Bạn vừa thêm KH" + customer.getName() + "thành công");
    }
    public void loadFile() throws IOException {
        customerDB.readFile();
    }
    public Customer findByPhoneNumber(String phoneNumber) {
        for (Customer customer: CustomerDB.customerArrayList) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                return customer;
            }
        } return null;
    }
    public Customer findByEmail(String email) {
        for (Customer customer: CustomerDB.customerArrayList) {
            if (customer.getEmail().equals(email)) {
                return customer;
            }
        } return null;
    }

    public Customer creaseBill(String phoneNumber) {
        for (Customer customer: CustomerDB.customerArrayList) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                customer.setOderNumber(customer.getOderNumber()+1);
                return customer;
            }
        }
        return null;
    }
    public void sortName() {
        CustomerDB.customerArrayList.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getName().compareTo(o2.getName()) > 0) {
                    return 1;
                } else if (o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                } else return 0;
            }
        });
    }


    public void print() {
        for (int i = 0; i < CustomerDB.customerArrayList.size(); i++) {
            System.out.println(CustomerDB.customerArrayList.get(i).toString());
        }
    }
}
