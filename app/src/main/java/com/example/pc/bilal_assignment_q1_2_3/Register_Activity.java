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

public class Register_Activity extends AppCompatActivity {
    boolean check;
    //fields
    private EditText firstNameText, lastNameText, passwordText, cpasswordText, emailText;
    private Button homeActButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        //fields references from xml
        firstNameText = findViewById(R.id.fname);
        lastNameText = findViewById(R.id.lname);
        emailText = findViewById(R.id.email);
        passwordText = findViewById(R.id.pass);
        cpasswordText = findViewById(R.id.cpass);
        homeActButton = findViewById(R.id.regtohomeact);

        //listener on button
        homeActButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNameText.getText().toString().trim().length() == 0 || lastNameText.getText().toString().trim().length() == 0 || emailText.getText().toString().trim().length() == 0 || passwordText.getText().toString().trim().length() == 0 || cpasswordText.getText().toString().trim().length() == 0 )
                {
                    Toast.makeText(Register_Activity.this,"Complete All Fields",Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivity(new Intent(Register_Activity.this, Home_Activity.class));
                }
                }

        });
    }
}

