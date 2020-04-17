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
    AutoCompleteTextView word;
    private ArrayList<String> books = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        academic = findViewById(R.id.academicHome);
        nonacademic = findViewById(R.id.nonacademicHome);
        articles = findViewById(R.id.articleHome);
        notification = findViewById(R.id.notificationHome);
        word = findViewById(R.id.word);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReferenceFromUrl("https://gce-k-library.firebaseio.com/books");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Home.this, android.R.layout.simple_list_item_1, books);
        word.setAdapter(arrayAdapter);
        myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String value = dataSnapshot.getValue(String.class);
                books.add(value);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

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
                //Intent intent = new Intent(Home.this, Article.class);
                //startActivity(intent);
                Toast.makeText(Home.this,"Under development...",Toast.LENGTH_SHORT).show();
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
