package com.rainy.bryan.exercisingtracker.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rainy.bryan.exercisingtracker.R;

public class Home_Activity extends AppCompatActivity {

    Button dumbbellButton, abdominalButton, cableButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dumbbellButton = findViewById(R.id.dumbbellButton);
        abdominalButton = findViewById(R.id.abdominalButton);
        cableButton = findViewById(R.id.cableButton);

        dumbbellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Dumbbell_Activity.class);
                startActivity(intent);
            }
        });

        abdominalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Abdominal_Activity.class);
                startActivity(intent);
            }
        });

        cableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Activity.this, Cable_Activity.class);
                startActivity(intent);
            }
        });

        //links
        //https://www.youtube.com/watch?v=y1r9toPQNkM
        //http://www.menshealth.co.uk/building-muscle/the-10-best-dumbbell-exercises

    }
}
