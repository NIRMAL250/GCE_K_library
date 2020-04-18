package com.example.gceklibrary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    TextView academic, nonacademic;
    TextView articles, notification;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        academic = findViewById(R.id.academicHome);
        nonacademic = findViewById(R.id.nonacademicHome);
        articles = findViewById(R.id.articleHome);
        notification = findViewById(R.id.notificationHome);

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
                intent.putExtra("FLAG",""+ (++i));
                startActivity(intent);
            }
        });
        articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Home.this, Article.class);
                //startActivity(intent);
                Toast.makeText(Home.this,"Under development...",Toast.LENGTH_SHORT).show();
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(Home.this, Notification.class);
               // startActivity(intent);
                Toast.makeText(Home.this,"Under development...",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
