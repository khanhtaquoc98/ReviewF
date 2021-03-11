package com.example.khanh.movies;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class FlimChiTiet extends AppCompatActivity {

    public static String URL;
    private Button trailer;
    private ImageView imgphim, imgflim, back;
    private TextView tenPhim, diemPhim, ngayChieu, thoiLuong, gioiThieu, daoDien, dienVien, theLoai,
            ngonNgu, rated;
    String Key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flim_chi_tiet);

        imgphim = findViewById(R.id.imgPhim);
        imgflim = findViewById(R.id.imgFlim);
        tenPhim =  findViewById(R.id.TenPhim);
        diemPhim = findViewById(R.id.Diem);
        ngayChieu = findViewById(R.id.Date);
        thoiLuong = findViewById(R.id.Time);
        gioiThieu = findViewById(R.id.GioiThieuChiTiet);
        back = findViewById(R.id.back);
        trailer = findViewById(R.id.btnTrailer);
        daoDien = findViewById(R.id.DaoDien);
        dienVien = findViewById(R.id.DienVien);
        theLoai = findViewById(R.id.TheLoai);
        ngonNgu = findViewById(R.id.NgonNgu);
        rated = findViewById(R.id.Rated);


        Intent intent = getIntent();
        String TenPhim = intent.getExtras().getString("tenPhim");
        String DiemPhim = intent.getExtras().getString("diemPhim");
        int ImgPhim = intent.getExtras().getInt("imgPhim");
        String NgayChieu = intent.getExtras().getString("khoichieu");
        String ThoiLuong = intent.getExtras().getString("thoiLuong");
        String GioiThieu = intent.getExtras().getString("gioiThieu");
        Key = intent.getExtras().getString("keyYoutube");
        String DaoDien = intent.getExtras().getString("daodien");
        String DienVien = intent.getExtras().getString("dienvien");
        String TheLoai = intent.getExtras().getString("theloai");
        String NgonNgu = intent.getExtras().getString("ngonngu");
        String Rated = intent.getExtras().getString("rated");


        imgphim.setImageResource((ImgPhim));
        imgflim.setImageResource(ImgPhim);
        tenPhim.setText(TenPhim);
        diemPhim.setText(DiemPhim);
        ngayChieu.setText(NgayChieu);
        thoiLuong.setText(ThoiLuong);
        gioiThieu.setText(GioiThieu);
        daoDien.setText(DaoDien);
        dienVien.setText(DienVien);
        theLoai.setText(TheLoai);
        ngonNgu.setText(NgonNgu);
        rated.setText(Rated);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(FlimChiTiet.this, MainActivity.class);
                startActivityForResult(in, 1);
            }
        });

        trailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlimChiTiet.this, Trailer.class);
                intent.putExtra(URL,Key);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(FlimChiTiet.this, trailer, "Trailer");
                startActivity(intent, optionsCompat.toBundle());
            }
        });
    }
}

