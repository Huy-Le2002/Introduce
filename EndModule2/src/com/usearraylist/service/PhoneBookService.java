package com.usearraylist.service;

import com.usearraylist.dal.PhoneBookDB;
import com.usearraylist.model.PhoneBook;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBookService {
    PhoneBookDB phoneBookDB = new PhoneBookDB();
    public void addPhoneBook(PhoneBook phoneBook) throws IOException {
        PhoneBookDB.phoneBookArrayList.add(phoneBook);
//        phoneBookDB.saveFile();
        System.out.println("Bạn vừa thêm khách hàng " + phoneBook.getName() + " thành công");
    }
    public void showListPhoneBook() {
        for (int i = 0; i < PhoneBookDB.phoneBookArrayList.size(); i++) {
            System.out.println(PhoneBookDB.phoneBookArrayList.get(i).toStringChoose1());
        }
    }
    public PhoneBook findByPhone(String phone) {
        for (PhoneBook phonebook: PhoneBookDB.phoneBookArrayList) {
            if (phonebook.getTel().equals(phone)) {
                return phonebook;
            }
        }
        return null;
    }
    public PhoneBook findByEmail(String email) {
        for (PhoneBook phonebook: PhoneBookDB.phoneBookArrayList) {
            if (phonebook.getEmail().equals(email)) {
                return phonebook;
            }
        }
        return null;
    }
    public void updateFile() throws IOException {
        phoneBookDB.saveFile();
    }
    public void loadFile() throws IOException {
        phoneBookDB.readFile();
    }

    public boolean checkEmail(String email){
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
    public PhoneBook findExists(String string){
        for (int i = 0; i < phoneBookDB.phoneBookArrayList.size(); i++) {
            if(phoneBookDB.phoneBookArrayList.get(i).getTel().equals(string) || phoneBookDB.phoneBookArrayList.get(i).getEmail().equals(string)){
                return phoneBookDB.phoneBookArrayList.get(i);
            }
        }
        return null;
    }
    public boolean checkPhoneNumber(String phoneNumber){
        String regex = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find();
    }

}
