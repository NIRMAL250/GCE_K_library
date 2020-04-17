package com.example.gceklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
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
    int PLAY = 0;

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
                final MediaPlayer player = new MediaPlayer();
                try{
                    if(PLAY == 0) {
                        Uri uri = Uri.parse("http://node-23.zeno.fm/8u7gh0uy8vzuv?rj-ttl=4&rj-tok=AAABcYcyHMEArhLhG9A3UMzaDA");
                        player.setAudioStreamType(AudioManager.STREAM_MUSIC);
                        player.setDataSource(Nonacademic.this, uri);
                        player.prepare();
                        PLAY = 1;
                        player.start();
                    }
                    else if(PLAY == 1)
                    {
                        Toast.makeText(Nonacademic.this,"stopping..",Toast.LENGTH_SHORT).show();
                        PLAY = 0;
                        player.stop();
                        player.reset();
                        player.release();
                    }
                }catch (Exception e)
                {
                    System.out.println(e.toString());
                }
            }
        });
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               url = "";
                Intent intent = new Intent(Nonacademic.this, Link.class);
                intent.putExtra("LINK",url);
                startActivity(intent);
            }
        });
    }
}