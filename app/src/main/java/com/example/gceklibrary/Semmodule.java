package com.example.gceklibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Semmodule extends AppCompatActivity {
    TextView m1, m2, m3, m4, m5, m6;
    int branchsemmod;
    String s,b;
    int sem, branch;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semmodule);

        s = getIntent().getStringExtra("SEM");
        sem = Integer.parseInt(s);
        b = getIntent().getStringExtra("BRANCH");
        branch = Integer.parseInt(b);

        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);
        m3 = findViewById(R.id.m3);
        m4 = findViewById(R.id.m4);
        m5 = findViewById(R.id.m5);
        m6 = findViewById(R.id.m6);
        branch_sem();
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branchsemmod = branchsemmod + 1;
                Intent intent = new Intent(Semmodule.this, Module.class);
                intent.putExtra("MODULE",branchsemmod);
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branchsemmod = branchsemmod + 2;
                Intent intent = new Intent(Semmodule.this, Module.class);
                intent.putExtra("MODULE",branchsemmod);
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branchsemmod = branchsemmod + 3;
                String bsm = Integer.toString(branchsemmod);
                Intent intent = new Intent(Semmodule.this, Module.class);
                intent.putExtra("MODULE",bsm);
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branchsemmod = branchsemmod + 4;
                Intent intent = new Intent(Semmodule.this, Module.class);
                intent.putExtra("MODULE",branchsemmod);
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branchsemmod = branchsemmod + 5;
                Intent intent = new Intent(Semmodule.this, Module.class);
                intent.putExtra("MODULE",branchsemmod);
                startActivity(intent);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branchsemmod = branchsemmod + 6;
                Intent intent = new Intent(Semmodule.this, Module.class);
                intent.putExtra("MODULE",branchsemmod);
                startActivity(intent);
            }
        });
    }
    private void branch_sem()
    {
        if(branch == 1)
        {
            switch (sem)
            {
                case 1 : branchsemmod = 110;
                    break;
                case 2 : branchsemmod = 120;
                    break;
                case 3 : branchsemmod = 130;
                    break;
                case 4 : branchsemmod = 140;
                    break;
                case 5 : branchsemmod = 150;
                    break;
                case 6 : branchsemmod = 160;
                    break;
                case 7 : branchsemmod = 170;
                    break;
                case 8 : branchsemmod = 180;
                    break;
            }
        }
        else if(branch == 2)
        {
            switch (sem)
            {
                case 1 : branchsemmod = 210;
                    break;
                case 2 : branchsemmod = 220;
                    break;
                case 3 : branchsemmod = 230;
                    break;
                case 4 : branchsemmod = 240;
                    break;
                case 5 : branchsemmod = 250;
                    break;
                case 6 : branchsemmod = 260;
                    break;
                case 7 : branchsemmod = 270;
                    break;
                case 8 : branchsemmod = 280;
                    break;
            }
        }
        else if(branch == 3)
        {
            switch (sem)
            {
                case 1 : branchsemmod = 310;
                    break;
                case 2 : branchsemmod = 320;
                    break;
                case 3 : branchsemmod = 330;
                    break;
                case 4 : branchsemmod = 340;
                    break;
                case 5 : branchsemmod = 350;
                    break;
                case 6 : branchsemmod = 360;
                    break;
                case 7 : branchsemmod = 370;
                    break;
                case 8 : branchsemmod = 380;
                    break;
            }
        }
        else if(branch == 4)
        {
            switch (sem)
            {
                case 1 : branchsemmod = 410;
                    break;
                case 2 : branchsemmod = 420;
                    break;
                case 3 : branchsemmod = 430;
                    break;
                case 4 : branchsemmod = 440;
                    break;
                case 5 : branchsemmod = 450;
                    break;
                case 6 : branchsemmod = 460;
                    break;
                case 7 : branchsemmod = 470;
                    break;
                case 8 : branchsemmod = 480;
                    break;
            }
        }
        else if(branch == 5)
        {
            switch (sem)
            {
                case 1 : branchsemmod = 510;
                    break;
                case 2 : branchsemmod = 520;
                    break;
                case 3 : branchsemmod = 530;
                    break;
                case 4 : branchsemmod = 540;
                    break;
                case 5 : branchsemmod = 550;
                    break;
                case 6 : branchsemmod = 560;
                    break;
                case 7 : branchsemmod = 570;
                    break;
                case 8 : branchsemmod = 580;
                    break;
            }
        }
    }
}
