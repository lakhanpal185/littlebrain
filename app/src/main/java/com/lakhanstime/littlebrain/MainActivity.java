package com.lakhanstime.littlebrain;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     int val;
     int counter = 0;
    Button nextquestion;
    Button[] btn = new Button[10];
    Button sbmt;
    TextView question;
    TextView userno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random myno = new Random();

        nextquestion = findViewById(R.id.nextquestion);
        question = findViewById(R.id.question);
        userno = findViewById(R.id.usernumber);
       // number buttons
        btn[0] = findViewById(R.id.button1);
        btn[1] = findViewById(R.id.button2);
        btn[2] = findViewById(R.id.button3);
        btn[3] = findViewById(R.id.button4);
        btn[4] = findViewById(R.id.button5);
        btn[5] = findViewById(R.id.button6);
        btn[6] = findViewById(R.id.button7);
        btn[7] = findViewById(R.id.button8);
        btn[8] = findViewById(R.id.button9);
        btn[9] = findViewById(R.id.button0);

       //   end
        // submit initialization
        sbmt = findViewById(R.id.submit);
        //done

        nextquestion.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
             val = myno.nextInt(100);
            question.setText(Integer.toString(val));
            userno.setText("waiting...");
            counter = 0;
            }
        });
        // clicking button  created number
        btn[0].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 1;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[1].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 2;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 3;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 4;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 5;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 6;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 7;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 8;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 9;
                userno.setText(Integer.toString(counter));
            }
        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                counter = counter*10 + 0;
                userno.setText(Integer.toString(counter));
            }
        });
        sbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val == counter)
                {
                    question.setText("Nice");
                    counter = 0;
                }
                else
                    question.setText("Try more");
                counter = 0;
               }
        });


    }
}