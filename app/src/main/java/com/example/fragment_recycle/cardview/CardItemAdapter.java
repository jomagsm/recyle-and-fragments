package com.example.fragment_recycle.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_recycle.R;

import java.util.ArrayList;

public class CardItemAdapter extends RecyclerView.Adapter<CardViewHolder> {
    private ArrayList<CardModel> arrayList;

    public CardItemAdapter(ArrayList<CardModel> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.item_card_layout;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.getCardTitle().setText(String.valueOf(arrayList.get(position).getTitle()));
        holder.getDescription().setText(String.valueOf(arrayList.get(position).getDescription()));
        if (arrayList.get(position).getFavorite()) {
            holder.getImageView().setImageResource(R.drawable.baseline_star_on);
        } else {
            holder.getImageView().setImageResource(R.drawable.baseline_star_off);
        }
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
