package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import static com.example.cv.R.*;
import static com.example.cv.R.id.textView2;
import static com.example.cv.R.id.textView4;
import static com.example.cv.R.id.textView5;
import static com.example.cv.R.id.textView6;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main2);
        TextView a = findViewById(textView2);
        TextView b = findViewById(id.textView3);
        TextView c = findViewById(textView4);
        TextView d = findViewById(textView5);
        TextView e = findViewById(textView6);
        Bundle collect = getIntent().getExtras();
        a.setText(collect.getString("name"));
        b.setText(collect.getString("age"));
        c.setText(collect.getString("your job"));
        d.setText(collect.getString("phone number"));
        e.setText(collect.getString("email"));
    }
}