package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.add_button1);
        button2 = (Button) findViewById(R.id.add_button2);
        button3 = (Button) findViewById(R.id.add_button3);
        button4 = (Button) findViewById(R.id.add_button4);
        button5 = (Button) findViewById(R.id.add_button5);
        button6 = (Button) findViewById(R.id.add_button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddSelectCourseActivity.class);
                startActivityForResult(intent,1);
            }
        });

       button4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this, AddSelectLabCoursesActivity.class));
           }
       });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, delete.class);
                startActivityForResult(intent,2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, view.class);
                startActivityForResult(intent,3);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, record.class);
                startActivityForResult(intent,2);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, calculator.class);
                startActivityForResult(intent,3);
            }
        });

    }
}
