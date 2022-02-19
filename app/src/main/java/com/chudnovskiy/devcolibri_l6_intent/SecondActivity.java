package com.chudnovskiy.devcolibri_l6_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();

        button = (Button) findViewById(R.id.btn_back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnToPrevActivity();
            }
        });
    }

    private void returnToPrevActivity() {
        Intent intent = new Intent(this,
                MainActivity.class);
        startActivity(intent);
    }
}