package com.rainy.bryan.exercisingtracker.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainy.bryan.exercisingtracker.R;
import com.rainy.bryan.exercisingtracker.models.Exercise_Model;

import java.util.List;

public class Exercise_Model_Recycler_Adapter extends RecyclerView.Adapter<Exercise_Model_Recycler_Adapter.MyViewHolder> {

    private List<Exercise_Model> exercise_modelList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView dName;
        public TextView dHow;
        public TextView dWhy;
        public ImageView dGif;

        public MyViewHolder(View view) {
            super(view);

            dName = view.findViewById(R.id.dumbbellName);
            dHow = view.findViewById(R.id.dumbbellHow);
            dWhy = view.findViewById(R.id.dumbbellWhy);
            dGif = view.findViewById(R.id.dumbbellGif);
        }
    }

    public Exercise_Model_Recycler_Adapter(List<Exercise_Model> exercise_modelList) {
        this.exercise_modelList = exercise_modelList;
    }

    @NonNull
    @Override
    public Exercise_Model_Recycler_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_dumbbell_exercises, parent, false);

        return new Exercise_Model_Recycler_Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Exercise_Model_Recycler_Adapter.MyViewHolder holder, int position) {

        final Exercise_Model exercise_model = exercise_modelList.get(position);

        holder.dName.setText(exercise_model.getName());
        holder.dHow.setText(exercise_model.getHowDescription());
        holder.dWhy.setText(exercise_model.getWhyDescription());
        Glide.with(holder.itemView).load(exercise_model.getExampleGif()).into(holder.dGif);

    }

    @Override
    public int getItemCount() {
        return exercise_modelList.size();
    }
}
