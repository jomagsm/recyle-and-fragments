package com.example.fragment_recycle.photoview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment_recycle.R;
import com.example.fragment_recycle.cardview.CardItemAdapter;
import com.example.fragment_recycle.cardview.CardModel;
import com.example.fragment_recycle.numview.RandomNumListAdapter;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class PhotoRatingFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<PhotoRatingModel> arraylist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }
        View view = inflater.inflate(R.layout.fragment_photo_rating, container, false);
        getData();
        initView(view);
        return view;
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.pf_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new PhotoRatingAdapter(arraylist));
    }

    private void getData() {
        arraylist = new ArrayList<PhotoRatingModel>();
        String imgUrl = "https://picsum.photos/75/75";
        Random random = new Random();
        for (int _; arraylist.size() < 10; ) {
            String title = UUID.randomUUID().toString().substring(0, 10);
            Integer rating = random.nextInt(6);
            arraylist.add(new PhotoRatingModel(title, imgUrl, rating));
        }
    }
}