package com.example.fragment_recycle.cardview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_recycle.R;

public class CardViewHolder extends RecyclerView.ViewHolder {
    private TextView cardTitle, description;
    private ImageView imageView;

    public CardViewHolder(@NonNull View itemView) {
        super(itemView);
        cardTitle = itemView.findViewById(R.id.item_card_title);
        description = itemView.findViewById(R.id.item_card_description);
        imageView = itemView.findViewById(R.id.item_card_icon);
    }

    public TextView getCardTitle() {
        return cardTitle;
    }

    public TextView getDescription() {
        return description;
    }

    public ImageView getImageView() {
        return imageView;
    }
}
