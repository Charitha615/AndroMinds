package com.example.jobook_loginsign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Company_signUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_sign_up);


        TextView Alrady_btn = findViewById(R.id.Already_btn01);
        Button Next_btn = findViewById(R.id.Next_btn01);

        Next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(),Company_signUp_02.class);

                startActivity(p);
            }
        });

        Alrady_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(),Company_login.class);

                startActivity(p);
            }
        });

    }
}