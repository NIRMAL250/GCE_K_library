package com.example.gceklibrary;

import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Sem extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);

        String s = getIntent().getStringExtra("SEM");
        int opt = Integer.parseInt(s);
        //String s1 = "https://drive.google.com/open?id=18crSvHlCf5Ld0ozEJMlTNjV9jiEOamUx";
        String s2 = "https://drive.google.com/open?id=12NsXXzVHZEMC-2oynkUzOvXTVwRaICeC";
        //String s3 = "https://drive.google.com/open?id=1p7bSMBQ6xWAgT0fHyzM9eJCrsJDS7vNe";
        //String s4 = "https://drive.google.com/open?id=1ez7AVh0WlNJ4VjABOzzIQ7kU60jzstvQ";
        //String s5 = "https://drive.google.com/open?id=1KJ9YcuZ4PFN0IrWtuOu8W5g1g97a6nRI";
        //String s6 = "https://drive.google.com/open?id=1XqURze5MxDR4ScHsy-ONWAn13tv8uHbC";
        //String s7 = "https://drive.google.com/open?id=1GTmrh4znh_xfZFUijy2eAqemcToUqJsR";
        //String s8 = "https://drive.google.com/open?id=1rDL-nn5QoSDhCkhcXZQ78YV-gNjPb1Mk";

        switch (opt)
        {
            case 1 : //semester(s1);
                     break;
            case 2 : semester(s2);
                     break;
            case 3 : //semester(s3);
                     break;
            case 4 : //semester(s4);
                     break;
            case 5 : //semester(s5);
                     break;
            case 6 : //semester(s6);
                     break;
            case 7 : //semester(s7);
                     break;
            case 8 : //semester(s8);
                     break;
        }

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
    private void semester(String sem)
    {
        w = findViewById(R.id.webview);
        w.loadUrl(sem);
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
}
