package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AddCse2213Activity extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    String num;
    String item = "CSE 2213";
    EditText quiz1, quiz2, quiz3, quiz4, attendance, fin;
    Button ok, done, save, viewBtn;
    TextView quiz_average, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        quiz1 = (EditText) findViewById(R.id.add_button1_quiz1);
        quiz2 = (EditText) findViewById(R.id.add_button1_quiz2);
        quiz3 = (EditText) findViewById(R.id.add_button1_quiz3);
        quiz4 = (EditText) findViewById(R.id.add_button1_quiz4);
        attendance = (EditText) findViewById(R.id.add_button1_attendance);
        fin = (EditText) findViewById(R.id.add_button1_final);
        total = (TextView) findViewById(R.id.add_button1_total);
        ok = (Button) findViewById(R.id.add_button1_ok);
        done = (Button) findViewById(R.id.add_button1_done);
        save = findViewById(R.id.add_button4_save);
        viewBtn = findViewById(R.id.add_button_view);
        quiz_average = (TextView) findViewById(R.id.add_button1_quiz_average);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quiz();
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                totalMarks();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String courseName = addCourseNumber.getText().toString().trim();
                String Total = total.getText().toString().trim();
                sharedPreferences = getSharedPreferences("SaveData5", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                // editor.putString("courseName", courseName);
                editor.putString("Course5", item);
                editor.putString("Total5", Total);
                editor.putString("Grades5",num);
                editor.apply();
            }
        });

        viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddCse2213Activity.this, view.class));
            }
        });


    }

    private void Quiz() {
        String quiz1Str = quiz1.getText().toString().trim();
        String quiz2Str = quiz2.getText().toString().trim();
        String quiz3Str = quiz3.getText().toString().trim();
        String quiz4Str = quiz4.getText().toString().trim();

        if (quiz1Str != null && !"".equals(quiz1Str) && quiz2Str != null && !"".equals(quiz2Str) && quiz3Str != null && !"".equals(quiz3Str) && quiz4Str != null && !"".equals(quiz4Str)) {
            float quiz1Value = Float.parseFloat(quiz1Str);
            float quiz2Value = Float.parseFloat(quiz2Str);
            float quiz3Value = Float.parseFloat(quiz3Str);
            float quiz4Value = Float.parseFloat(quiz4Str);
            if(quiz1Value>=0 && quiz1Value<=20 && quiz2Value>=0 && quiz2Value<=20 && quiz3Value>=0 && quiz3Value<=20 && quiz4Value>=0 && quiz4Value<=20) {
                if (quiz1Value < quiz2Value && quiz1Value < quiz3Value && quiz1Value < quiz4Value) {
                    float averageValue = ((quiz2Value + quiz3Value + quiz4Value) / 3);
                    display1(averageValue);
                } else if (quiz2Value < quiz1Value && quiz2Value < quiz3Value && quiz2Value < quiz4Value) {
                    float averageValue = ((quiz1Value + quiz3Value + quiz4Value) / 3);
                    display1(averageValue);
                } else if (quiz3Value < quiz1Value && quiz3Value < quiz2Value && quiz3Value < quiz4Value) {
                    float averageValue = ((quiz1Value + quiz2Value + quiz4Value) / 3);
                    display1(averageValue);
                } else {
                    float averageValue = ((quiz1Value + quiz2Value + quiz3Value) / 3);
                    display1(averageValue);
                }
            }
        }
    }

    private void display1(float averageValue) {
        String AVerage = "";
        AVerage = averageValue + "\n" + AVerage;
        quiz_average.setText(AVerage);
    }

    private void totalMarks() {
        String quizStr = quiz_average.getText().toString().trim();
        String attendanceStr = attendance.getText().toString().trim();
        String finStr = fin.getText().toString().trim();

        if (quizStr != null && !"".equals(quizStr) && attendanceStr != null && !"".equals(attendanceStr) && finStr != null && !"".equals(finStr)) {
            float quizValue = Float.parseFloat(quizStr);
            float attendanceValue = Float.parseFloat(attendanceStr);
            float finValue = Float.parseFloat(finStr);
            float Gtotal = quizValue + attendanceValue + finValue;
            if(attendanceValue>=0 && attendanceValue<=10 && finValue>=0 && finValue<=70) {
                display2(Gtotal);
            }
            if (Gtotal >= 80 && Gtotal <=100){
                num = "A+";
            }
            else if (Gtotal >= 75 && Gtotal <=79){
                num = "A";
            }
            else if (Gtotal >= 70 && Gtotal <=74){
                num = "A-";
            }
            else if (Gtotal >= 65 && Gtotal <=69){
                num = "B+";
            }
            else if (Gtotal >= 60 && Gtotal <=64){
                num = "B";
            }
            else if (Gtotal >= 55 && Gtotal <=59){
                num = "B-";
            }
            else if (Gtotal >= 50 && Gtotal <=54){
                num = "C+";
            }
            else if (Gtotal >= 45 && Gtotal <=49){
                num = "C";
            }
            else if (Gtotal >= 40 && Gtotal <=44){
                num = "D";
            }
            else if (Gtotal >= 0 && Gtotal <=39){
                num = "F";
            }
        }
    }

    private void display2(float Gtotal) {
        String TOtal = "";
        TOtal = Gtotal + "\n" + TOtal;
        total.setText(TOtal);
    }

}
