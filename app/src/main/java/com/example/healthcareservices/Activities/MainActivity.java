package com.example.healthcareservices.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.healthcareservices.R;

public class MainActivity extends AppCompatActivity {

    TextView admin_space,doctor_space,patient_space,Have_Account;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admin_space = findViewById(R.id.admin_space);
        doctor_space = findViewById(R.id.doctor_space);
        patient_space = findViewById(R.id.patient_space);
        Have_Account = findViewById(R.id.Have_Account);

        admin_space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AdminSignUp.class);
                startActivity(intent);
                finish();
            }
        });

        doctor_space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DoctorSignUp.class);
                startActivity(intent);
                finish();
            }
        });

        patient_space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PatientSignUp.class);
                startActivity(intent);
                finish();
            }
        });


        Have_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),LoginScreen.class);
                startActivity(intent);
                finish();

            }
        });







    }
}