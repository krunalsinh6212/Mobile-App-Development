package com.example.webview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        WebView view = findViewById(R.id.web);
        view.loadUrl("https://www.instagram.com/accounts/login/?hl=en");
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new WebViewClient());
    }
}