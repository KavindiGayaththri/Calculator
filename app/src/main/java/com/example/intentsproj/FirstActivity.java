package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText number1, number2;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        number1 = findViewById(R.id.ET1_first);
        number2 = findViewById(R.id.ET2_first);

        ok = findViewById(R.id.button1_first);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(FirstActivity.this, SecondActivity.class);
                myIntent.putExtra("num1", number1.getText().toString());
                myIntent.putExtra("num2", number2.getText().toString());

                startActivity(myIntent);


            }
        });
    }
}
