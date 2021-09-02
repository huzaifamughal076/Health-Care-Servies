package com.example.healthcareservices.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.healthcareservices.R;

public class NotificatoinActivity extends AppCompatActivity {

    ImageView noti_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificatoin);

        noti_back = findViewById(R.id.noti_back);


        noti_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}