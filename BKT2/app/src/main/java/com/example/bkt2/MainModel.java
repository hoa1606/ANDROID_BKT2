package com.example.bkt2;

public class MainModel {
    String Ten_KH, Ten_thuong_goi,Dat_tinh,Mau_sac,Cong_dung,Duoc_tinh,Chu_y,Hinh_anh;

    MainModel(){

    }

    public MainModel(String ten_KH, String ten_thuong_goi, String dat_tinh, String mau_sac, String cong_dung, String duoc_tinh, String chu_y, String hinh_anh) {
        Ten_KH = ten_KH;
        Ten_thuong_goi = ten_thuong_goi;
        Dat_tinh = dat_tinh;
        Mau_sac = mau_sac;
        Cong_dung = cong_dung;
        Duoc_tinh = duoc_tinh;
        Chu_y = chu_y;
        Hinh_anh = hinh_anh;
    }


    public String getTen_KH() {
        return Ten_KH;
    }

    public void setTen_KH(String ten_KH) {
        Ten_KH = ten_KH;
    }

    public String getTen_thuong_goi() {
        return Ten_thuong_goi;
    }

    public void setTen_thuong_goi(String ten_thuong_goi) {
        Ten_thuong_goi = ten_thuong_goi;
    }

    public String getDat_tinh() {
        return Dat_tinh;
    }

    public void setDat_tinh(String dat_tinh) {
        Dat_tinh = dat_tinh;
    }

    public String getMau_sac() {
        return Mau_sac;
    }

    public void setMau_sac(String mau_sac) {
        Mau_sac = mau_sac;
    }

    public String getCong_dung() {
        return Cong_dung;
    }

    public void setCong_dung(String cong_dung) {
        Cong_dung = cong_dung;
    }

    public String getDuoc_tinh() {
        return Duoc_tinh;
    }

    public void setDuoc_tinh(String duoc_tinh) {
        Duoc_tinh = duoc_tinh;
    }

    public String getChu_y() {
        return Chu_y;
    }

    public void setChu_y(String chu_y) {
        Chu_y = chu_y;
    }

    public String getHinh_anh() {
        return Hinh_anh;
    }

    public void setHinh_anh(String hinh_anh) {
        Hinh_anh = hinh_anh;
    }
}
