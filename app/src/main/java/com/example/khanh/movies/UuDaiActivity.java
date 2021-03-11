package com.example.khanh.movies;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class UuDaiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<UuDai> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uu_dai);
        recyclerView = findViewById(R.id.listUuDai);

        list = new ArrayList<>();
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/samsung-tet-online/",R.drawable.u1));
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/sneak-instant-family/",R.drawable.u2));
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/shinhan-mua1-tang1/",R.drawable.u3));
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/combo-bi-kip-luyen-rong/",R.drawable.u4));
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/samsung-2d-ticket/",R.drawable.u5));
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/yeu-phim-viet/",R.drawable.u6));
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/cgv-delivery-service/",R.drawable.u7));
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/voucher-cgv-tiki/",R.drawable.u8));
        list.add(new UuDai("https://www.cgv.vn/default/newsoffer/sacombank/",R.drawable.u9));

        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        recyclerView.setHasFixedSize(true);
        Adapter_Item_UuDai UuDaiAdapter = new Adapter_Item_UuDai(this,list);
        recyclerView.setAdapter(UuDaiAdapter);

        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        Menu menu = navigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.ListPhim:
                            Intent intent1 = new Intent(UuDaiActivity.this,MainActivity.class);
                            startActivity(intent1);
                            finish();
                            break;
                        case R.id.ListUuDai:
                            break;
                        case R.id.ListRap:
                            Intent intent = new Intent(UuDaiActivity.this,MapsActivity.class);
                            startActivity(intent);
                            finish();
                            break;
                    }
                return false;
                }
            };
}
