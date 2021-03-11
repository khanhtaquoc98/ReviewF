package com.example.khanh.movies;

public class UuDai {

    private String URLUuDai;
    private int imgUuDai;

    public UuDai(String URLUuDai, int imgUuDai) {
        this.URLUuDai = URLUuDai;
        this.imgUuDai = imgUuDai;
    }

    public String getURLUuDai() {
        return URLUuDai;
    }

    public int getImgUuDai() {
        return imgUuDai;
    }

    public void setURLUuDai(String URLUuDai) {
        this.URLUuDai = URLUuDai;
    }

    public void setImgUuDai(int imgUuDai) {
        this.imgUuDai = imgUuDai;
    }
}
