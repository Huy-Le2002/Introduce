package com.usearraylist.model;

public class PhoneBook {
    private String tel;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String dab;
    private String email;

    public PhoneBook() {
    }

    public PhoneBook(String tel, String group, String name, String gender, String address, String dab, String email) {
        this.tel = tel;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dab = dab;
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDab() {
        return dab;
    }

    public void setDab(String dab) {
        this.dab = dab;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "PhoneBook{" +
                "tel='" + tel + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dab='" + dab + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public String toStringChoose1() {
        return "PhoneBook{" +
                "tel='" + tel + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String toStringCSV() {
        return  tel +
                "," + group +
                "," + name +
                "," + gender +
                "," + address +
                "," + dab +
                "," + email + "\n";
    }
}
