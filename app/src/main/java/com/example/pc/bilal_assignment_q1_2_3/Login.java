package com.example.pc.bilal_assignment_q1_2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends AppCompatActivity {

    private EditText editEmailText , editPasswordText;
    private Button LoginButton, RegisterButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //fields references from xml
        editEmailText = findViewById(R.id.edittextemail);
        editPasswordText = findViewById(R.id.edittextpass);
        LoginButton = findViewById(R.id.loginbutton);
        RegisterButton = findViewById(R.id.regbutton);

        //listener on button
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Toast.makeText(Login.this, "Login Button is Pressed", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login.this,Home_Activity.class));
                }
        });

        //listener on button
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Register_Activity.class));
            }
        });
    }
}