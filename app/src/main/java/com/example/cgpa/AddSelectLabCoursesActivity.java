package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddSelectLabCoursesActivity extends AppCompatActivity {

    Button cse2200btn, cse2202btn, cse2208btn, cse2210btn, cse2214btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_select_lab_courses);

        cse2200btn = findViewById(R.id.add_button_Cse2200);

        cse2202btn = findViewById(R.id.add_button_Cse2202);

        cse2208btn = findViewById(R.id.add_button_Cse2208);

        cse2210btn = findViewById(R.id.add_button_Cse2210);

        cse2214btn = findViewById(R.id.add_button_Cse2214);

        cse2200btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectLabCoursesActivity.this, AddLabCse2200Activity.class));

            }
        });

        cse2202btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectLabCoursesActivity.this, AddLabCse2202Activity.class));


            }
        });

        cse2208btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectLabCoursesActivity.this, AddLabCse2208Activity.class));


            }
        });

        cse2210btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectLabCoursesActivity.this, AddLabCse2210Activity.class));


            }
        });

        cse2214btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddSelectLabCoursesActivity.this, AddLabCse2214Activity.class));


            }
        });
    }
}
