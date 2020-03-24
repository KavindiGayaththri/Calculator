package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

        EditText num1, num2;
        TextView ans;
        Button add, sub, mul,div;

        String a, b;
        double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.editT1_Second);
        num2 = findViewById(R.id.editT1_Second);
        ans = findViewById(R.id.textV3_Second);
        add = findViewById(R.id.btnAdd_Second);
        sub = findViewById(R.id.btnSub_Second);
        mul = findViewById(R.id.btnMul_Second);
        div = findViewById(R.id.btnDiv_Second);

        Intent receivedVal = getIntent();

        a = receivedVal.getStringExtra("num1");
        b = receivedVal.getStringExtra("num2");

        num1.setText(a);
        num2.setText(b);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(a) + Double.parseDouble(b);
                ans.setText(Double.toString(answer));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(a) - Double.parseDouble(b);
                ans.setText(Double.toString(answer));
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(a) * Double.parseDouble(b);
                ans.setText(Double.toString(answer));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(a) / Double.parseDouble(b);
                ans.setText(Double.toString(answer));
            }
        });
    }
}
