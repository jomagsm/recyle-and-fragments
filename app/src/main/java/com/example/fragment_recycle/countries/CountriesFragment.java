package com.example.fragment_recycle.countries;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment_recycle.databinding.FragmentContinentsBinding;
import com.example.fragment_recycle.fragments.continents.ContinentsFragment;

import java.util.ArrayList;


public class CountriesFragment extends Fragment {
    private FragmentContinentsBinding binding;
    private ArrayList<CountryModel> allCountryModelArrayList;
    private ArrayList<CountryModel> countryModelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        init();
        loadData(getArguments().getInt(ContinentsFragment.KEY_FOR_CONTINENTS_ID));
        binding = FragmentContinentsBinding.inflate(getLayoutInflater());
        binding.rvContinents.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvContinents.setAdapter(new CountriesAdapter(countryModelArrayList));
        return binding.getRoot();
    }

    private void init() {
        allCountryModelArrayList = new ArrayList<CountryModel>();
        allCountryModelArrayList.add(new CountryModel(1, "China", "Population 1,439,323,776",
                "https://upload.wikimedia.org/wikipedia/commons/2/2e/Flag_of_China.png"));
        allCountryModelArrayList.add(new CountryModel(1, "India", "Population 1,380,004,385",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_India.png/2560px-Flag_of_India.png"));
        allCountryModelArrayList.add(new CountryModel(1, "Indonesia", "Population 273,523,615",
                "https://upload.wikimedia.org/wikipedia/commons/9/95/Indonesia_flag_300.png"));
        allCountryModelArrayList.add(new CountryModel(1, "Pakistan", "Population 220,892,340",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Flag_of_Pakistan.png/1024px-Flag_of_Pakistan.png"));
        allCountryModelArrayList.add(new CountryModel(1, "Kyrgyzstan", "Population 6,524,195",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Kyrgyzstan.png/1200px-Flag_of_Kyrgyzstan.png"));

        allCountryModelArrayList.add(new CountryModel(2, "Nigeria", "Population 206,139,589",
                "https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Nigeria.png"));
        allCountryModelArrayList.add(new CountryModel(2, "Ethiopia", "Population 114,963,588",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/800px-Flag_of_Ethiopia.svg.png"));
        allCountryModelArrayList.add(new CountryModel(2, "Egypt", "Population 102,334,404",
                "https://upload.wikimedia.org/wikipedia/commons/5/5b/Flag_of_Egypt_%28variant%29.png"));
        allCountryModelArrayList.add(new CountryModel(2, "DR Congo", "Population 89,561,403",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Flag_of_the_Democratic_Republic_of_the_Congo.svg/1280px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
        allCountryModelArrayList.add(new CountryModel(2, "Tanzania", "Population 59,734,218",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Flag_of_Tanzania.svg/640px-Flag_of_Tanzania.svg.png"));

        allCountryModelArrayList.add(new CountryModel(3, "United States", "Population 331,002,651",
                "https://upload.wikimedia.org/wikipedia/commons/d/de/Flag_of_the_United_States.png"));
        allCountryModelArrayList.add(new CountryModel(3, "Canada", "Population 37,742,154",
                "https://upload.wikimedia.org/wikipedia/commons/b/b6/Flag_of_Canada.png"));
        allCountryModelArrayList.add(new CountryModel(3, "Bermuda", "Population 62,278",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Flag_of_Bermuda.svg/2560px-Flag_of_Bermuda.svg.png"));
        allCountryModelArrayList.add(new CountryModel(3, "Greenland", "Population 56,770",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_Greenland.svg/1280px-Flag_of_Greenland.svg.png"));
        allCountryModelArrayList.add(new CountryModel(3, "Saint Pierre & Miquelon", "Population 5,794",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Flag_of_Saint-Pierre_and_Miquelon.svg/2560px-Flag_of_Saint-Pierre_and_Miquelon.svg.png"));

        allCountryModelArrayList.add(new CountryModel(4, "Brazil", "Population 212,559,417",
                "https://upload.wikimedia.org/wikipedia/commons/0/01/Brazil_flag_300.png"));
        allCountryModelArrayList.add(new CountryModel(4, "Mexico", "Population 128,932,753",
                "https://upload.wikimedia.org/wikipedia/commons/1/17/Flag_of_Mexico.png"));
        allCountryModelArrayList.add(new CountryModel(4, "Colombia", "Population 50,882,891",
                "https://upload.wikimedia.org/wikipedia/commons/f/f8/Flag_of_Colombia.png"));
        allCountryModelArrayList.add(new CountryModel(4, "Argentina", "Population 45,195,774",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2560px-Flag_of_Argentina.svg.png"));
        allCountryModelArrayList.add(new CountryModel(4, "Peru", "Population 32,971,854",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1280px-Flag_of_Peru_%28state%29.svg.png"));

        allCountryModelArrayList.add(new CountryModel(5, "Russia", "Population 212,559,417",
                "https://upload.wikimedia.org/wikipedia/commons/d/d4/Flag_of_Russia.png"));
        allCountryModelArrayList.add(new CountryModel(5, "Germany", "Population 83,783,942",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/2560px-Flag_of_Germany.svg.png"));
        allCountryModelArrayList.add(new CountryModel(5, "United Kingdom", "Population 67,886,011",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Flag_of_the_United_Kingdom.png/1200px-Flag_of_the_United_Kingdom.png"));
        allCountryModelArrayList.add(new CountryModel(5, "France", "Population 65,273,511",
                "https://upload.wikimedia.org/wikipedia/commons/6/62/Flag_of_France.png"));
        allCountryModelArrayList.add(new CountryModel(5, "Italy", "Population 60,461,826",
                "https://upload.wikimedia.org/wikipedia/commons/e/e4/Flag_of_Italy_%281946%E2%80%932003%29.png"));



    }

    private void loadData(Integer continentsId) {
        countryModelArrayList = new ArrayList<CountryModel>();
        for (CountryModel country : allCountryModelArrayList
        ) {
            if (country.getContinentsId().equals(continentsId)) {
                countryModelArrayList.add(country);
            }
        }
    }
}