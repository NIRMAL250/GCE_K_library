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
            module = "";
        }
        else if(mod == 112)
        {
            module = "";
        }
        else if(mod == 113)
        {
            module = "";
        }
        else if(mod == 114)
        {
            module = "";
        }
        else if(mod == 115)
        {
            module = "";
        }
        else if(mod == 116)
        {
            module = "";
        }
        if(mod == 211)
        {
            module = "";
        }
        else if(mod == 212)
        {
            module = "";
        }
        else if(mod == 213)
        {
            module = "";
        }
        else if(mod == 214)
        {
            module = "";
        }
        else if(mod == 215)
        {
            module = "";
        }
        else if(mod == 216)
        {
            module = "";
        }
        if(mod == 311)
        {
            module = "";
        }
        else if(mod == 312)
        {
            module = "";
        }
        else if(mod == 313)
        {
            module = "";
        }
        else if(mod == 314)
        {
            module = "";
        }
        else if(mod == 315)
        {
            module = "";
        }
        else if(mod == 316)
        {
            module = "";
        }
        if(mod == 411)
        {
            module = "";
        }
        else if(mod == 412)
        {
            module = "";
        }
        else if(mod == 413)
        {
            module = "";
        }
        else if(mod == 414)
        {
            module = "";
        }
        else if(mod == 415)
        {
            module = "";
        }
        else if(mod == 416)
        {
            module = "";
        }
        if(mod == 511)
        {
            module = "";
        }
        else if(mod == 512)
        {
            module = "";
        }
        else if(mod == 513)
        {
            module = "";
        }
        else if(mod == 514)
        {
            module = "";
        }
        else if(mod == 515)
        {
            module = "";
        }
        else if(mod == 516)
        {
            module = "";
        }
        if(mod == 121)
        {
            module = "";
        }
        else if(mod == 122)
        {
            module = "";
        }
        else if(mod == 123)
        {
            module = "";
        }
        else if(mod == 124)
        {
            module = "";
        }
        else if(mod == 125)
        {
            module = "";
        }
        else if(mod == 126)
        {
            module = "";
        }
        if(mod == 221)
        {
            module = "";
        }
        else if(mod == 222)
        {
            module = "";
        }
        else if(mod == 223)
        {
            module = "";
        }
        else if(mod == 224)
        {
            module = "";
        }
        else if(mod == 225)
        {
            module = "";
        }
        else if(mod == 226)
        {
            module = "";
        }
        if(mod == 321)
        {
            module = "";
        }
        else if(mod == 322)
        {
            module = "";
        }
        else if(mod == 323)
        {
            module = "";
        }
        else if(mod == 324)
        {
            module = "";
        }
        else if(mod == 325)
        {
            module = "";
        }
        else if(mod == 326)
        {
            module = "";
        }
        if(mod == 421)
        {
            module = "";
        }
        else if(mod == 422)
        {
            module = "";
        }
        else if(mod == 423)
        {
            module = "";
        }
        else if(mod == 424)
        {
            module = "";
        }
        else if(mod == 425)
        {
            module = "";
        }
        else if(mod == 426)
        {
            module = "";
        }
        if(mod == 521)
        {
            module = "";
        }
        else if(mod == 522)
        {
            module = "";
        }
        else if(mod == 523)
        {
            module = "";
        }
        else if(mod == 524)
        {
            module = "";
        }
        else if(mod == 525)
        {
            module = "";
        }
        else if(mod == 526)
        {
            module = "";
        }
        if(mod == 131)
        {
            module = "";
        }
        else if(mod == 132)
        {
            module = "";
        }
        else if(mod == 133)
        {
            module = "";
        }
        else if(mod == 134)
        {
            module = "";
        }
        else if(mod == 135)
        {
            module = "";
        }
        else if(mod == 136)
        {
            module = "";
        }
        if(mod == 231)
        {
            module = "";
        }
        else if(mod == 232)
        {
            module = "";
        }
        else if(mod == 233)
        {
            module = "";
        }
        else if(mod == 234)
        {
            module = "";
        }
        else if(mod == 235)
        {
            module = "";
        }
        else if(mod == 236)
        {
            module = "";
        }
        if(mod == 331)
        {
            module = "";
        }
        else if(mod == 332)
        {
            module = "";
        }
        else if(mod == 333)
        {
            module = "";
        }
        else if(mod == 334)
        {
            module = "";
        }
        else if(mod == 335)
        {
            module = "";
        }
        else if(mod == 336)
        {
            module = "";
        }
        if(mod == 431)
        {
            module = "";
        }
        else if(mod == 432)
        {
            module = "";
        }
        else if(mod == 433)
        {
            module = "";
        }
        else if(mod == 434)
        {
            module = "";
        }
        else if(mod == 435)
        {
            module = "";
        }
        else if(mod == 436)
        {
            module = "";
        }
        if(mod == 531)
        {
            module = "";
        }
        else if(mod == 532)
        {
            module = "";
        }
        else if(mod == 533)
        {
            module = "";
        }
        else if(mod == 534)
        {
            module = "";
        }
        else if(mod == 535)
        {
            module = "";
        }
        else if(mod == 536)
        {
            module = "";
        }
        if(mod == 141)
        {
            module = "";
        }
        else if(mod == 142)
        {
            module = "";
        }
        else if(mod == 143)
        {
            module = "https://drive.google.com/open?id=1ez7AVh0WlNJ4VjABOzzIQ7kU60jzstvQ";
        }
        else if(mod == 144)
        {
            module = "";
        }
        else if(mod == 145)
        {
            module = "";
        }
        else if(mod == 146)
        {
            module = "";
        }
        if(mod == 241)
        {
            module = "";
        }
        else if(mod == 242)
        {
            module = "";
        }
        else if(mod == 243)
        {
            module = "https://drive.google.com/open?id=1RqzURQMDK-mcJjbDINjuD_58lxaE5kMq ";
        }
        else if(mod == 244)
        {
            module = "";
        }
        else if(mod == 245)
        {
            module = "";
        }
        else if(mod == 246)
        {
            module = "";
        }
        if(mod == 341)
        {
            module = "";
        }
        else if(mod == 342)
        {
            module = "";
        }
        else if(mod == 343)
        {
            module = "";
        }
        else if(mod == 344)
        {
            module = "";
        }
        else if(mod == 345)
        {
            module = "";
        }
        else if(mod == 346)
        {
            module = "";
        }
        if(mod == 441)
        {
            module = "";
        }
        else if(mod == 442)
        {
            module = "";
        }
        else if(mod == 443)
        {
            module = "";
        }
        else if(mod == 444)
        {
            module = "";
        }
        else if(mod == 445)
        {
            module = "";
        }
        else if(mod == 446)
        {
            module = "";
        }
        if(mod == 541)
        {
            module = "";
        }
        else if(mod == 542)
        {
            module = "";
        }
        else if(mod == 543)
        {
            module = "";
        }
        else if(mod == 544)
        {
            module = "";
        }
        else if(mod == 545)
        {
            module = "";
        }
        else if(mod == 546)
        {
            module = "";
        }
        if(mod == 151)
        {
            module = "";
        }
        else if(mod == 152)
        {
            module = "";
        }
        else if(mod == 153)
        {
            module = "";
        }
        else if(mod == 154)
        {
            module = "";
        }
        else if(mod == 155)
        {
            module = "";
        }
        else if(mod == 156)
        {
            module = "";
        }
        if(mod == 251)
        {
            module = "";
        }
        else if(mod == 252)
        {
            module = "";
        }
        else if(mod == 253)
        {
            module = "";
        }
        else if(mod == 254)
        {
            module = "";
        }
        else if(mod == 255)
        {
            module = "";
        }
        else if(mod == 256)
        {
            module = "";
        }
        if(mod == 351)
        {
            module = "";
        }
        else if(mod == 352)
        {
            module = "";
        }
        else if(mod == 353)
        {
            module = "";
        }
        else if(mod == 354)
        {
            module = "";
        }
        else if(mod == 355)
        {
            module = "";
        }
        else if(mod == 356)
        {
            module = "";
        }
        if(mod == 451)
        {
            module = "";
        }
        else if(mod == 452)
        {
            module = "";
        }
        else if(mod == 453)
        {
            module = "";
        }
        else if(mod == 454)
        {
            module = "";
        }
        else if(mod == 455)
        {
            module = "";
        }
        else if(mod == 456)
        {
            module = "";
        }
        if(mod == 551)
        {
            module = "";
        }
        else if(mod == 552)
        {
            module = "";
        }
        else if(mod == 553)
        {
            module = "";
        }
        else if(mod == 554)
        {
            module = "";
        }
        else if(mod == 555)
        {
            module = "";
        }
        else if(mod == 556)
        {
            module = "";
        }
        if(mod == 161)
        {
            module = "";
        }
        else if(mod == 162)
        {
            module = "";
        }
        else if(mod == 163)
        {
            module = "";
        }
        else if(mod == 164)
        {
            module = "";
        }
        else if(mod == 165)
        {
            module = "";
        }
        else if(mod == 166)
        {
            module = "";
        }
        if(mod == 261)
        {
            module = "";
        }
        else if(mod == 262)
        {
            module = "";
        }
        else if(mod == 263)
        {
            module = "";
        }
        else if(mod == 264)
        {
            module = "";
        }
        else if(mod == 265)
        {
            module = "";
        }
        else if(mod == 266)
        {
            module = "";
        }
        if(mod == 361)
        {
            module = "";
        }
        else if(mod == 362)
        {
            module = "";
        }
        else if(mod == 363)
        {
            module = "";
        }
        else if(mod == 364)
        {
            module = "";
        }
        else if(mod == 365)
        {
            module = "";
        }
        else if(mod == 366)
        {
            module = "";
        }
        if(mod == 461)
        {
            module = "";
        }
        else if(mod == 462)
        {
            module = "";
        }
        else if(mod == 463)
        {
            module = "";
        }
        else if(mod == 464)
        {
            module = "";
        }
        else if(mod == 465)
        {
            module = "";
        }
        else if(mod == 466)
        {
            module = "";
        }
        if(mod == 561)
        {
            module = "";
        }
        else if(mod == 562)
        {
            module = "";
        }
        else if(mod == 563)
        {
            module = "";
        }
        else if(mod == 564)
        {
            module = "";
        }
        else if(mod == 565)
        {
            module = "";
        }
        else if(mod == 566)
        {
            module = "";
        }
        if(mod == 171)
        {
            module = "";
        }
        else if(mod == 172)
        {
            module = "";
        }
        else if(mod == 173)
        {
            module = "";
        }
        else if(mod == 174)
        {
            module = "";
        }
        else if(mod == 175)
        {
            module = "";
        }
        else if(mod == 176)
        {
            module = "";
        }
        if(mod == 271)
        {
            module = "";
        }
        else if(mod == 272)
        {
            module = "";
        }
        else if(mod == 273)
        {
            module = "";
        }
        else if(mod == 274)
        {
            module = "";
        }
        else if(mod == 275)
        {
            module = "";
        }
        else if(mod == 276)
        {
            module = "";
        }
        if(mod == 371)
        {
            module = "";
        }
        else if(mod == 372)
        {
            module = "";
        }
        else if(mod == 373)
        {
            module = "";
        }
        else if(mod == 374)
        {
            module = "";
        }
        else if(mod == 375)
        {
            module = "";
        }
        else if(mod == 376)
        {
            module = "";
        }
        if(mod == 471)
        {
            module = "";
        }
        else if(mod == 472)
        {
            module = "";
        }
        else if(mod == 473)
        {
            module = "";
        }
        else if(mod == 474)
        {
            module = "";
        }
        else if(mod == 475)
        {
            module = "";
        }
        else if(mod == 476)
        {
            module = "";
        }
        if(mod == 571)
        {
            module = "";
        }
        else if(mod == 572)
        {
            module = "";
        }
        else if(mod == 573)
        {
            module = "";
        }
        else if(mod == 574)
        {
            module = "";
        }
        else if(mod == 575)
        {
            module = "";
        }
        else if(mod == 576)
        {
            module = "";
        }
        if(mod == 181)
        {
            module = "";
        }
        else if(mod == 182)
        {
            module = "";
        }
        else if(mod == 183)
        {
            module = "";
        }
        else if(mod == 184)
        {
            module = "";
        }
        else if(mod == 185)
        {
            module = "";
        }
        else if(mod == 186)
        {
            module = "";
        }
        if(mod == 281)
        {
            module = "";
        }
        else if(mod == 282)
        {
            module = "";
        }
        else if(mod == 283)
        {
            module = "";
        }
        else if(mod == 284)
        {
            module = "";
        }
        else if(mod == 285)
        {
            module = "";
        }
        else if(mod == 286)
        {
            module = "";
        }
        if(mod == 381)
        {
            module = "";
        }
        else if(mod == 382)
        {
            module = "";
        }
        else if(mod == 383)
        {
            module = "";
        }
        else if(mod == 384)
        {
            module = "";
        }
        else if(mod == 385)
        {
            module = "";
        }
        else if(mod == 386)
        {
            module = "";
        }
        if(mod == 481)
        {
            module = "";
        }
        else if(mod == 482)
        {
            module = "";
        }
        else if(mod == 483)
        {
            module = "";
        }
        else if(mod == 484)
        {
            module = "";
        }
        else if(mod == 485)
        {
            module = "";
        }
        else if(mod == 486)
        {
            module = "";
        }
        if(mod == 581)
        {
            module = "";
        }
        else if(mod == 582)
        {
            module = "";
        }
        else if(mod == 583)
        {
            module = "";
        }
        else if(mod == 584)
        {
            module = "";
        }
        else if(mod == 585)
        {
            module = "";
        }
        else if(mod == 586)
        {
            module = "";
        }
    }
}
