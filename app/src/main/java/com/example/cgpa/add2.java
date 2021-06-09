/*
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

public class add2 extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private Spinner spinner1;
    EditText till_mid, after_mid;
    Button total1, show,viewBn;
    TextView shtotal;
    String num;
    String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add2);


        spinner1 = findViewById(R.id.spinner1);
        List<String> categories = new ArrayList<>();
        categories.add(0,"enter course");
        categories.add("CSE 2200");
        categories.add("CSE 2202");
        categories.add("CSE 2208");
        categories.add("CSE 2210");
        categories.add("CSE 2214");

        ArrayAdapter<String> dataAdaptor;
        dataAdaptor = new ArrayAdapter(this,android.R.layout.simple_spinner_item, categories);
        dataAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdaptor);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if(adapterView.getItemAtPosition(position).equals("enter course"))
                {

                }
                else
                {
                    String item = adapterView.getItemAtPosition(position).toString();
                    Toast.makeText(adapterView.getContext(), "Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        show = findViewById(R.id.add2_save2);
        viewBn = findViewById(R.id.add2_save3);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String courseName = addCourseNumber.getText().toString().trim();
                String Total = shtotal.getText().toString().trim();
                sharedPreferences = getSharedPreferences("SaveData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                // editor.putString("courseName", courseName);
                editor.putString("Courses", item);
                editor.putString("Totals", Total);
                editor.putString("GradesLab",num);
                editor.apply();
            }
        });

        viewBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(add2.this , view.class));
            }
        });



        till_mid = (EditText) findViewById(R.id.add2_info1);
        after_mid = (EditText) findViewById(R.id.add2_info2);
        total1 = (Button) findViewById(R.id.add_button1_done2);
        shtotal=  (TextView) findViewById(R.id.add_total1);


        total1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lab();
            }
        });

    }

    private void lab() {
        String till_mid1 = till_mid.getText().toString().trim();
        String after_mid1 = after_mid.getText().toString().trim();


        if (till_mid1 != null && !"".equals(till_mid1) && after_mid1 != null && !"".equals(after_mid1) ) {
            float till_mid11 = Float.parseFloat(till_mid1);
            float after_mid11 = Float.parseFloat(after_mid1);
            float show_total=0;

            if(till_mid11 >=0 && till_mid11<=50 && after_mid11>=0 && after_mid11<=50) {
                show_total = till_mid11 + after_mid11;
                dis(show_total);

            }
            if (show_total >= 80 && show_total <=100){
                num = "A+";
            }
            else if (show_total >= 75 && show_total <=79){
                num = "A";
            }
            else if (show_total >= 70 && show_total<=74){
                num = "A-";
            }
            else if (show_total >= 65 && show_total <=69){
                num = "B+";
            }
            else if (show_total >= 60 && show_total <=64){
                num = "B";
            }
            else if (show_total >= 55 && show_total <=59){
                num = "B-";
            }
            else if (show_total >= 50 &&show_total <=54){
                num = "C+";
            }
            else if (show_total >= 45 && show_total <=49){
                num = "C";
            }
            else if (show_total >= 40 && show_total <=44){
                num = "D";
            }
            else if (show_total >= 0 && show_total <=39) {
                num = "F";
            }
        }
    }

    private void dis(float show_total) {
        String ttOtal = "";
        ttOtal = show_total + "\n" + ttOtal;
        shtotal.setText(ttOtal);
    }
}*/
