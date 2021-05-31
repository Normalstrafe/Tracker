package com.example.tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculate extends AppCompatActivity {
    private Button RunButton;
    private Button MillButton;
    private Button PowerButton;
    private Button CardioButton;
    private Button FitnessButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        RunButton = (Button) findViewById(R.id.button1);
        RunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        MillButton = (Button) findViewById(R.id.button2);
        MillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        PowerButton = (Button) findViewById(R.id.button3);
        PowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        CardioButton = (Button) findViewById(R.id.button4);
        CardioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
        FitnessButton = (Button) findViewById(R.id.button5);
        FitnessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });

    }

    public void openActivity4() {
        Intent intent = new Intent(this, Mill.class);
        startActivity(intent);
    }

    public void openActivity3() {
        Intent intent = new Intent(this, RunTraining.class);
        startActivity(intent);
    }

    public void openActivity5() {
        Intent intent = new Intent(this, Power.class);
        startActivity(intent);
    }
    public void openActivity6() {
        Intent intent = new Intent(this, Cardio.class);
        startActivity(intent);
    }
    public void openActivity7() {
        Intent intent = new Intent(this, Fitness.class);
        startActivity(intent);
    }
}
