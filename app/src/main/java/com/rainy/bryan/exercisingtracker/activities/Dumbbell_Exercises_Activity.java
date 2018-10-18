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

public class Dumbbell_Exercises_Activity extends AppCompatActivity {

    private List<Exercise_Model> exercise_modelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Exercise_Model_Recycler_Adapter mAdapter;

    String gobletSquatHow, dumbbellCleanHow, farmersWalkHow, bentOverRowHow, twoArmDumbbellStiffLeggedDeadliftHow;
    String oneArmSwingHow, benchPressHow, crossBodyHammerCurlHow, stepUpsHow, dumbbellScaptionHow;
    String gobletSquatWhy, dumbbellCleanWhy, farmersWalkWhy, bentOverRowWhy, twoArmDumbbellStiffLeggedDeadliftWhy;
    String oneArmSwingWhy, benchPressWhy, crossBodyHammerCurlWhy, stepUpsWhy, dumbbellScaptionWhy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbell_exercises_);

        //Back button enabled
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Dumbbell Exercises");

        recyclerView = findViewById(R.id.dumbbellRecyclerView);
        recyclerView.setHasFixedSize(false);

        //Taken from here:
        //http://www.menshealth.co.uk/building-muscle/the-10-best-dumbbell-exercises
        gobletSquatHow = "Stand with feet set wider than shoulder-width and hold a " +
                        "dumbbell with both hands in front of your chest. Sit back into a " +
                        "squat, then drive back up and repeat.";
        gobletSquatWhy = "Are you a nervous newbie or a long-time hard gainer? It doesn’t matter " +
                "with this move. “Goblet squats are perfect for any level,” says Frost. “They " +
                "specifically target glute activation whilst improving both hip and thoracic mobility.”";

        dumbbellCleanHow = "Flip your wrists " +
                "so they face forwards and bring the weights to your shoulders, slightly jumpi" +
                "ng as you do. Slowly straighten your legs to stand. Then lower the weights do" +
                "wn to your thigh before moving into squat position and repeating.";
        dumbbellCleanWhy = "If you want to look like an Olympian then you’ve got to train l" +
                "ike one. “Incorporating these powerlifter lifts into your training wi" +
                "ll not only build lean muscle tissue but also build explosive power,”" +
                " says Frost. This move also rushes blood to your glutes, hamstrings, " +
                "shoulders and arms to maximize your muscle-growing power.";

        farmersWalkHow = "Walk forward taking short, quick steps. Go for the given distance, as " +
                "fast as possible.";
        farmersWalkWhy = "There’s no technique to worry about, but you’ll still supercharge your " +
                "grip strength. And don’t worry, this lack of technique won’t get you injured; " +
                "through a process called irradiation, this move bunches your rotator cuff, " +
                "protecting your shoulders.";

        bentOverRowHow = "Keep your core tight and your back straight as you row the weights up " +
                "to your chest. Lower and repeat.";
        bentOverRowWhy = "“Rows will target several muscles in your upper body including the " +
                "traps, rhomboids, lats and biceps perfect for getting you that ‘V’ shape,” says " +
                "Frost. And not only that, it'll hone in on your deltoids to create some " +
                "T-shirt-filling boulder shoulders, too.";

        twoArmDumbbellStiffLeggedDeadliftHow = "Lower the dumbbells to the top of your feet, " +
                "as far as you can go by extending through your waist, then slowly return to " +
                "the starting position.";
        twoArmDumbbellStiffLeggedDeadliftWhy = "It shreds your legs into powerful pins by targeting " +
                "your fast-twitch lower-body muscles. Plus, stiff legged deadlifts ensure your " +
                "entire posterior chain is functioning effectively and prevents hip and lower " +
                "back injuries, says Frost. It’s one of the best free weight exercises to build " +
                "up your lower body – injury free.";

        oneArmSwingHow = "Sink into a squat and swing the dumbbell through your legs before " +
                "immediately driving yourself forward, bringing the weight up towards your head " +
                "as you straighten your legs. Repeat this movement, then swap sides.";
        oneArmSwingWhy = "With proper form this swing will not only recruit muscles within your " +
                "posterior chain but it will also build your grip strength, co-ordination, " +
                "lower back muscles, quadriceps and shoulders. In other words, it’ll give you " +
                "the momentum your body transformation workout needs. Most of these traditional " +
                "kettlebell moves can be replicated.";

        benchPressHow = "Sink into a squat and swing the weight through your legs before " +
                "immediately driving yourself forward, bringing it up towards your head as " +
                "you straighten your legs. Repeat this movement, then swap sides.";
        benchPressWhy = " If you’re looking to build quality pecs appeal then always opt for " +
                "a dumbbell press over barbell. Why? A weight in each hands allows for a greater " +
                "stretch at the bottom of the lift, building a bigger chest. And if you want to " +
                "take this move further? “Squeeze your pecs together at the top of the lift to " +
                "recruit as many muscle fibres as possible,” says Frost.";

        crossBodyHammerCurlHow = "One at a time, curl each weight up towards your opposing " +
                "shoulder. Return under control to the start position and repeat on the other " +
                "side.";
        crossBodyHammerCurlWhy = "Remember, if you want to win the arms race then don’t ignore " +
                "the rule of divide and conquer. Focusing on one arm at a time creates a large " +
                "neural drive, which engages the nervous system to recruit more muscle fibres.";

        stepUpsHow = "Place your right foot onto the elevated platform and push up through " +
                "your heel to lift yourself up and place your left foot on the platform. Step " +
                "back down with your left foot, concentrating on flexing your hip and the knee " +
                "of your right leg. Repeat on the other side.";
        stepUpsWhy = "It’s a sure fire way to maximize your gluteus maximus, the major muscle " +
                "responsible for extending, rotating and adducting and abducting from the hip " +
                "joint. Plus, single leg exercises will increase stabiliser strength of the " +
                "smaller muscles around the joint, protecting you against injuries.";

        dumbbellScaptionHow = "Arc the weights up to your sides keeping your arms straight at " +
                "all times until you feel a strong stretch across your shoulders. Return " +
                "slowly to the start position.";
        dumbbellScaptionWhy = "Rotator cuff, shoulder impingement and tears are common issues " +
                "from overuse exercises, but not if you use the scaption. By targeting your " +
                "stabilising muscles it protects the shoulder joint and ligaments surrounding it.";


        mAdapter = new Exercise_Model_Recycler_Adapter(exercise_modelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        populateDumbbellData();
    }

    private void populateDumbbellData() {

        Exercise_Model dumbbell = new Exercise_Model("Goblet Squat", gobletSquatHow, gobletSquatWhy, R.drawable.goblet_squat);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Dumbbell Clean", dumbbellCleanHow, dumbbellCleanWhy, R.drawable.dumbell_clean);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Farmers' Walk", farmersWalkHow, farmersWalkWhy, R.drawable.farmers_walk);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Bent-Over Row", bentOverRowHow, bentOverRowWhy, R.drawable.bent_row);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Two Arm Dumbbell Stiff Deadlift", twoArmDumbbellStiffLeggedDeadliftHow, twoArmDumbbellStiffLeggedDeadliftWhy, R.drawable.stiffy_dumbbell);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("One Arm Swing", oneArmSwingHow, oneArmSwingWhy, R.drawable.one_arm_swing);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Bench Press", benchPressHow, benchPressWhy, R.drawable.bench_press_dumbell);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Cross Hammer Body Curl", crossBodyHammerCurlHow, crossBodyHammerCurlWhy, R.drawable.hammer_curl);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Step Ups", stepUpsHow, stepUpsWhy, R.drawable.dumbbell_step_up);
        exercise_modelList.add(dumbbell);

        dumbbell = new Exercise_Model("Dumbbell Scaption", dumbbellScaptionHow, dumbbellScaptionWhy, R.drawable.dumbbell_scaption);
        exercise_modelList.add(dumbbell);
    }
}
