package com.example.cgpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {

    private TextView textViewAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        textViewAnim = findViewById(R.id.textviewanim);
        textViewAnim.setText("CGPA Calculator\n\nby\n\nJannatul Ferdaus\n&\n\nNoor Nafiur Rahman");

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);

        textViewAnim.startAnimation(myanim);

        final Intent intent = new Intent(AnimationActivity.this, MainActivity.class);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();

    }

}

