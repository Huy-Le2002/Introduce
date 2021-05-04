package com.consolestudent.model;

import java.text.DecimalFormat;

public class ConsoleStudent {
    public String name;
    public int maSV;
    public String monhoc = "Toán";
    public float heso1 = 0, heso2 = 0 ,heso3 = 0,hesoo4 = 0;
    public float tongket;

    public ConsoleStudent() {
    }

    public ConsoleStudent(String name,int maSV) {
        this.name = name;
        this.maSV = maSV;
    }

    public ConsoleStudent(String name, int maSV,  float heso1, float heso2, float heso3, float hesoo4, float tongket) {
        this.name = name;
        this.maSV = maSV;
        this.heso1 = heso1;
        this.heso2 = heso2;
        this.heso3 = heso3;
        this.hesoo4 = hesoo4;
        this.tongket = tongket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public float getHeso1() {
        return heso1;
    }

    public void setHeso1(float heso1) {
        this.heso1 = heso1;
    }

    public float getHeso2() {
        return heso2;
    }

    public void setHeso2(float heso2) {
        this.heso2 = heso2;
    }

    public float getHeso3() {
        return heso3;
    }

    public void setHeso3(float heso3) {
        this.heso3 = heso3;
    }

    public float getHesoo4() {
        return hesoo4;
    }

    public void setHesoo4(float hesoo4) {
        this.hesoo4 = hesoo4;
    }

    public float getTongket() {
        return this.calcAvg();
    }

    private String formatPoint(float point){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return df.format(point);
    }

    public float calcAvg(){
        return (this.getHeso1() + this.getHeso2() + (this.getHeso3() * 2) + (this.getHesoo4() * 3)) / 7;
    }

    @Override
    public String toString() {

        return "ConsoleStudent{" +
                "name='" + name + '\'' +
                ", maSV=" + maSV +
                ", monhoc='" + monhoc + '\'' +
                ", heso1=" + formatPoint(heso1) +
                ", heso2=" + heso2 +
                ", heso3=" + heso3 +
                ", hesoo4=" + hesoo4 +
                ", tongket=" + formatPoint(this.getTongket()) +
                '}';
    }
    public String toStringCSV() {
        return name + "," + maSV + "," + monhoc + "," + heso1 + "," + heso2 + "," + heso3 + "," + hesoo4 + "," + tongket + "\n";
    }
    public String toStringStudent() {
        return "ConsoleStudent{" +
                "name='" + name + '\'' +
                ", maSV=" + maSV +
                '}';
    }

}
