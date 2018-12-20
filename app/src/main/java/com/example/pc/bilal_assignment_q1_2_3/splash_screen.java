package com.example.pc.bilal_assignment_q1_2_3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable(){
            @Override

            public void run(){

                Intent loginIntent=new Intent(splash_screen.this, Login.class);
                startActivity(loginIntent);
                finish();
            }

        },SPLASH_TIME_OUT);

    }
}
