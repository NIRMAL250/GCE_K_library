package com.example.gceklibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.HashMap;

public class Authentication extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private String email, password;
    private TextView login;
    EditText id, pass;
    HashMap<String,String> mapid = new HashMap<String, String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        mAuth = FirebaseAuth.getInstance();

        mapid.put("18B095","nirmal.p.jee@gmail.com");
        mapid.put("18B124","susmth508@gmail.com");
        mapid.put("19B003","shethabindhcpsalil@gmail.com");

        id = findViewById(R.id.id);
        pass = findViewById(R.id.pass);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid = id.getText().toString().trim();
                password = pass.getText().toString().trim();
                if (check()) {
                    if (mapid.containsKey(uid)) {
                        email = mapid.get(uid);
                        signIn();
                    } else {
                        id.setError("Userid incorrect");
                    }
                }
            }
        });
    }
    private void signIn()
    {
        if(check()) {
            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                FirebaseUser user = mAuth.getCurrentUser();
                                updateUI();
                            } else {
                                // If sign in fails, display a message to the user.
                                Toast.makeText(Authentication.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
    private void updateUI()
    {
        Intent intent = new Intent(Authentication.this, Home.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
    private boolean check()
    {
        EditText fields[] = {id,pass};

        for(int i = 0; i < fields.length; i++)
        {
            if(TextUtils.isEmpty(fields[i].getText()))
            {
                fields[i].setError("Required Field");
                return false;
            }
        }
        return true;
    }
}
