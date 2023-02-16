package com.example.fragment_recycle.cardview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragment_recycle.R;
import com.example.fragment_recycle.numview.RandomNumListAdapter;
import com.example.fragment_recycle.photoview.PhotoRatingFragment;

import java.util.ArrayList;
import java.util.UUID;

public class CardFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<CardModel> arrayList;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_card, container, false);
        getData();
        initView(view);
        btnListener();
        return view;
    }

    private void btnListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PhotoRatingFragment fragment = new PhotoRatingFragment();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, fragment).addToBackStack(null).commit();
            }
        });
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.cf_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new CardItemAdapter(arrayList));
        btn = view.findViewById(R.id.cf_btn);
    }

    private void getData() {
        arrayList = new ArrayList<CardModel>();
        Boolean isFavorite = false;
        for (int _; arrayList.size() < 30; ) {
            isFavorite = !isFavorite;
            String title = UUID.randomUUID().toString().substring(0, 10);
            String description = UUID.randomUUID().toString().substring(0, 30);
            arrayList.add(new CardModel(title, description, isFavorite));
        }
    }
}