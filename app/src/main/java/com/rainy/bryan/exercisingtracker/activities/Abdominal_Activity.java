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

    String hollowBobyHoldHow, birdDogHow, burpeeHow;
    String hollowBobdyHoldWhy, birdDogWhy, burpeeWhy;

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
                "the ground, reaching forward with your arms.\n" +
                "Extend your legs straight out and hold in position, stretching your arms back " +
                "behind your head and squeezing your core to maintain your posture. For " +
                "beginners, keep your arms pointed forward to make the move less difficult. " +
                "Hold for 30 seconds to start, then ramp up to a minute or more once you " +
                "develop the core strength.";
        hollowBobdyHoldWhy = "Hollow body holds are a go-to exercise for gymnasts, who are " +
                "pound-for-pound among the strongest athletes in the world. The move is a " +
                "staple of their training, for good reason: It's a major core blaster.\n" +
                "Think of the hollow body hold as the inversion of a plank. Rather than bracing " +
                "yourself against the ground and letting gravity do the work, you're flipped " +
                "round, fighting against the force to keep yourself in position.";

        birdDogHow = "Put your weight on your hands and toes, bending your knees to take a " +
                "tabletop position, squeezing your core to keep your spine straight.\n" +
                "Raise your left arm to reach straight forward, while simultaneously raising " +
                "your right leg and stretching it straight out. Hold for a count, squeezing " +
                "your core, before returning to the original position. Repeat the movement " +
                "with your right arm and left leg to count 1 rep.";
        birdDogWhy = "The bird dog helps you to move dynamically within your workout, which is " +
                "a great way to help you hone that stomach.\n" +
                "You don't just work your core and hip muscles with the move — you also work on " +
                "your balance and coordination. You might fall over the first few times you " +
                "give this move a whirl, which is okay. Once you have it down, you'll have " +
                "mastered an exercise that works more than just one thing.";

        burpeeHow = "Stand with your feet shoulder-width apart. Lower your body until your " +
                "palms rest on the floor about shoulder-width apart.\n" +
                "Kick your legs backward into a pushup position, perform a pushup, and then " +
                "quickly reverse the movement and perform a jump when you stand. That's 1 rep.";
        burpeeWhy = "If you want to lose your gut, you need to work as many muscles as " +
                "possible. The burpee does just that.\n" +
                "The explosive exercise — which entails going from a pushup position to a " +
                "jump and back to a pushup position — hits every muscle from head to toe." +
                "In fact, a recent study from the American College of Sports Medicine found " +
                "that 10 fast-paced reps are just as effective at revving your metabolism as " +
                "a 30-second all-out sprint, so you can burn your belly fat faster than ever before.";


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

    }
}
