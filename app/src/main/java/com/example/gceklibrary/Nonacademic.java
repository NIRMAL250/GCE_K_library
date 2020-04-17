package com.example.gceklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class Nonacademic extends AppCompatActivity {

    WebView w;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonacademic);

        TextView radio, books;
        radio = findViewById(R.id.radio);
        books = findViewById(R.id.books);

        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "http://node-23.zeno.fm/8u7gh0uy8vzuv?rj-ttl=4&rj-tok=AAABcYcyHMEArhLhG9A3UMzaDA";
            }
        });
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = "";
            }
        });
        w = findViewById(R.id.webview);
        w.loadUrl(url);
        w.setWebViewClient(new client());
        WebSettings ws = w.getSettings();
        ws.setJavaScriptEnabled(true);
        w.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        w.clearCache(true);
        w.clearHistory();

        w.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                DownloadManager.Request req = new DownloadManager.Request(Uri.parse(url));
                req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                dm.enqueue(req);
                Toast.makeText(getApplicationContext(), "Downloading started...", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private class client extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

        }
    }
}