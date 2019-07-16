package com.example.homework311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView btn_00;
    private TextView btn_01;
    private TextView btn_02;
    private TextView btn_03;
    private TextView btn_04;
    private TextView btn_05;
    private TextView btn_06;
    private TextView btn_07;
    private TextView btn_08;
    private TextView btn_09;
    private TextView btn_dot;
    private TextView result;
    private boolean initDefault = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn_00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("0");
            }
        });
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("1");
            }
        });
        btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("2");
            }
        });
        btn_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("3");
            }
        });
        btn_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("4");
            }
        });
        btn_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("5");
            }
        });
        btn_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("6");
            }
        });
        btn_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("7");
            }
        });
        btn_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("8");
            }
        });
        btn_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult("9");
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addResult(".");
            }
        });
    }
    private void initView(){
        btn_00=findViewById(R.id.txt00);
        btn_01=findViewById(R.id.txt01);
        btn_02=findViewById(R.id.txt02);
        btn_03=findViewById(R.id.txt03);
        btn_04=findViewById(R.id.txt04);
        btn_05=findViewById(R.id.txt05);
        btn_06=findViewById(R.id.txt06);
        btn_07=findViewById(R.id.txt07);
        btn_08=findViewById(R.id.txt08);
        btn_09=findViewById(R.id.txt09);
        btn_dot=findViewById(R.id.txt_dot);
        result = findViewById(R.id.result);
    }
    private void addResult(String value){
        String resultText;
        resultText = result.getText().toString();
        if(!initDefault){
            resultText="";
            initDefault=true;
        }
        resultText += value;
        result.setText(resultText);
    }
}
