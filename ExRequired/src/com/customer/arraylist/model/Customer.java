package com.customer.arraylist.model;

import java.util.Collection;

public class Customer {
    private int rollNo;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String gender;
    private int oderNumber;

    public Customer() {
    }

    public Customer(String name, String address, String phoneNumber, String email, String gender) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    public Customer(int rollNo, String name, String address, String phoneNumber, String email, String gender, int oderNumber) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.oderNumber = oderNumber;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getOderNumber() {
        return oderNumber;
    }

    public void setOderNumber(int oderNumber) {
        this.oderNumber = oderNumber;
    }
    public int compareTo(Customer customer) {
        return this.getName().compareTo(customer.getName());
    }
    @Override
    public String toString() {
        return rollNo +
                ". name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", oderNumber=" + oderNumber;
    }
    public String toStringSearch() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public String toStringCSV() {
        return rollNo +
                "," + name +
                "," + address +
                "," + phoneNumber +
                "," + email +
                "," + gender +
                "," + oderNumber + "\n";
    }
}
