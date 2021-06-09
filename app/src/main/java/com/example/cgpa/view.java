package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class view extends AppCompatActivity {

    Button save,show;
    TextView info1, info5, info9, info13, info17, info21, info25, info29, info33, info37;
    TextView info3, info4, info7, info8, info11, info12,  info15, info16, info19, info20, info23, info24, info27, info28, info31, info32, info35, info36, info39, info40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


        save  = findViewById(R.id.add_button4_save);
        show  = findViewById(R.id.add2_save2);
        info5 = findViewById(R.id.info5);
        info7 = findViewById(R.id.info7);
        info8 = findViewById(R.id.info8);
        info13 = findViewById(R.id.info13);
        info15 = findViewById(R.id.info15);
        info16 = findViewById(R.id.info16);
        info17 = findViewById(R.id.info17);
        info19 = findViewById(R.id.info19);
        info20 = findViewById(R.id.info20);
        info25 = findViewById(R.id.info25);
        info27 = findViewById(R.id.info27);
        info28 = findViewById(R.id.info28);
        info33 = findViewById(R.id.info33);
        info35 = findViewById(R.id.info35);
        info36 = findViewById(R.id.info36);
        info1 = findViewById(R.id.info1);
        info3 = findViewById(R.id.info3);
        info4 = findViewById(R.id.info4);
        info9 = findViewById(R.id.info9);
        info11 = findViewById(R.id.info11);
        info12 = findViewById(R.id.info12);
        info21 = findViewById(R.id.info21);
        info23 = findViewById(R.id.info23);
        info24 = findViewById(R.id.info24);
        info29 = findViewById(R.id.info29);
        info31 = findViewById(R.id.info31);
        info32 = findViewById(R.id.info32);
        info37 = findViewById(R.id.info37);
        info39 = findViewById(R.id.info39);
        info40 = findViewById(R.id.info40);

        String value1 = info5.getText().toString().trim();
        String value5 = info13.getText().toString().trim();
        String value9 = info17.getText().toString().trim();
        String value13 = info25.getText().toString().trim();
        String value17 = info33.getText().toString().trim();
        String value21 = info1.getText().toString().trim();
        String value25 = info9.getText().toString().trim();
        String value29 = info21.getText().toString().trim();
        String value33 = info29.getText().toString().trim();
        String value37 = info37.getText().toString().trim();


        SharedPreferences result1 = getSharedPreferences("SaveData1", Context.MODE_PRIVATE);


        String value2 = result1.getString("Total1", "Data not found");
        String value3 = result1.getString("Grades1", "Data not found");
        String value4 = result1.getString("Course1", "CSE2201");

        SharedPreferences result2 = getSharedPreferences("SaveData2", Context.MODE_PRIVATE);

        String value6 = result2.getString("Total2", "Data not found");
        String value7 = result2.getString("Grades2", "Data not found");
        String value8 = result2.getString("Course2", "CSE2203");

        SharedPreferences result3 = getSharedPreferences("SaveData3", Context.MODE_PRIVATE);

        String value10 = result3.getString("Total3", "Data not found");
        String value11 = result3.getString("Grades3", "Data not found");
        String value12 = result3.getString("Course3", "CSE2207");

        SharedPreferences result4 = getSharedPreferences("SaveData4", Context.MODE_PRIVATE);

        String value14 = result4.getString("Total4", "Data not found");
        String value15 = result4.getString("Grades4", "Data not found");
        String value16 = result4.getString("Course4", "CSE2209");

        SharedPreferences result5 = getSharedPreferences("SaveData5", Context.MODE_PRIVATE);

        String value18 = result5.getString("Total5", "Data not found");
        String value19 = result5.getString("Grades5", "Data not found");
        String value20 = result5.getString("Course5", "CSE2213");

        SharedPreferences result01 = getSharedPreferences("SaveData01", Context.MODE_PRIVATE);

        String value22 = result01.getString("Totals01", "Data not found");
        String value23 = result01.getString("GradesLab01", "Data not found");
        String value24 = result01.getString("Courses01", "CSE2200");

        SharedPreferences result02 = getSharedPreferences("SaveData02", Context.MODE_PRIVATE);

        String value26 = result02.getString("Totals02", "Data not found");
        String value27 = result02.getString("GradesLab02", "Data not found");
        String value28 = result02.getString("Courses02", "CSE2202");

        SharedPreferences result03 = getSharedPreferences("SaveData03", Context.MODE_PRIVATE);

        String value30 = result03.getString("Totals03", "Data not found");
        String value31 = result03.getString("GradesLab03", "Data not found");
        String value32 = result03.getString("Courses03", "CSE2208");

        SharedPreferences result04 = getSharedPreferences("SaveData04", Context.MODE_PRIVATE);

        String value34 = result04.getString("Totals04", "Data not found");
        String value35 = result04.getString("GradesLab04", "Data not found");
        String value36 = result04.getString("Courses04", "CSE2210");

        SharedPreferences result05 = getSharedPreferences("SaveData05", Context.MODE_PRIVATE);

        String value38 = result05.getString("Totals05", "Data not found");
        String value39 = result05.getString("GradesLab05", "Data not found");
        String value40 = result05.getString("Courses05", "CSE2214");

        if (value4.equals(value1)) {

            info7.setText(value2);
            info8.setText(value3);

        }
        if (value8.equals(value5)) {

            info15.setText(value6);
            info16.setText(value7);

        }
        if (value12.equals(value9)) {

            info19.setText(value10);
            info20.setText(value11);

        }
        if (value16.equals(value13)) {

            info27.setText(value14);
            info28.setText(value15);

        }
        if (value20.equals(value17)) {

            info35.setText(value18);
            info36.setText(value19);

        }
        if (value24.equals(value21)) {

            info3.setText(value22);
            info4.setText(value23);

        }
        if (value28.equals(value25)) {

            info11.setText(value26);
            info12.setText(value27);

        }
        if (value32.equals(value29)) {

            info23.setText(value30);
            info24.setText(value31);

        }
        if (value36.equals(value33)) {

            info31.setText(value34);
            info32.setText(value35);

        }
        if (value40.equals(value37)) {

            info39.setText(value38);
            info40.setText(value39);

        }

    }


}
