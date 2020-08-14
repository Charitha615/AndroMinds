package com.example.jobook_loginsign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome__main3);

        Button Applicant_btnn = findViewById(R.id.Applicant_btn);
        Button Compnay_btnn = findViewById(R.id.Company_btn);


        Applicant_btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(),MainActivity.class);

                startActivity(p);
            }


        });

        Compnay_btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(),Company_login.class);

                startActivity(p);
            }
        });
    }
}