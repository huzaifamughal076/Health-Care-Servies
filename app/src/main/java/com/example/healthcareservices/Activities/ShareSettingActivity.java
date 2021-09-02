package com.example.healthcareservices.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.healthcareservices.R;

public class ShareSettingActivity extends AppCompatActivity {

    ImageView share_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_setting);


        share_back = findViewById(R.id.share_back);

        share_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { finish(); } });


    }
}