package com.example.gceklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView academic, nonacademic;
    TextView articles, notification;
    TextView profile;
    AutoCompleteTextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        academic = findViewById(R.id.academicHome);
        nonacademic = findViewById(R.id.nonacademicHome);
        articles = findViewById(R.id.articleHome);
        notification = findViewById(R.id.notificationHome);
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
        nonacademic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Nonacademic.class);
                startActivity(intent);
            }
        });
        articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Article.class);
                startActivity(intent);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Notification.class);
                startActivity(intent);
            }
        });
    }
}
