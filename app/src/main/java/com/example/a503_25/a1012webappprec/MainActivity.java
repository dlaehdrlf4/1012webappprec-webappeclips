package com.example.a503_25.a1012webappprec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.webView);
        //리다이렉트가 있는 경우
        //크롬으로 가지 않고 현재 앱에서 이동하도록 설정
        webView.setWebViewClient(new WebViewClient());
        //자바스크립트 사용 설정 자바에서 home에서 설정한 것을 할 수 있다. 자바스크립트를 쓸수 없다.
        WebSettings set = webView.getSettings();
        set.setJavaScriptEnabled(true);
        //확대 축소 버튼을 추가 - 확대 축소가 되는 경우 확대 축소 버튼이 생긴다.
        set.setBuiltInZoomControls(true);

        webView.loadUrl("http://192.168.0.235:8080/mobileweb");
    }
}
