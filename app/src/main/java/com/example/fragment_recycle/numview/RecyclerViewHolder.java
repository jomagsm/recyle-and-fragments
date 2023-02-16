package com.example.fragment_recycle.numview;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_recycle.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView view;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView.findViewById(R.id.randomText);
    }

    public TextView getView() {
        return view;
    }
}