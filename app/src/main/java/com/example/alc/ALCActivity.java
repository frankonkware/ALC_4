package com.example.alc;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ALCActivity extends AppCompatActivity {

    private WebView webView_alc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc);


        setTitle("About ALC");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView_alc = (WebView) findViewById(R.id.webview_alc);
        //.setWebViewClient(new WebViewClient());
        webView_alc.setWebViewClient(new ALCActivity.WvClient());
        webView_alc.loadUrl("https://andela.com/alc");
    }

    private class WvClient extends WebViewClient
    {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError er) {
            handler.proceed();
            // Ignore SSL certificate errors
        }
    }

}
