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

import java.util.List;

public class Adapter_Item_UuDai extends RecyclerView.Adapter<Adapter_Item_UuDai.MyViewHolder> {

    private Context mContext;
    private List<UuDai> mData;


    public Adapter_Item_UuDai(Context mContext, List<UuDai> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_uudai,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int pos) {

        MyViewHolder.imgUuDai.setImageResource(mData.get(pos).getImgUuDai());

        MyViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, URLUuDai.class);
                intent.putExtra("URLUuDai", mData.get(pos).getURLUuDai());
                mContext.startActivities(new Intent[]{intent});
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        static ImageView imgUuDai;
        static CardView cardView;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            imgUuDai = (ImageView) itemView.findViewById(R.id.imgUuDai);
            cardView = (CardView) itemView.findViewById(R.id.itemUuDai);
        }


    }
}
