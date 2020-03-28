package com.example.gceklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.HashMap;

public class Home extends AppCompatActivity {

    TextView academic, social, tech;
    TextView sports, arts, business;
    TextView profile;
    AutoCompleteTextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        academic = findViewById(R.id.academicHome);
        social = findViewById(R.id.socialHome);
        tech = findViewById(R.id.techHome);
        sports = findViewById(R.id.sportsHome);
        arts = findViewById(R.id.artsHome);
        business = findViewById(R.id.businessHome);
        profile = findViewById(R.id.profileHome);
        word = findViewById(R.id.word);

        String[] strings = new String[]{"COA","PDD","OS","OOPS","EM3","LS"};
        word.setAdapter(new ArrayAdapter<String>(Home.this, android.R.layout.simple_list_item_1, strings));

        academic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Academic.class);
                startActivity(intent);
            }
        });
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Social.class);
                startActivity(intent);
            }
        });
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Technology.class);
                startActivity(intent);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Sports.class);
                startActivity(intent);
            }
        });
        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Arts.class);
                startActivity(intent);
            }
        });
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Business.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(Home.this,Authentication.class);
        }
        return super.onKeyDown(keyCode, event);
    }
}
