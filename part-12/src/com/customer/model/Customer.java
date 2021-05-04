package com.customer.model;

public class Customer {
    public String name;
    public String address;
    public String sdt;
    public String email;
    public String gender;
    public int soDonHang;

    public Customer(String name, String address, String sdt, String email, String gender) {
        this.name = name;
        this.address = address;
        this.sdt = sdt;
        this.email = email;
        this.gender = gender;
    }

    public Customer(String name, String address, String sdt, String email, String gender, int soDonHang) {
        this.name = name;
        this.address = address;
        this.sdt = sdt;
        this.email = email;
        this.gender = gender;
        this.soDonHang = soDonHang;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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

    public int getSoDonHang() {
        return soDonHang;
    }

    public void setSoDonHang(int soDonHang) {
        this.soDonHang = soDonHang;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", soDonHang=" + soDonHang +
                '}';
    }
    public String toStringMid() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public String toStringCSV() {
        return name + "," + address + "," + sdt + "," + email + "," + gender + "," + soDonHang + "\n";
    }
}
