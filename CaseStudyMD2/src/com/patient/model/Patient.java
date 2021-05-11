package com.patient.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String phoneNumber;
    private String homeTown;
    private String dateIn;
    private String dateOut;
    private int numberOfMeals=0;
    private long pay=0;

    public Patient(int id, String name, int age, String gender, String phoneNumber, String homeTown) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.homeTown = homeTown;
    }

    public Patient(int id, String name, int age, String gender, String phoneNumber, String homeTown, String dateIn, String dateOut, int numberOfMeals, long pay) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.homeTown = homeTown;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.numberOfMeals = numberOfMeals;
        this.pay = pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public int getNumberOfMeals() {
        return numberOfMeals;
    }

    public void setNumberOfMeals(int numberOfMeals) {
        this.numberOfMeals = numberOfMeals;
    }

    public long getPay() {
        return calcBill();
    }

    final int MONEYFORMEALS = 15000;
    final int MONEYTOSTAY = 200000;
    public long calcBill() {
        return ((long) MONEYFORMEALS * getNumberOfMeals()) + (calcDay()*MONEYTOSTAY);
    }
    public long calcDay() {
        try{
            DateFormat format = new SimpleDateFormat("d/M/yyyy");
            Date date1 = format.parse(getDateIn());
            Date date2 = format.parse(getDateOut());
            long diffMilis = date2.getTime() - date1.getTime();
            long perDay = 1000 * 60 * 60 * 24;
            long days = diffMilis / perDay;
            return days + 1;
        }catch(Exception e){
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", dateIn='" + dateIn + '\'' +
                ", dateOut='" + dateOut + '\'' +
                ", numberOfMeals=" + numberOfMeals +
                ", pay=" + this.getPay() +
                '}';
    }
    public String toStringInfo() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", homeTown=" + homeTown;
    }

    public String toStringCSV() {
        return id +
                "," + name +
                "," + age +
                "," + gender +
                "," + phoneNumber +
                "," + homeTown +
                "," + dateIn +
                "," + dateOut +
                "," + numberOfMeals+
                "," + getPay() + "\n";
    }

}
