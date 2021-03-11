package com.example.khanh.movies;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        Menu menu = navigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.ListPhim:
                            Intent intent2 = new Intent(MapsActivity.this,MainActivity.class);
                            startActivity(intent2);
                            finish();
                            break;
                        case R.id.ListUuDai:
                            Intent intent1 = new Intent(MapsActivity.this,UuDaiActivity.class);
                            startActivity(intent1);
                            finish();
                            break;
                        case R.id.ListRap:
                            break;
                    }
                    return false;
                }
            };


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng cgv_thuduc = new LatLng(10.850202, 106.765157);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_thuduc)
                .title("CGV Vincom Thủ Đức")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cgv_thuduc, 12));

        LatLng cgv_govap = new LatLng(10.833037, 106.689828);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_govap)
                .title("CGV Cinema - Vincom Gò Vấp")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_nguyenxi = new LatLng(10.821511, 106.707356);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_nguyenxi)
                .title("CGV Saigonres Nguyễn Xí")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_thaodien = new LatLng(10.807471, 106.732671);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_thaodien)
                .title("CGV Thảo Điền Pearl")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_landmark = new LatLng(10.799009, 106.722516);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_landmark)
                .title("CGV Vincom Center Landmark 81")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_pearl = new LatLng(10.804912, 106.719255);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_pearl)
                .title("CGV Pearl Plaza")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_ctplaza = new LatLng(10.818060, 106.665795);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_ctplaza)
                .title("CGV CT Plaza")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_imc = new LatLng(10.796980, 106.694291);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_imc)
                .title("CGV IMC Trần Quang Khải")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_parkson = new LatLng(10.781971, 106.703045);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_parkson)
                .title("CGV Parkson Đồng Khởi")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_liberty = new LatLng(10.778766, 106.699442);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_liberty)
                .title("CGV Liberty Citypoint")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_hvt = new LatLng(10.802621, 106.659882);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_hvt)
                .title("CGV Hoàng Văn Thụ")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_pandora = new LatLng(10.810357, 106.633728);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_pandora)
                .title("CGV Pandora City")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_celadon = new LatLng(10.805178, 106.618183);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_celadon)
                .title("CGV Celadon Tân Phú")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_svh = new LatLng(10.774944, 106.669325);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_svh)
                .title("CGV Sư Vạn Hạnh")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        LatLng cgv_golden = new LatLng(10.758174, 106.654715);
        mMap.addMarker(new MarkerOptions()
                .position(cgv_golden)
                .title("CGV Golden Plaza")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.baselinelocal))
        );

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
