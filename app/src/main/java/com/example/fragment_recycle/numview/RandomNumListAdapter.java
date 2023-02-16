package com.example.fragment_recycle.numview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_recycle.R;

import java.util.ArrayList;

public class RandomNumListAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private ArrayList<Integer> arrayList;

    public RandomNumListAdapter(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.frame_textview;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.getView().setText(String.valueOf(arrayList.get(position)));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}