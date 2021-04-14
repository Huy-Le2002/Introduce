package com.part7.demoabstractclass;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    protected String loaiNhanVien() {
        return "Nhân viên Part time";
    }

    @Override
    public void tinhLuong() {
        this.luong = Configs.LUONGGIO*this.gioLamViec;
    }
}
