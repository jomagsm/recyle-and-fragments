package com.example.fragment_recycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fragment_recycle.fragments.continents.ContinentsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ContinentsFragment()).commit();
        }
    }
}