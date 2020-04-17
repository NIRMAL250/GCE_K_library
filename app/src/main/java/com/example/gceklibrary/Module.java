package com.example.gceklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Module extends AppCompatActivity {
    WebView w;
    String module;
    int mod;
    //COMMIT
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);
        String m = getIntent().getStringExtra("MODULE");
        mod = Integer.parseInt(m);
        module();
        semester(module);
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
    private void semester(String mod)
    {
        w = findViewById(R.id.webview);
        w.loadUrl(mod);
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
    private void module()
    {
        if(mod == 111)
        {
            module = "https://drive.google.com/open?id=1DGfdd2-tQjSa7VwWpZ37r2SpjYRrtJO7";
        }
        else if(mod == 112)
        {
            module = "https://drive.google.com/open?id=1DGfdd2-tQjSa7VwWpZ37r2SpjYRrtJO7";
        }
        else if(mod == 113)
        {
            module = "https://drive.google.com/open?id=1DGfdd2-tQjSa7VwWpZ37r2SpjYRrtJO7";
        }
        else if(mod == 114)
        {
            module = "https://drive.google.com/open?id=1DGfdd2-tQjSa7VwWpZ37r2SpjYRrtJO7";
        }
        else if(mod == 115)
        {
            module = "https://drive.google.com/open?id=1DGfdd2-tQjSa7VwWpZ37r2SpjYRrtJO7";
        }
        else if(mod == 116)
        {
            module = "https://drive.google.com/open?id=1DGfdd2-tQjSa7VwWpZ37r2SpjYRrtJO7";
        }
        if(mod == 211)
        {
            module = "https://drive.google.com/open?id=1nmYTbdblAtm9UMcRsY4HQOEl9vosvvyV";
        }
        else if(mod == 212)
        {
            module = "https://drive.google.com/open?id=1nmYTbdblAtm9UMcRsY4HQOEl9vosvvyV";
        }
        else if(mod == 213)
        {
            module = "https://drive.google.com/open?id=1nmYTbdblAtm9UMcRsY4HQOEl9vosvvyV";
        }
        else if(mod == 214)
        {
            module = "https://drive.google.com/open?id=1nmYTbdblAtm9UMcRsY4HQOEl9vosvvyV";
        }
        else if(mod == 215)
        {
            module = "https://drive.google.com/open?id=1nmYTbdblAtm9UMcRsY4HQOEl9vosvvyV";
        }
        else if(mod == 216)
        {
            module = "https://drive.google.com/open?id=1nmYTbdblAtm9UMcRsY4HQOEl9vosvvyV";
        }
        if(mod == 311)
        {
            module = "https://drive.google.com/open?id=1wtYHA2mq5Qq9J8Q7Y49ICLtv7Nu4ZPdr";
        }
        else if(mod == 312)
        {
            module = "https://drive.google.com/open?id=1wtYHA2mq5Qq9J8Q7Y49ICLtv7Nu4ZPdr";
        }
        else if(mod == 313)
        {
            module = "https://drive.google.com/open?id=1wtYHA2mq5Qq9J8Q7Y49ICLtv7Nu4ZPdr";
        }
        else if(mod == 314)
        {
            module = "https://drive.google.com/open?id=1wtYHA2mq5Qq9J8Q7Y49ICLtv7Nu4ZPdr";
        }
        else if(mod == 315)
        {
            module = "https://drive.google.com/open?id=1wtYHA2mq5Qq9J8Q7Y49ICLtv7Nu4ZPdr";
        }
        else if(mod == 316)
        {
            module = "https://drive.google.com/open?id=1wtYHA2mq5Qq9J8Q7Y49ICLtv7Nu4ZPdr";
        }
        if(mod == 411)
        {
            module = "https://drive.google.com/open?id=1KSOM6KJ9_ot06FHkZ-uvsfrlhsCtQ094";
        }
        else if(mod == 412)
        {
            module = "https://drive.google.com/open?id=1KSOM6KJ9_ot06FHkZ-uvsfrlhsCtQ094";
        }
        else if(mod == 413)
        {
            module = "https://drive.google.com/open?id=1KSOM6KJ9_ot06FHkZ-uvsfrlhsCtQ094";
        }
        else if(mod == 414)
        {
            module = "https://drive.google.com/open?id=1KSOM6KJ9_ot06FHkZ-uvsfrlhsCtQ094";
        }
        else if(mod == 415)
        {
            module = "https://drive.google.com/open?id=1KSOM6KJ9_ot06FHkZ-uvsfrlhsCtQ094";
        }
        else if(mod == 416)
        {
            module = "https://drive.google.com/open?id=1KSOM6KJ9_ot06FHkZ-uvsfrlhsCtQ094";
        }
        if(mod == 511)
        {
            module = "https://drive.google.com/open?id=14sw81-fU68YqTMU05UgmW3TEH8nlZmyI";
        }
        else if(mod == 512)
        {
            module = "https://drive.google.com/open?id=14sw81-fU68YqTMU05UgmW3TEH8nlZmyI";
        }
        else if(mod == 513)
        {
            module = "https://drive.google.com/open?id=14sw81-fU68YqTMU05UgmW3TEH8nlZmyI";
        }
        else if(mod == 514)
        {
            module = "https://drive.google.com/open?id=14sw81-fU68YqTMU05UgmW3TEH8nlZmyI";
        }
        else if(mod == 515)
        {
            module = "https://drive.google.com/open?id=14sw81-fU68YqTMU05UgmW3TEH8nlZmyI";
        }
        else if(mod == 516)
        {
            module = "https://drive.google.com/open?id=14sw81-fU68YqTMU05UgmW3TEH8nlZmyI";
        }
        if(mod == 121)
        {
            module = "https://drive.google.com/open?id=1uRAddbDJo_mKwK9upRsO-QFDa4jBXuWi";
        }
        else if(mod == 122)
        {
            module = "https://drive.google.com/open?id=1uRAddbDJo_mKwK9upRsO-QFDa4jBXuWi";
        }
        else if(mod == 123)
        {
            module = "https://drive.google.com/open?id=1uRAddbDJo_mKwK9upRsO-QFDa4jBXuWi";
        }
        else if(mod == 124)
        {
            module = "https://drive.google.com/open?id=1uRAddbDJo_mKwK9upRsO-QFDa4jBXuWi";
        }
        else if(mod == 125)
        {
            module = "https://drive.google.com/open?id=1uRAddbDJo_mKwK9upRsO-QFDa4jBXuWi";
        }
        else if(mod == 126)
        {
            module = "https://drive.google.com/open?id=1uRAddbDJo_mKwK9upRsO-QFDa4jBXuWi";
        }
        if(mod == 221)
        {
            module = "https://drive.google.com/open?id=1hb3XYcZyw2Ujsws8QOl8mgTk51vPB6pH";
        }
        else if(mod == 222)
        {
            module = "https://drive.google.com/open?id=1hb3XYcZyw2Ujsws8QOl8mgTk51vPB6pH";
        }
        else if(mod == 223)
        {
            module = "https://drive.google.com/open?id=1hb3XYcZyw2Ujsws8QOl8mgTk51vPB6pH";
        }
        else if(mod == 224)
        {
            module = "https://drive.google.com/open?id=1hb3XYcZyw2Ujsws8QOl8mgTk51vPB6pH";
        }
        else if(mod == 225)
        {
            module = "https://drive.google.com/open?id=1hb3XYcZyw2Ujsws8QOl8mgTk51vPB6pH";
        }
        else if(mod == 226)
        {
            module = "https://drive.google.com/open?id=1hb3XYcZyw2Ujsws8QOl8mgTk51vPB6pH";
        }
        if(mod == 321)
        {
            module = "https://drive.google.com/open?id=1DBmKzcaU_q3EjRgA6b_P7MC8LQYMPWh6";
        }
        else if(mod == 322)
        {
            module = "https://drive.google.com/open?id=1DBmKzcaU_q3EjRgA6b_P7MC8LQYMPWh6";
        }
        else if(mod == 323)
        {
            module = "https://drive.google.com/open?id=1DBmKzcaU_q3EjRgA6b_P7MC8LQYMPWh6";
        }
        else if(mod == 324)
        {
            module = "https://drive.google.com/open?id=1DBmKzcaU_q3EjRgA6b_P7MC8LQYMPWh6";
        }
        else if(mod == 325)
        {
            module = "https://drive.google.com/open?id=1DBmKzcaU_q3EjRgA6b_P7MC8LQYMPWh6";
        }
        else if(mod == 326)
        {
            module = "https://drive.google.com/open?id=1DBmKzcaU_q3EjRgA6b_P7MC8LQYMPWh6";
        }
        if(mod == 421)
        {
            module = "https://drive.google.com/open?id=1GCINtdP_dPKHIuO1Ne6HcyI66P8MJ-c_";
        }
        else if(mod == 422)
        {
            module = "https://drive.google.com/open?id=1GCINtdP_dPKHIuO1Ne6HcyI66P8MJ-c_";
        }
        else if(mod == 423)
        {
            module = "https://drive.google.com/open?id=1GCINtdP_dPKHIuO1Ne6HcyI66P8MJ-c_";
        }
        else if(mod == 424)
        {
            module = "https://drive.google.com/open?id=1GCINtdP_dPKHIuO1Ne6HcyI66P8MJ-c_";
        }
        else if(mod == 425)
        {
            module = "https://drive.google.com/open?id=1GCINtdP_dPKHIuO1Ne6HcyI66P8MJ-c_";
        }
        else if(mod == 426)
        {
            module = "https://drive.google.com/open?id=1GCINtdP_dPKHIuO1Ne6HcyI66P8MJ-c_";
        }
        if(mod == 521)
        {
            module = "https://drive.google.com/open?id=1ciZIkssdu2BWbcNaFAWavkqZs_AzBWBw";
        }
        else if(mod == 522)
        {
            module = "https://drive.google.com/open?id=1ciZIkssdu2BWbcNaFAWavkqZs_AzBWBw";
        }
        else if(mod == 523)
        {
            module = "https://drive.google.com/open?id=1ciZIkssdu2BWbcNaFAWavkqZs_AzBWBw";
        }
        else if(mod == 524)
        {
            module = "https://drive.google.com/open?id=1ciZIkssdu2BWbcNaFAWavkqZs_AzBWBw";
        }
        else if(mod == 525)
        {
            module = "https://drive.google.com/open?id=1ciZIkssdu2BWbcNaFAWavkqZs_AzBWBw";
        }
        else if(mod == 526)
        {
            module = "https://drive.google.com/open?id=1ciZIkssdu2BWbcNaFAWavkqZs_AzBWBw";
        }
        if(mod == 131)
        {
            module = "https://drive.google.com/open?id=1vZccYJIWfafrdj90oDWvbGWmht9RdHgr";
        }
        else if(mod == 132)
        {
            module = "https://drive.google.com/open?id=1vZccYJIWfafrdj90oDWvbGWmht9RdHgr";
        }
        else if(mod == 133)
        {
            module = "https://drive.google.com/open?id=1vZccYJIWfafrdj90oDWvbGWmht9RdHgr";
        }
        else if(mod == 134)
        {
            module = "https://drive.google.com/open?id=1vZccYJIWfafrdj90oDWvbGWmht9RdHgr";
        }
        else if(mod == 135)
        {
            module = "https://drive.google.com/open?id=1vZccYJIWfafrdj90oDWvbGWmht9RdHgr";
        }
        else if(mod == 136)
        {
            module = "https://drive.google.com/open?id=1vZccYJIWfafrdj90oDWvbGWmht9RdHgr";
        }
        if(mod == 231)
        {
            module = "https://drive.google.com/open?id=1d4qG4yCitKA0xYCK1Jp4J9a_62Auf7QZ";
        }
        else if(mod == 232)
        {
            module = "https://drive.google.com/open?id=1d4qG4yCitKA0xYCK1Jp4J9a_62Auf7QZ";
        }
        else if(mod == 233)
        {
            module = "https://drive.google.com/open?id=1d4qG4yCitKA0xYCK1Jp4J9a_62Auf7QZ";
        }
        else if(mod == 234)
        {
            module = "https://drive.google.com/open?id=1d4qG4yCitKA0xYCK1Jp4J9a_62Auf7QZ";
        }
        else if(mod == 235)
        {
            module = "https://drive.google.com/open?id=1d4qG4yCitKA0xYCK1Jp4J9a_62Auf7QZ";
        }
        else if(mod == 236)
        {
            module = "https://drive.google.com/open?id=1d4qG4yCitKA0xYCK1Jp4J9a_62Auf7QZ";
        }
        if(mod == 331)
        {
            module = "https://drive.google.com/open?id=1900yy2OuKhTIU3ejcyXrjv_GaWzdtdLr";
        }
        else if(mod == 332)
        {
            module = "https://drive.google.com/open?id=1900yy2OuKhTIU3ejcyXrjv_GaWzdtdLr";
        }
        else if(mod == 333)
        {
            module = "https://drive.google.com/open?id=1900yy2OuKhTIU3ejcyXrjv_GaWzdtdLr";
        }
        else if(mod == 334)
        {
            module = "https://drive.google.com/open?id=1900yy2OuKhTIU3ejcyXrjv_GaWzdtdLr";
        }
        else if(mod == 335)
        {
            module = "https://drive.google.com/open?id=1900yy2OuKhTIU3ejcyXrjv_GaWzdtdLr";
        }
        else if(mod == 336)
        {
            module = "https://drive.google.com/open?id=1900yy2OuKhTIU3ejcyXrjv_GaWzdtdLr";
        }
        if(mod == 431)
        {
            module = "https://drive.google.com/open?id=1oydIb96ynO1dY9sMFrT5GfFRo54t3c9N";
        }
        else if(mod == 432)
        {
            module = "https://drive.google.com/open?id=1oydIb96ynO1dY9sMFrT5GfFRo54t3c9N";
        }
        else if(mod == 433)
        {
            module = "https://drive.google.com/open?id=1oydIb96ynO1dY9sMFrT5GfFRo54t3c9N";
        }
        else if(mod == 434)
        {
            module = "https://drive.google.com/open?id=1oydIb96ynO1dY9sMFrT5GfFRo54t3c9N";
        }
        else if(mod == 435)
        {
            module = "https://drive.google.com/open?id=1oydIb96ynO1dY9sMFrT5GfFRo54t3c9N";
        }
        else if(mod == 436)
        {
            module = "https://drive.google.com/open?id=1oydIb96ynO1dY9sMFrT5GfFRo54t3c9N";
        }
        if(mod == 531)
        {
            module = "https://drive.google.com/open?id=1ls13BALHCCPVtmBXoK_zXhlw4beq1tln";
        }
        else if(mod == 532)
        {
            module = "https://drive.google.com/open?id=1ls13BALHCCPVtmBXoK_zXhlw4beq1tln";
        }
        else if(mod == 533)
        {
            module = "https://drive.google.com/open?id=1ls13BALHCCPVtmBXoK_zXhlw4beq1tln";
        }
        else if(mod == 534)
        {
            module = "https://drive.google.com/open?id=1ls13BALHCCPVtmBXoK_zXhlw4beq1tln";
        }
        else if(mod == 535)
        {
            module = "https://drive.google.com/open?id=1ls13BALHCCPVtmBXoK_zXhlw4beq1tln";
        }
        else if(mod == 536)
        {
            module = "https://drive.google.com/open?id=1ls13BALHCCPVtmBXoK_zXhlw4beq1tln";
        }
        if(mod == 141)
        {
            module = "https://drive.google.com/open?id=1I-y-WlsG4UjVr962k9hqUGKGzf8OV05a";
        }
        else if(mod == 142)
        {
            module = "https://drive.google.com/open?id=1I-y-WlsG4UjVr962k9hqUGKGzf8OV05a";
        }
        else if(mod == 143)
        {
            module = "https://drive.google.com/open?id=1I-y-WlsG4UjVr962k9hqUGKGzf8OV05a";
        }
        else if(mod == 144)
        {
            module = "https://drive.google.com/open?id=1I-y-WlsG4UjVr962k9hqUGKGzf8OV05a";
        }
        else if(mod == 145)
        {
            module = "https://drive.google.com/open?id=1I-y-WlsG4UjVr962k9hqUGKGzf8OV05a";
        }
        else if(mod == 146)
        {
            module = "https://drive.google.com/open?id=1I-y-WlsG4UjVr962k9hqUGKGzf8OV05a";
        }
        if(mod == 241)
        {
            module = "https://drive.google.com/open?id=1oBPcAZ-K5UAHnxU9AA8gnfg703ET0EGZ";
        }
        else if(mod == 242)
        {
            module = "https://drive.google.com/open?id=1oBPcAZ-K5UAHnxU9AA8gnfg703ET0EGZ";
        }
        else if(mod == 243)
        {
            module = "https://drive.google.com/open?id=1oBPcAZ-K5UAHnxU9AA8gnfg703ET0EGZ";
        }
        else if(mod == 244)
        {
            module = "https://drive.google.com/open?id=1oBPcAZ-K5UAHnxU9AA8gnfg703ET0EGZ";
        }
        else if(mod == 245)
        {
            module = "https://drive.google.com/open?id=1oBPcAZ-K5UAHnxU9AA8gnfg703ET0EGZ";
        }
        else if(mod == 246)
        {
            module = "https://drive.google.com/open?id=1oBPcAZ-K5UAHnxU9AA8gnfg703ET0EGZ";
        }
        if(mod == 341)
        {
            module = "https://drive.google.com/open?id=1qCUwz0yl4e2GH3o7759ssluEp84DvQ8O";
        }
        else if(mod == 342)
        {
            module = "https://drive.google.com/open?id=1qCUwz0yl4e2GH3o7759ssluEp84DvQ8O";
        }
        else if(mod == 343)
        {
            module = "https://drive.google.com/open?id=1qCUwz0yl4e2GH3o7759ssluEp84DvQ8O";
        }
        else if(mod == 344)
        {
            module = "https://drive.google.com/open?id=1qCUwz0yl4e2GH3o7759ssluEp84DvQ8O";
        }
        else if(mod == 345)
        {
            module = "https://drive.google.com/open?id=1qCUwz0yl4e2GH3o7759ssluEp84DvQ8O";
        }
        else if(mod == 346)
        {
            module = "https://drive.google.com/open?id=1qCUwz0yl4e2GH3o7759ssluEp84DvQ8O";
        }
        if(mod == 441)
        {
            module = "https://drive.google.com/open?id=1xNLdWhS2uSwgELTVccbmepf2o_o9Qul8";
        }
        else if(mod == 442)
        {
            module = "https://drive.google.com/open?id=1xNLdWhS2uSwgELTVccbmepf2o_o9Qul8";
        }
        else if(mod == 443)
        {
            module = "https://drive.google.com/open?id=1xNLdWhS2uSwgELTVccbmepf2o_o9Qul8";
        }
        else if(mod == 444)
        {
            module = "https://drive.google.com/open?id=1xNLdWhS2uSwgELTVccbmepf2o_o9Qul8";
        }
        else if(mod == 445)
        {
            module = "https://drive.google.com/open?id=1xNLdWhS2uSwgELTVccbmepf2o_o9Qul8";
        }
        else if(mod == 446)
        {
            module = "https://drive.google.com/open?id=1xNLdWhS2uSwgELTVccbmepf2o_o9Qul8";
        }
        if(mod == 541)
        {
            module = "https://drive.google.com/open?id=1flup-UTxWG9yGKuzWM3UGDCFgh8HHHcL";
        }
        else if(mod == 542)
        {
            module = "https://drive.google.com/open?id=1flup-UTxWG9yGKuzWM3UGDCFgh8HHHcL";
        }
        else if(mod == 543)
        {
            module = "https://drive.google.com/open?id=1flup-UTxWG9yGKuzWM3UGDCFgh8HHHcL";
        }
        else if(mod == 544)
        {
            module = "https://drive.google.com/open?id=1flup-UTxWG9yGKuzWM3UGDCFgh8HHHcL";
        }
        else if(mod == 545)
        {
            module = "https://drive.google.com/open?id=1flup-UTxWG9yGKuzWM3UGDCFgh8HHHcL";
        }
        else if(mod == 546)
        {
            module = "https://drive.google.com/open?id=1flup-UTxWG9yGKuzWM3UGDCFgh8HHHcL";
        }
        if(mod == 151)
        {
            module = "https://drive.google.com/open?id=1MXNFJ-UQIYHSLpvDiIy0ViMdZw3OD6yz";
        }
        else if(mod == 152)
        {
            module = "https://drive.google.com/open?id=1MXNFJ-UQIYHSLpvDiIy0ViMdZw3OD6yz";
        }
        else if(mod == 153)
        {
            module = "https://drive.google.com/open?id=1MXNFJ-UQIYHSLpvDiIy0ViMdZw3OD6yz";
        }
        else if(mod == 154)
        {
            module = "https://drive.google.com/open?id=1MXNFJ-UQIYHSLpvDiIy0ViMdZw3OD6yz";
        }
        else if(mod == 155)
        {
            module = "https://drive.google.com/open?id=1MXNFJ-UQIYHSLpvDiIy0ViMdZw3OD6yz";
        }
        else if(mod == 156)
        {
            module = "https://drive.google.com/open?id=1MXNFJ-UQIYHSLpvDiIy0ViMdZw3OD6yz";
        }
        if(mod == 251)
        {
            module = "https://drive.google.com/open?id=1omvANHSrI7V7QIjDOyX9uWu-NytbFwAn";
        }
        else if(mod == 252)
        {
            module = "https://drive.google.com/open?id=1omvANHSrI7V7QIjDOyX9uWu-NytbFwAn";
        }
        else if(mod == 253)
        {
            module = "https://drive.google.com/open?id=1omvANHSrI7V7QIjDOyX9uWu-NytbFwAn";
        }
        else if(mod == 254)
        {
            module = "https://drive.google.com/open?id=1omvANHSrI7V7QIjDOyX9uWu-NytbFwAn";
        }
        else if(mod == 255)
        {
            module = "https://drive.google.com/open?id=1omvANHSrI7V7QIjDOyX9uWu-NytbFwAn";
        }
        else if(mod == 256)
        {
            module = "https://drive.google.com/open?id=1omvANHSrI7V7QIjDOyX9uWu-NytbFwAn";
        }
        if(mod == 351)
        {
            module = "https://drive.google.com/open?id=1qnbUqlneqTZjHeRNyFDXARHuqyEzbhCI";
        }
        else if(mod == 352)
        {
            module = "https://drive.google.com/open?id=1qnbUqlneqTZjHeRNyFDXARHuqyEzbhCI";
        }
        else if(mod == 353)
        {
            module = "https://drive.google.com/open?id=1qnbUqlneqTZjHeRNyFDXARHuqyEzbhCI";
        }
        else if(mod == 354)
        {
            module = "https://drive.google.com/open?id=1qnbUqlneqTZjHeRNyFDXARHuqyEzbhCI";
        }
        else if(mod == 355)
        {
            module = "https://drive.google.com/open?id=1qnbUqlneqTZjHeRNyFDXARHuqyEzbhCI";
        }
        else if(mod == 356)
        {
            module = "https://drive.google.com/open?id=1qnbUqlneqTZjHeRNyFDXARHuqyEzbhCI";
        }
        if(mod == 451)
        {
            module = "https://drive.google.com/open?id=11m_dNLDS2E8Pmg7S6xgLLk9T5y_pbwq2";
        }
        else if(mod == 452)
        {
            module = "https://drive.google.com/open?id=11m_dNLDS2E8Pmg7S6xgLLk9T5y_pbwq2";
        }
        else if(mod == 453)
        {
            module = "https://drive.google.com/open?id=11m_dNLDS2E8Pmg7S6xgLLk9T5y_pbwq2";
        }
        else if(mod == 454)
        {
            module = "https://drive.google.com/open?id=11m_dNLDS2E8Pmg7S6xgLLk9T5y_pbwq2";
        }
        else if(mod == 455)
        {
            module = "https://drive.google.com/open?id=11m_dNLDS2E8Pmg7S6xgLLk9T5y_pbwq2";
        }
        else if(mod == 456)
        {
            module = "https://drive.google.com/open?id=11m_dNLDS2E8Pmg7S6xgLLk9T5y_pbwq2";
        }
        if(mod == 551)
        {
            module = "https://drive.google.com/open?id=1C9hPopZEm_kX4eGf_VPvrFIA9JveWGHc";
        }
        else if(mod == 552)
        {
            module = "https://drive.google.com/open?id=1C9hPopZEm_kX4eGf_VPvrFIA9JveWGHc";
        }
        else if(mod == 553)
        {
            module = "https://drive.google.com/open?id=1C9hPopZEm_kX4eGf_VPvrFIA9JveWGHc";
        }
        else if(mod == 554)
        {
            module = "https://drive.google.com/open?id=1C9hPopZEm_kX4eGf_VPvrFIA9JveWGHc";
        }
        else if(mod == 555)
        {
            module = "https://drive.google.com/open?id=1C9hPopZEm_kX4eGf_VPvrFIA9JveWGHc";
        }
        else if(mod == 556)
        {
            module = "https://drive.google.com/open?id=1C9hPopZEm_kX4eGf_VPvrFIA9JveWGHc";
        }
        if(mod == 161)
        {
            module = "https://drive.google.com/open?id=1amtrpFEW7xZm_KU1Su1XTFpFAqodnhVv";
        }
        else if(mod == 162)
        {
            module = "https://drive.google.com/open?id=1amtrpFEW7xZm_KU1Su1XTFpFAqodnhVv";
        }
        else if(mod == 163)
        {
            module = "https://drive.google.com/open?id=1amtrpFEW7xZm_KU1Su1XTFpFAqodnhVv";
        }
        else if(mod == 164)
        {
            module = "https://drive.google.com/open?id=1amtrpFEW7xZm_KU1Su1XTFpFAqodnhVv";
        }
        else if(mod == 165)
        {
            module = "https://drive.google.com/open?id=1amtrpFEW7xZm_KU1Su1XTFpFAqodnhVv";
        }
        else if(mod == 166)
        {
            module = "https://drive.google.com/open?id=1amtrpFEW7xZm_KU1Su1XTFpFAqodnhVv";
        }
        if(mod == 261)
        {
            module = "https://drive.google.com/open?id=1CJOvTn11ReLIAYITVtTi9iNmxRer-_aA";
        }
        else if(mod == 262)
        {
            module = "https://drive.google.com/open?id=1CJOvTn11ReLIAYITVtTi9iNmxRer-_aA";
        }
        else if(mod == 263)
        {
            module = "https://drive.google.com/open?id=1CJOvTn11ReLIAYITVtTi9iNmxRer-_aA";
        }
        else if(mod == 264)
        {
            module = "https://drive.google.com/open?id=1CJOvTn11ReLIAYITVtTi9iNmxRer-_aA";
        }
        else if(mod == 265)
        {
            module = "https://drive.google.com/open?id=1CJOvTn11ReLIAYITVtTi9iNmxRer-_aA";
        }
        else if(mod == 266)
        {
            module = "https://drive.google.com/open?id=1CJOvTn11ReLIAYITVtTi9iNmxRer-_aA";
        }
        if(mod == 361)
        {
            module = "https://drive.google.com/open?id=19MOilEDxK5Y5v19wtGRHpZMKV1OtoHHu";
        }
        else if(mod == 362)
        {
            module = "https://drive.google.com/open?id=19MOilEDxK5Y5v19wtGRHpZMKV1OtoHHu";
        }
        else if(mod == 363)
        {
            module = "https://drive.google.com/open?id=19MOilEDxK5Y5v19wtGRHpZMKV1OtoHHu";
        }
        else if(mod == 364)
        {
            module = "https://drive.google.com/open?id=19MOilEDxK5Y5v19wtGRHpZMKV1OtoHHu";
        }
        else if(mod == 365)
        {
            module = "https://drive.google.com/open?id=19MOilEDxK5Y5v19wtGRHpZMKV1OtoHHu";
        }
        else if(mod == 366)
        {
            module = "https://drive.google.com/open?id=19MOilEDxK5Y5v19wtGRHpZMKV1OtoHHu";
        }
        if(mod == 461)
        {
            module = "https://drive.google.com/open?id=1zHYYEzAskoVZa4URy3HP0nShH7YGJ2o5";
        }
        else if(mod == 462)
        {
            module = "https://drive.google.com/open?id=1zHYYEzAskoVZa4URy3HP0nShH7YGJ2o5";
        }
        else if(mod == 463)
        {
            module = "https://drive.google.com/open?id=1zHYYEzAskoVZa4URy3HP0nShH7YGJ2o5";
        }
        else if(mod == 464)
        {
            module = "https://drive.google.com/open?id=1zHYYEzAskoVZa4URy3HP0nShH7YGJ2o5";
        }
        else if(mod == 465)
        {
            module = "https://drive.google.com/open?id=1zHYYEzAskoVZa4URy3HP0nShH7YGJ2o5";
        }
        else if(mod == 466)
        {
            module = "https://drive.google.com/open?id=1zHYYEzAskoVZa4URy3HP0nShH7YGJ2o5";
        }
        if(mod == 561)
        {
            module = "https://drive.google.com/open?id=1JJ1sNrqCYnFXR5mrzXNSfE43R8MfQ0W0";
        }
        else if(mod == 562)
        {
            module = "https://drive.google.com/open?id=1JJ1sNrqCYnFXR5mrzXNSfE43R8MfQ0W0";
        }
        else if(mod == 563)
        {
            module = "https://drive.google.com/open?id=1JJ1sNrqCYnFXR5mrzXNSfE43R8MfQ0W0";
        }
        else if(mod == 564)
        {
            module = "https://drive.google.com/open?id=1JJ1sNrqCYnFXR5mrzXNSfE43R8MfQ0W0";
        }
        else if(mod == 565)
        {
            module = "https://drive.google.com/open?id=1JJ1sNrqCYnFXR5mrzXNSfE43R8MfQ0W0";
        }
        else if(mod == 566)
        {
            module = "https://drive.google.com/open?id=1JJ1sNrqCYnFXR5mrzXNSfE43R8MfQ0W0";
        }
        if(mod == 171)
        {
            module = "https://drive.google.com/open?id=1RjykjDidJYUcvjLksLt-mq43fNGgrZcG";
        }
        else if(mod == 172)
        {
            module = "https://drive.google.com/open?id=1RjykjDidJYUcvjLksLt-mq43fNGgrZcG";
        }
        else if(mod == 173)
        {
            module = "https://drive.google.com/open?id=1RjykjDidJYUcvjLksLt-mq43fNGgrZcG";
        }
        else if(mod == 174)
        {
            module = "https://drive.google.com/open?id=1RjykjDidJYUcvjLksLt-mq43fNGgrZcG";
        }
        else if(mod == 175)
        {
            module = "https://drive.google.com/open?id=1RjykjDidJYUcvjLksLt-mq43fNGgrZcG";
        }
        else if(mod == 176)
        {
            module = "https://drive.google.com/open?id=1RjykjDidJYUcvjLksLt-mq43fNGgrZcG";
        }
        if(mod == 271)
        {
            module = "https://drive.google.com/open?id=1KRTrhyasm9Xnpy7dv6iaaIACRQLxX91D";
        }
        else if(mod == 272)
        {
            module = "https://drive.google.com/open?id=1KRTrhyasm9Xnpy7dv6iaaIACRQLxX91D";
        }
        else if(mod == 273)
        {
            module = "https://drive.google.com/open?id=1KRTrhyasm9Xnpy7dv6iaaIACRQLxX91D";
        }
        else if(mod == 274)
        {
            module = "https://drive.google.com/open?id=1KRTrhyasm9Xnpy7dv6iaaIACRQLxX91D";
        }
        else if(mod == 275)
        {
            module = "https://drive.google.com/open?id=1KRTrhyasm9Xnpy7dv6iaaIACRQLxX91D";
        }
        else if(mod == 276)
        {
            module = "https://drive.google.com/open?id=1KRTrhyasm9Xnpy7dv6iaaIACRQLxX91D";
        }
        if(mod == 371)
        {
            module = "https://drive.google.com/open?id=1X2qhsDmkmb9f8tVfUjio2Wpb0vy-UWP4";
        }
        else if(mod == 372)
        {
            module = "https://drive.google.com/open?id=1X2qhsDmkmb9f8tVfUjio2Wpb0vy-UWP4";
        }
        else if(mod == 373)
        {
            module = "https://drive.google.com/open?id=1X2qhsDmkmb9f8tVfUjio2Wpb0vy-UWP4";
        }
        else if(mod == 374)
        {
            module = "https://drive.google.com/open?id=1X2qhsDmkmb9f8tVfUjio2Wpb0vy-UWP4";
        }
        else if(mod == 375)
        {
            module = "https://drive.google.com/open?id=1X2qhsDmkmb9f8tVfUjio2Wpb0vy-UWP4";
        }
        else if(mod == 376)
        {
            module = "https://drive.google.com/open?id=1X2qhsDmkmb9f8tVfUjio2Wpb0vy-UWP4";
        }
        if(mod == 471)
        {
            module = "https://drive.google.com/open?id=1xPYGG_0wV5ELcsX-HzTzdp1BLsj4uy1W";
        }
        else if(mod == 472)
        {
            module = "https://drive.google.com/open?id=1xPYGG_0wV5ELcsX-HzTzdp1BLsj4uy1W";
        }
        else if(mod == 473)
        {
            module = "https://drive.google.com/open?id=1xPYGG_0wV5ELcsX-HzTzdp1BLsj4uy1W";
        }
        else if(mod == 474)
        {
            module = "https://drive.google.com/open?id=1xPYGG_0wV5ELcsX-HzTzdp1BLsj4uy1W";
        }
        else if(mod == 475)
        {
            module = "https://drive.google.com/open?id=1xPYGG_0wV5ELcsX-HzTzdp1BLsj4uy1W";
        }
        else if(mod == 476)
        {
            module = "https://drive.google.com/open?id=1xPYGG_0wV5ELcsX-HzTzdp1BLsj4uy1W";
        }
        if(mod == 571)
        {
            module = "https://drive.google.com/open?id=1D6HQkdm8qajxm9Xw7HGN3Z70KxaoIUon";
        }
        else if(mod == 572)
        {
            module = "https://drive.google.com/open?id=1D6HQkdm8qajxm9Xw7HGN3Z70KxaoIUon";
        }
        else if(mod == 573)
        {
            module = "https://drive.google.com/open?id=1D6HQkdm8qajxm9Xw7HGN3Z70KxaoIUon";
        }
        else if(mod == 574)
        {
            module = "https://drive.google.com/open?id=1D6HQkdm8qajxm9Xw7HGN3Z70KxaoIUon";
        }
        else if(mod == 575)
        {
            module = "https://drive.google.com/open?id=1D6HQkdm8qajxm9Xw7HGN3Z70KxaoIUon";
        }
        else if(mod == 576)
        {
            module = "https://drive.google.com/open?id=1D6HQkdm8qajxm9Xw7HGN3Z70KxaoIUon";
        }
        if(mod == 181)
        {
            module = "https://drive.google.com/open?id=1tBD9YCwtWZs0J4mQoXrxtwk7CGMkiRXY";
        }
        else if(mod == 182)
        {
            module = "https://drive.google.com/open?id=1tBD9YCwtWZs0J4mQoXrxtwk7CGMkiRXY";
        }
        else if(mod == 183)
        {
            module = "https://drive.google.com/open?id=1tBD9YCwtWZs0J4mQoXrxtwk7CGMkiRXY";
        }
        else if(mod == 184)
        {
            module = "https://drive.google.com/open?id=1tBD9YCwtWZs0J4mQoXrxtwk7CGMkiRXY";
        }
        else if(mod == 185)
        {
            module = "https://drive.google.com/open?id=1tBD9YCwtWZs0J4mQoXrxtwk7CGMkiRXY";
        }
        else if(mod == 186)
        {
            module = "https://drive.google.com/open?id=1tBD9YCwtWZs0J4mQoXrxtwk7CGMkiRXY";
        }
        if(mod == 281)
        {
            module = "https://drive.google.com/open?id=1MI5EGnXbtSWHzPBKZBqJlupqOjLOJTEC";
        }
        else if(mod == 282)
        {
            module = "https://drive.google.com/open?id=1MI5EGnXbtSWHzPBKZBqJlupqOjLOJTEC";
        }
        else if(mod == 283)
        {
            module = "https://drive.google.com/open?id=1MI5EGnXbtSWHzPBKZBqJlupqOjLOJTEC";
        }
        else if(mod == 284)
        {
            module = "https://drive.google.com/open?id=1MI5EGnXbtSWHzPBKZBqJlupqOjLOJTEC";
        }
        else if(mod == 285)
        {
            module = "https://drive.google.com/open?id=1MI5EGnXbtSWHzPBKZBqJlupqOjLOJTEC";
        }
        else if(mod == 286)
        {
            module = "https://drive.google.com/open?id=1MI5EGnXbtSWHzPBKZBqJlupqOjLOJTEC";
        }
        if(mod == 381)
        {
            module = "https://drive.google.com/open?id=17varnYI5DnMb8e1_skMCBXcjyqsb_s_Y";
        }
        else if(mod == 382)
        {
            module = "https://drive.google.com/open?id=17varnYI5DnMb8e1_skMCBXcjyqsb_s_Y";
        }
        else if(mod == 383)
        {
            module = "https://drive.google.com/open?id=17varnYI5DnMb8e1_skMCBXcjyqsb_s_Y";
        }
        else if(mod == 384)
        {
            module = "https://drive.google.com/open?id=17varnYI5DnMb8e1_skMCBXcjyqsb_s_Y";
        }
        else if(mod == 385)
        {
            module = "https://drive.google.com/open?id=17varnYI5DnMb8e1_skMCBXcjyqsb_s_Y";
        }
        else if(mod == 386)
        {
            module = "https://drive.google.com/open?id=17varnYI5DnMb8e1_skMCBXcjyqsb_s_Y";
        }
        if(mod == 481)
        {
            module = "https://drive.google.com/open?id=1Gso9tnVFq4UhsotHh_EDlf3Vsid2y6Xw";
        }
        else if(mod == 482)
        {
            module = "https://drive.google.com/open?id=1Gso9tnVFq4UhsotHh_EDlf3Vsid2y6Xw";
        }
        else if(mod == 483)
        {
            module = "https://drive.google.com/open?id=1Gso9tnVFq4UhsotHh_EDlf3Vsid2y6Xw";
        }
        else if(mod == 484)
        {
            module = "https://drive.google.com/open?id=1Gso9tnVFq4UhsotHh_EDlf3Vsid2y6Xw";
        }
        else if(mod == 485)
        {
            module = "https://drive.google.com/open?id=1Gso9tnVFq4UhsotHh_EDlf3Vsid2y6Xw";
        }
        else if(mod == 486)
        {
            module = "https://drive.google.com/open?id=1Gso9tnVFq4UhsotHh_EDlf3Vsid2y6Xw";
        }
        if(mod == 581)
        {
            module = "https://drive.google.com/open?id=1j55c-s-bZNMwC3AcoYpz8lWOGYMKGn2S";
        }
        else if(mod == 582)
        {
            module = "https://drive.google.com/open?id=1j55c-s-bZNMwC3AcoYpz8lWOGYMKGn2S";
        }
        else if(mod == 583)
        {
            module = "https://drive.google.com/open?id=1j55c-s-bZNMwC3AcoYpz8lWOGYMKGn2S";
        }
        else if(mod == 584)
        {
            module = "https://drive.google.com/open?id=1j55c-s-bZNMwC3AcoYpz8lWOGYMKGn2S";
        }
        else if(mod == 585)
        {
            module = "https://drive.google.com/open?id=1j55c-s-bZNMwC3AcoYpz8lWOGYMKGn2S";
        }
        else if(mod == 586)
        {
            module = "https://drive.google.com/open?id=1j55c-s-bZNMwC3AcoYpz8lWOGYMKGn2S";
        }
    }
}
