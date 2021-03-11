package com.example.khanh.movies;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class URLUuDai extends AppCompatActivity {

    private WebView webView;
    private TextView textWeb;
    private ImageView backuudai;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urluu_dai);

        textWeb = findViewById(R.id.texturl);
        webView = findViewById(R.id.webview);
        backuudai = findViewById(R.id.back);
        linearLayout = findViewById(R.id.murluudai);

        final Intent intent = getIntent();
        String URL = intent.getExtras().getString("URLUuDai");

        textWeb.setText(URL);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(URL);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        backuudai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
