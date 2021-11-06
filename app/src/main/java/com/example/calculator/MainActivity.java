package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView answer;
    EditText value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.calculatebutton);
        answer= findViewById(R.id.answerview);
        value = findViewById(R.id.inputamount);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable amount = value.getText();
                double ans= (int)(Integer.parseInt(value.getText().toString())*2.5)/100.0;
                String s  =  " Rs. " + Double.toString(ans);
                answer.setText(s);
            }
        });
    }
}