package com.example.healthcareservices.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.example.healthcareservices.R;

public class SplashScreen extends AppCompatActivity {

    LinearLayout splash_logo;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splash_logo = findViewById(R.id.splash_logo);

        anim = AnimationUtils.loadAnimation(this,R.anim.fadein);
        splash_logo.setAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                    Intent intent = new Intent(getApplicationContext(),LoginScreen.class);
                    startActivity(intent);
                    finish();
                }

            },4000);
        }




    }
