package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.security.auth.login.LoginException;

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

        num1 = findViewById(R.id.ET1_second);
        num2 = findViewById(R.id.ET2_second);
        ans = findViewById(R.id.TV4_second);
        add = findViewById(R.id.button1_second);
        sub = findViewById(R.id.button2_second);
        mul = findViewById(R.id.button3_second);
        div = findViewById(R.id.button4_second);

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
