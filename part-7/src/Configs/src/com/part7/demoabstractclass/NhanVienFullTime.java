package com.part7.demoabstractclass;

public class NhanVienFullTime extends NhanVien{
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(String ten,int loaiChucVu,int ngayLamThem) {
        super(ten);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    @Override
    protected String loaiNhanVien() {
        return loaiChucVu == Configs.SEP ? "FULLTIMESEP" : "NVFULLTIME";
    }

    @Override
    public void tinhLuong() {
        switch (this.loaiChucVu) {
            case Configs.SEP: {
                this.luong = Configs.LUONGSEP + this.ngayLamThem*Configs.LUONGLAMTHEM;
                break;
            }
            case Configs.LINH: {
                this.luong = Configs.LUONGLINH + this.ngayLamThem*Configs.LUONGLAMTHEM;
                break;
            }

        }
    }
}
