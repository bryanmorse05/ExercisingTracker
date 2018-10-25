package com.rainy.bryan.exercisingtracker.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.rainy.bryan.exercisingtracker.R;
import com.rainy.bryan.exercisingtracker.models.Exercise_Model_Video;

import java.util.List;

public class Exercise_Model_Video_Recycler_Adapter extends RecyclerView.Adapter<Exercise_Model_Video_Recycler_Adapter.MyViewHolder> {

    private List<Exercise_Model_Video> exercise_modelList_video;
    private MediaController mediaController;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView vName;
        public TextView vHow;
        public TextView vWhy;
        public VideoView vPlayer;

        public MyViewHolder(View view) {
            super(view);

            vName = view.findViewById(R.id.videoExerciseName);
            vHow = view.findViewById(R.id.videoExerciseHow);
            vWhy = view.findViewById(R.id.videoExerciseWhy);
            vPlayer = view.findViewById(R.id.videoExerciseVideo);

            mediaController = new MediaController(itemView.getContext());
            mediaController.setAnchorView(vPlayer);
        }
    }

    public Exercise_Model_Video_Recycler_Adapter(List<Exercise_Model_Video> exercise_modelList_video) {
        this.exercise_modelList_video = exercise_modelList_video;
    }

    @NonNull
    @Override
    public Exercise_Model_Video_Recycler_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_video_exercises, parent, false);

        return new Exercise_Model_Video_Recycler_Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Exercise_Model_Video_Recycler_Adapter.MyViewHolder holder, int position) {

        final Exercise_Model_Video exercise_model_video = exercise_modelList_video.get(position);

        holder.vName.setText(exercise_model_video.getName());
        holder.vHow.setText(exercise_model_video.getHowDescription());
        holder.vWhy.setText(exercise_model_video.getWhyDescription());

        //Video player

        holder.vPlayer.setMediaController(mediaController);
        holder.vPlayer.setVideoPath(exercise_model_video.getVideoURL());
//        holder.vURL.start();
    }

    @Override
    public int getItemCount() {
        return exercise_modelList_video.size();
    }
}
