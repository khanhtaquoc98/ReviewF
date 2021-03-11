package com.example.khanh.movies;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Item_Flim extends RecyclerView.Adapter<Adapter_Item_Flim.MyViewHolder> {

    private Context mContext;
    private List<Flim> mData;


    public Adapter_Item_Flim(Context mContext, List<Flim> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_flim,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, final int pos) {

        MyViewHolder.imgPhim.setImageResource(mData.get(pos).getImgPhim());
        MyViewHolder.textTen.setText(mData.get(pos).getTenPhim());
        MyViewHolder.textdiem.setText(mData.get(pos).getDiemPhim());

        MyViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, FlimChiTiet.class);
                intent.putExtra("tenPhim", mData.get(pos).getTenPhim());
                intent.putExtra("diemPhim", mData.get(pos).getDiemPhim());
                intent.putExtra("imgPhim", mData.get(pos).getImgPhim());
                intent.putExtra("keyYoutube", mData.get(pos).getKeyYoutube());
                intent.putExtra("thoiLuong",mData.get(pos).getThoiLuong());
                intent.putExtra("gioiThieu",mData.get(pos).getGioiThieu());
                intent.putExtra("daodien", mData.get(pos).getDaoDien());
                intent.putExtra("dienvien", mData.get(pos).getDienVien());
                intent.putExtra("theloai", mData.get(pos).getTheLoai());
                intent.putExtra("khoichieu", mData.get(pos).getKhoiChieu());
                intent.putExtra("ngonngu", mData.get(pos).getNgonNgu());
                intent.putExtra("rated", mData.get(pos).getRated());
                mContext.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        static TextView textTen;
        static TextView textdiem;
        static ImageView imgPhim;
        static CardView cardView;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            textTen= (TextView) itemView.findViewById(R.id.TenPhim);
            textdiem = (TextView) itemView.findViewById(R.id.Diem);
            imgPhim = (ImageView) itemView.findViewById(R.id.imgFlim);
            cardView = (CardView) itemView.findViewById(R.id.itemFlim);
        }


    }
}
