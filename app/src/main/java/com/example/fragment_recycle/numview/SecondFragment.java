package com.example.fragment_recycle.numview;

import static kotlin.random.RandomKt.Random;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragment_recycle.R;
import com.example.fragment_recycle.cardview.CardFragment;

import java.util.ArrayList;
import java.util.Random;

public class SecondFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Integer> arrayList;
    private Button btn;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        getData();
        initView(view);
        btnListener();
        return view;
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new RandomNumListAdapter(arrayList));
        btn = view.findViewById(R.id.sf_btn);
    }

    private void btnListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardFragment cardFragment = new CardFragment();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, cardFragment).addToBackStack(null).commit();
            }
        });
    }

    private void getData() {
        arrayList = new ArrayList<Integer>();
        for (int _; arrayList.size() < 50; ) {
            Random rand = new Random();
            Integer randomInt = rand.nextInt(10000);
            arrayList.add(randomInt);
        }
    }
}