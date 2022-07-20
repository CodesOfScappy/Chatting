package com.codeofscappy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class WelcomeScreenActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        getSupportActionBar().hide();



        // Send User to Register "when" accept [Terms of Service]
        textView  = (TextView) findViewById(R.id.accept_button);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreenActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}