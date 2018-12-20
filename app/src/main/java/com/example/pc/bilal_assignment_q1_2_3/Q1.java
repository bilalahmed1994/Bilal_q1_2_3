package com.example.pc.bilal_assignment_q1_2_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Q1 extends AppCompatActivity {
    // views reference
    private TextView textview;
    private Button add ,clear ,calculator;/*openRelativeActivity;*/
    private EditText edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);


        // initializing the views refernce with views object from xml
        textview= findViewById(R.id.textview);
        add= findViewById(R.id.add);
        clear= findViewById(R.id.clear);
        edittext =findViewById(R.id.edittext);
        calculator =findViewById(R.id.calculator);
       /* openRelativeActivity =findViewById(R.id.openRel);*/

        // click listener for button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edittext.getText().toString().trim().length() == 0){
                    Toast.makeText(Q1.this , "Enter Text" , Toast.LENGTH_SHORT).show();
                    return;
                }

                if(edittext != null){
                    if(textview !=null){
                        textview.setText(edittext.getText().toString());
                    }
                }

            }
        });

        // click listener for button
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edittext.getText().toString().trim().length() == 0){

                    if(textview.getText().toString().length() != 0){
                        textview.setText("");
                    }

                    Toast.makeText(Q1.this , "No Text To Clear" , Toast.LENGTH_SHORT).show();
                    return;
                }

                if(textview !=null){
                    textview.setText("");
                }

                if(edittext != null){
                    edittext.setText("");
                }
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Q1.this , calculator.class));
            }
        });

      /*  openRelativeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Q1.this, RelativeLayoutExampleActivity.class));
            }
        });*/


    }
}
