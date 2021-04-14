package com.part7.demoabstractclass;

public class Test {
    public static void main(String[] args) {
        NhanVienFullTime nhanVienFullTime = new NhanVienFullTime("Huy",Configs.SEP,0);
        nhanVienFullTime.xuatThongTin();
        NhanVienFullTime nhanVienFullTime1 = new NhanVienFullTime("Hùng",Configs.LINH,0);
        nhanVienFullTime1.xuatThongTin();
        NhanVienPartTime nhanVienPartTime = new NhanVienPartTime("Hải",80);
        nhanVienPartTime.xuatThongTin();
    }
}
