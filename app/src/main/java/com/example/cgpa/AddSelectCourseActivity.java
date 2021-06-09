package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddSelectCourseActivity extends AppCompatActivity {

    Button cse2201btn, cse2203btn, cse2207btn, cse2209btn, cse2213btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_select_course);

        cse2201btn = findViewById(R.id.add_button_Cse2201);

        cse2203btn = findViewById(R.id.add_button_Cse2203);

        cse2207btn = findViewById(R.id.add_button_Cse2207);

        cse2209btn = findViewById(R.id.add_button_Cse2209);

        cse2213btn = findViewById(R.id.add_button_Cse2213);

        cse2201btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectCourseActivity.this, AddCse2201Activity.class));


            }
        });

        cse2203btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectCourseActivity.this, AddCse2203Activity.class));


            }
        });

        cse2207btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectCourseActivity.this, AddCse2207Activity.class));

            }
        });

        cse2209btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectCourseActivity.this, AddCse2209Activity.class));


            }
        });

        cse2213btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectCourseActivity.this, AddCse2213Activity.class));


            }
        });
    }
}
