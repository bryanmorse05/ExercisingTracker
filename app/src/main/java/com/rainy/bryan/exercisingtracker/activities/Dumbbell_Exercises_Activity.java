package com.rainy.bryan.exercisingtracker.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.rainy.bryan.exercisingtracker.R;
import com.rainy.bryan.exercisingtracker.adapters.Exercise_Model_Recycler_Adapter;
import com.rainy.bryan.exercisingtracker.models.Exercise_Model;

import java.util.ArrayList;
import java.util.List;

public class Dumbbell_Exercises_Activity extends AppCompatActivity {

    private List<Exercise_Model> exercise_modelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Exercise_Model_Recycler_Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbell_exercises_);

        //Back button enabled
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Dumbbell Exercises");

        recyclerView = findViewById(R.id.dumbbellRecyclerView);
        recyclerView.setHasFixedSize(false);


        mAdapter = new Exercise_Model_Recycler_Adapter(exercise_modelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        populateDumbbellData();
    }

    private void populateDumbbellData() {

        Exercise_Model dumbbell = new Exercise_Model("Goblet Squat",
                "Stand with feet set wider than shoulder-width and hold a " +
                        "dumbbell with both hands in front of your chest. Sit back into a " +
                        "squat, then drive back up and repeat.", "Are you a ner" +
                "vous newbie or a long-time hard gainer? It doesn’t matter with this move. “G" +
                "oblet squats are perfect for any level,” says Frost. “They specifically targ" +
                "et glute activation whilst improving both hip and thoracic mobility.”", R.drawable.hammer_curl);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Dumbbell Clean", "Flip your wrists " +
                "so they face forwards and bring the weights to your shoulders, slightly jumpi" +
                "ng as you do. Slowly straighten your legs to stand. Then lower the weights do" +
                "wn to your thigh before moving into squat position and repeating. ",
                "If you want to look like an Olympian then you’ve got to train l" +
                        "ike one. “Incorporating these powerlifter lifts into your training wi" +
                        "ll not only build lean muscle tissue but also build explosive power,”" +
                        " says Frost. This move also rushes blood to your glutes, hamstrings, " +
                        "shoulders and arms to maximize your muscle-growing power.", R.drawable.test);
        exercise_modelList.add(dumbbell);

    }
}
