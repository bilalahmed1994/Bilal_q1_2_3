package com.example.pc.bilal_assignment_q1_2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button q12,q3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         q12 = findViewById(R.id.q12);
         q3 = findViewById(R.id.q3);

         q12.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this,"Question 1 and 2 is Clicked",Toast.LENGTH_SHORT).show();
                 startActivity(new Intent(MainActivity.this , Q1.class));
             }
         });

         q3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this,"Question3 is Clicked",Toast.LENGTH_SHORT).show();
                 startActivity(new Intent(MainActivity.this , splash_screen.class));
             }
         });
    }
}
