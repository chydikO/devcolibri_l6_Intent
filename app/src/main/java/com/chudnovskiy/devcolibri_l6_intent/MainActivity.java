package com.chudnovskiy.devcolibri_l6_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        button = (Button) findViewById(R.id.btn_next_activity);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTheNextActivity(view);
            }
        });

    }

    public void goToTheNextActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}