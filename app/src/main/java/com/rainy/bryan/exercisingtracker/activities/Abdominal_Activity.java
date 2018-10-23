package com.rainy.bryan.exercisingtracker.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rainy.bryan.exercisingtracker.R;
import com.rainy.bryan.exercisingtracker.adapters.Exercise_Model_Recycler_Adapter;
import com.rainy.bryan.exercisingtracker.models.Exercise_Model;

import java.util.ArrayList;
import java.util.List;

public class Abdominal_Activity extends AppCompatActivity {

    private List<Exercise_Model> exercise_modelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Exercise_Model_Recycler_Adapter mAdapter;

    String hollowBobyHoldHow, birdDogHow, burpeeHow, mountainClimberHow, halfTurkishHow, plankHow;
    String hollowBobdyHoldWhy, birdDogWhy, burpeeWhy, mountainClimberWhy, halfTurkishWhy, plankWhy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdominal_);

        //Back button enabled
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Abdominal Exercises");

        recyclerView = findViewById(R.id.abdominalRecyclerView);
        recyclerView.setHasFixedSize(false);

        //Taken from here:
        //https://www.menshealth.com/fitness/g19546164/10-flat-belly-exercises/

        hollowBobyHoldHow = "Lay down, pressing your lower back into the ground. Hinge at the " +
                "hips to tuck your knees into your chest while also raising your shoulders off " +
                "the ground, reaching forward with your arms." +
                "Extend your legs straight out and hold in position, stretching your arms back " +
                "behind your head and squeezing your core to maintain your posture. For " +
                "beginners, keep your arms pointed forward to make the move less difficult. " +
                "Hold for 30 seconds to start, then ramp up to a minute or more once you " +
                "develop the core strength.";
        hollowBobdyHoldWhy = "It's a major core blaster. " +
                "Think of the hollow body hold as the inversion of a plank. Rather than bracing " +
                "yourself against the ground and letting gravity do the work, you're flipped " +
                "round, fighting against the force to keep yourself in position.";

        birdDogHow = "Put your weight on your hands and toes, bending your knees to take a " +
                "tabletop position, squeezing your core to keep your spine straight." +
                "Raise your left arm to reach straight forward, while simultaneously raising " +
                "your right leg and stretching it straight out. Hold for a count, squeezing " +
                "your core, before returning to the original position. Repeat the movement " +
                "with your right arm and left leg to count 1 rep.";
        birdDogWhy = "The bird dog helps you to move dynamically within your workout, which is " +
                "a great way to help you hone that stomach.";

        burpeeHow = "Stand with your feet shoulder-width apart. Lower your body until your " +
                "palms rest on the floor about shoulder-width apart." +
                "Kick your legs backward into a pushup position, perform a pushup, and then " +
                "quickly reverse the movement and perform a jump when you stand. That's 1 rep.";
        burpeeWhy = "The explosive exercise — which entails going from a pushup position to a " +
                "jump and back to a pushup position — hits every muscle from head to toe.";

        mountainClimberHow = "Assume a pushup position with your hands below your shoulders " +
                "and your body forming a straight line from your head to your heels. This is " +
                "the starting position." +
                "Lifting your right foot off of the floor, drive your right knee towards your " +
                "chest. Tap the floor with your right foot and then return to the starting " +
                "position. Alternate legs with each repetition.";
        mountainClimberWhy = "Think of the mountain climber as a moving plank. You perform a " +
                "mini crunch when you explosively draw one knee into your chest." +
                "What makes this move so difficult, however, is that your core has to work " +
                "overtime to keep your body stable and straight every time you lift a foot off " +
                "of the floor.";

        halfTurkishHow = "Lie faceup with your right leg bent and your left leg flat on the " +
                "floor. Holding a dumbbell or kettlebell, raise your right arm straight " +
                "overhead. Roll onto your left side and prop yourself up onto your elbow or " +
                "hand, keeping your right arm overhead and your eyes on the weight. " +
                "Pause, and then reverse the movement to return to the starting position. ";
        halfTurkishWhy = "It works everything—your shoulders, hips, back, core, arms, and so many " +
                "other muscles you never even think of.";

        plankHow = "Get into pushup position and bend your elbows to lower your forearms to " +
                "the floor. Hold the position with abs braced.";
        plankWhy = "Core to the core!";




        mAdapter = new Exercise_Model_Recycler_Adapter(exercise_modelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        populateAbdominalData();
    }

    private void populateAbdominalData() {

        Exercise_Model abdominal = new Exercise_Model("Hollow Body Hold", hollowBobyHoldHow, hollowBobdyHoldWhy, R.drawable.hollow_body_hold);
        exercise_modelList.add(abdominal);

        abdominal = new Exercise_Model("Bird Dog", birdDogHow, birdDogWhy, R.drawable.bird_dog);
        exercise_modelList.add(abdominal);

        abdominal = new Exercise_Model("Burpee", burpeeHow, burpeeWhy, R.drawable.burpee);
        exercise_modelList.add(abdominal);

        abdominal = new Exercise_Model("Mountain Climber", mountainClimberHow, mountainClimberWhy, R.drawable.mountain_climber);
        exercise_modelList.add(abdominal);

        abdominal = new Exercise_Model("Half Turkish Getup", halfTurkishHow, halfTurkishWhy, R.drawable.half_turkish_getup);
        exercise_modelList.add(abdominal);

        abdominal = new Exercise_Model("Plank", plankHow, plankWhy, R.drawable.plank);
        exercise_modelList.add(abdominal);

    }
}
