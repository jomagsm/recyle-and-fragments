package com.example.fragment_recycle.photoview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_recycle.R;

public class PhotoViewHolder extends RecyclerView.ViewHolder {
    private ImageView avatar, rating1, rating2, rating3, rating4, rating5;
    private TextView title;

    public PhotoViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.ci_avatarIV);
        title = itemView.findViewById(R.id.ci_titleTV);
        rating1 = itemView.findViewById(R.id.ci_rating1IV);
        rating2 = itemView.findViewById(R.id.ci_rating2IV);
        rating3 = itemView.findViewById(R.id.ci_rating3IV);
        rating4 = itemView.findViewById(R.id.ci_rating4IV);
        rating5 = itemView.findViewById(R.id.ci_rating5IV);
    }

    public ImageView getAvatar() {
        return avatar;
    }


    public TextView getTitle() {
        return title;
    }

    public ImageView getRating1() {
        return rating1;
    }

    public ImageView getRating2() {
        return rating2;
    }

    public ImageView getRating3() {
        return rating3;
    }

    public ImageView getRating4() {
        return rating4;
    }

    public ImageView getRating5() {
        return rating5;
    }
}
