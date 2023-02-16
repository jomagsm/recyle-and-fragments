package com.example.fragment_recycle.photoview;

import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment_recycle.R;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class PhotoRatingAdapter extends RecyclerView.Adapter<PhotoViewHolder> {
    private ArrayList<PhotoRatingModel> arrayList;

    public PhotoRatingAdapter(ArrayList<PhotoRatingModel> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.photo_rating_item;
    }

    @NonNull
    @Override
    public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new PhotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoViewHolder holder, int position) {
        PhotoRatingModel item = arrayList.get(position);
        try {
            URL newUrl = new URL(item.getImgUrl());
            holder.getAvatar().setImageBitmap(BitmapFactory.decodeStream(newUrl.
                    openConnection().getInputStream()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        holder.getTitle().setText(item.getTitle());
        setRatingImage(holder, item);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    private void setRatingImage(PhotoViewHolder holder, PhotoRatingModel item) {
        Integer ratingOn = R.drawable.baseline_star_on;
        Integer ratingOf = R.drawable.baseline_star_off;
        holder.getRating1().setImageResource(ratingOf);
        holder.getRating2().setImageResource(ratingOf);
        holder.getRating3().setImageResource(ratingOf);
        holder.getRating4().setImageResource(ratingOf);
        holder.getRating5().setImageResource(ratingOf);
        switch (item.getRating()) {
            case 1:
                holder.getRating1().setImageResource(ratingOn);
                break;
            case 2:
                holder.getRating1().setImageResource(ratingOn);
                holder.getRating2().setImageResource(ratingOn);
                break;
            case 3:
                holder.getRating1().setImageResource(ratingOn);
                holder.getRating2().setImageResource(ratingOn);
                holder.getRating3().setImageResource(ratingOn);
                break;
            case 4:
                holder.getRating1().setImageResource(ratingOn);
                holder.getRating2().setImageResource(ratingOn);
                holder.getRating3().setImageResource(ratingOn);
                holder.getRating4().setImageResource(ratingOn);
                break;
            case 5:
                holder.getRating1().setImageResource(ratingOn);
                holder.getRating2().setImageResource(ratingOn);
                holder.getRating3().setImageResource(ratingOn);
                holder.getRating4().setImageResource(ratingOn);
                holder.getRating5().setImageResource(ratingOn);
                break;
        }
    }

}
