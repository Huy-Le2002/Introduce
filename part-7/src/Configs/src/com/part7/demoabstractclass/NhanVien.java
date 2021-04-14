package com.part7.demoabstractclass;

public abstract class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    protected abstract String loaiNhanVien();
    public abstract void tinhLuong();
    public void xuatThongTin() {
        this.tinhLuong();
        System.out.println("Ten : " + this.ten + " Loai nhan vien : " +this.loaiNhanVien() + " luong " + this.luong ) ;
    }

}
