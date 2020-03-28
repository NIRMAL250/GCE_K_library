package com.example.gceklibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Academic extends AppCompatActivity {
    TextView cse, ece, eee, me, ce, common;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);

        cse = findViewById(R.id.academicCSE);
        ece = findViewById(R.id.academicECE);
        eee = findViewById(R.id.academicEEE);
        me = findViewById(R.id.academicME);
        ce = findViewById(R.id.academicCE);
        common = findViewById(R.id.academicCOMMON);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academic.this, Semcse.class);
                startActivity(intent);
            }
        });
    }
}
