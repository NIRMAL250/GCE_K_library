package com.example.gceklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Semester extends AppCompatActivity {

    TextView s1, s2, s3, s4, s5, s6, s7, s8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        final String opt = getIntent().getStringExtra("BRANCH");
        //final int opt = Integer.parseInt(s);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);
        s5 = findViewById(R.id.s5);
        s6 = findViewById(R.id.s6);
        s7 = findViewById(R.id.s7);
        s8 = findViewById(R.id.s8);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Semester.this, Semmodule.class);
                intent.putExtra("SEM", "1");
                intent.putExtra("BRANCH",opt);
                startActivity(intent);
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Semester.this, Semmodule.class);
                intent.putExtra("SEM", "2");
                intent.putExtra("BRANCH",opt);
                startActivity(intent);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Semester.this, Semmodule.class);
                intent.putExtra("SEM", "3");
                intent.putExtra("BRANCH",opt);
                startActivity(intent);
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Semester.this, Semmodule.class);
                intent.putExtra("SEM", "4");
                intent.putExtra("BRANCH",(String)opt);
                startActivity(intent);
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Semester.this, Semmodule.class);
                intent.putExtra("SEM", "5");
                intent.putExtra("BRANCH",opt);
                startActivity(intent);
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Semester.this, Semmodule.class);
                intent.putExtra("SEM", "6");
                intent.putExtra("BRANCH",opt);
                startActivity(intent);
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Semester.this, Semmodule.class);
                intent.putExtra("SEM", "7");
                intent.putExtra("BRANCH",opt);
                startActivity(intent);
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Semester.this, Semmodule.class);
                intent.putExtra("SEM", "8");
                intent.putExtra("BRANCH",opt);
                startActivity(intent);
            }
        });
    }
}
