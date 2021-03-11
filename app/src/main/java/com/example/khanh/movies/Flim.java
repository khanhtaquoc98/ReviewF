package com.example.khanh.movies;

public class Flim {

    private String TenPhim;
    private String DiemPhim;
    private int imgPhim;
    private String KeyYoutube;
    private String ThoiLuong;
    private String GioiThieu;
    private String DaoDien;
    private String DienVien;
    private String TheLoai;
    private String KhoiChieu;
    private String NgonNgu;
    private String Rated;

    public Flim(String tenPhim, String diemPhim, int imgPhim, String keyYoutube,
                String thoiLuong, String gioiThieu, String daoDien, String dienVien, String theLoai,
                String khoiChieu, String ngonNgu, String rated) {
        TenPhim = tenPhim;
        DiemPhim = diemPhim;
        this.imgPhim = imgPhim;
        KeyYoutube = keyYoutube;
        ThoiLuong = thoiLuong;
        GioiThieu = gioiThieu;
        DaoDien = daoDien;
        DienVien = dienVien;
        TheLoai = theLoai;
        KhoiChieu = khoiChieu;
        NgonNgu = ngonNgu;
        Rated = rated;
    }


    public String getTenPhim() {
        return TenPhim;
    }

    public String getDiemPhim() {
        return DiemPhim;
    }

    public int getImgPhim() {
        return imgPhim;
    }

    public String getKeyYoutube() {
        return KeyYoutube;
    }

    public String getThoiLuong() {
        return ThoiLuong;
    }

    public String getGioiThieu() {
        return GioiThieu;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public String getDienVien() {
        return DienVien;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public String getKhoiChieu() {
        return KhoiChieu;
    }

    public String getNgonNgu() {
        return NgonNgu;
    }

    public String getRated() {
        return Rated;
    }

    public void setDaoDien(String daoDien) {
        DaoDien = daoDien;
    }

    public void setDienVien(String dienVien) {
        DienVien = dienVien;
    }

    public void setTheLoai(String theLoai) {
        TheLoai = theLoai;
    }

    public void setKhoiChieu(String khoiChieu) {
        KhoiChieu = khoiChieu;
    }

    public void setNgonNgu(String ngonNgu) {
        NgonNgu = ngonNgu;
    }

    public void setRated(String rated) {
        Rated = rated;
    }

    public void setKeyYoutube(String keyYoutube) {
        KeyYoutube = keyYoutube;
    }

    public void setThoiLuong(String thoiLuong) {
        ThoiLuong = thoiLuong;
    }

    public void setGioiThieu(String gioiThieu) {
        GioiThieu = gioiThieu;
    }

    public void setTenPhim(String tenPhim) {
        TenPhim = tenPhim;
    }

    public void setDiemPhim(String diemPhim) {
        DiemPhim = diemPhim;
    }

    public void setImgPhim(int imgPhim) {
        this.imgPhim = imgPhim;
    }

}
