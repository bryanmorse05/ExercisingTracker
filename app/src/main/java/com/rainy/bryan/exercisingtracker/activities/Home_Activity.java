package com.rainy.bryan.exercisingtracker.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rainy.bryan.exercisingtracker.R;

public class Home_Activity extends AppCompatActivity {

    Button dumbbellButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dumbbellButton = findViewById(R.id.dumbbellButton);

        dumbbellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Dumbbell_Exercises_Activity.class);
                startActivity(intent);
            }
        });

        //links
        //https://www.youtube.com/watch?v=y1r9toPQNkM
        //http://www.menshealth.co.uk/building-muscle/the-10-best-dumbbell-exercises

    }
}
