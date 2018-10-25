package com.rainy.bryan.exercisingtracker.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rainy.bryan.exercisingtracker.R;
import com.rainy.bryan.exercisingtracker.adapters.Exercise_Model_Recycler_Adapter;
import com.rainy.bryan.exercisingtracker.adapters.Exercise_Model_Video_Recycler_Adapter;
import com.rainy.bryan.exercisingtracker.models.Exercise_Model;
import com.rainy.bryan.exercisingtracker.models.Exercise_Model_Video;

import java.util.ArrayList;
import java.util.List;

public class Cable_Activity extends AppCompatActivity {

    private List<Exercise_Model_Video> exercise_model_videoList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Exercise_Model_Video_Recycler_Adapter mAdapter;

    String standingCableLiftHow, obliqueCableCrunchHow;
    String standingCableLiftWhy, obliqueCableCrunchWhy;
    String standingCableLiftURL, obliqueCableCrunchURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cable_);

        //Back button enabled
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Cable Exercises");

        recyclerView = findViewById(R.id.cableRecyclerView);
        recyclerView.setHasFixedSize(false);

        standingCableLiftHow = "How";
        standingCableLiftWhy = "Why";
        standingCableLiftURL = "https://videos.bodybuilding.com/video/mp4/94000/95621m.mp4";

        obliqueCableCrunchHow = "Oblique How";
        obliqueCableCrunchWhy = "Oblique Why";
        obliqueCableCrunchURL = "https://videos.bodybuilding.com/video/mp4/116000/117601m.mp4";

        mAdapter = new Exercise_Model_Video_Recycler_Adapter(exercise_model_videoList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        populateCableData();
    }

    private void populateCableData() {
        Exercise_Model_Video cable = new Exercise_Model_Video("Standing Cable Lift", standingCableLiftHow, standingCableLiftWhy, standingCableLiftURL);
        exercise_model_videoList.add(cable);

        cable = new Exercise_Model_Video("Oblique Cable Crunch", obliqueCableCrunchHow, obliqueCableCrunchWhy, obliqueCableCrunchURL);
        exercise_model_videoList.add(cable);
    }
}
