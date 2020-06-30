package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText first = findViewById(R.id.first);
       final EditText second = findViewById(R.id.second);
      final  EditText third = findViewById(R.id.third);
         final EditText fourth = findViewById(R.id.fourth);
        final EditText fifth = findViewById(R.id.fifth);
       final Button button = findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,MainActivity2.class);
               intent.putExtra("name",first.getText().toString());
               intent.putExtra("age",second.getText().toString());
               intent.putExtra("your job",third.getText().toString());
               intent.putExtra("phone number",fourth.getText().toString());
               intent.putExtra("email",fifth.getText().toString());
               startActivity(intent);




           }
       });

    }
}