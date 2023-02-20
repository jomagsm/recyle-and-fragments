package com.example.fragment_recycle.fragments.continents;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment_recycle.OnClick;
import com.example.fragment_recycle.R;
import com.example.fragment_recycle.countries.CountriesFragment;
import com.example.fragment_recycle.databinding.FragmentContinentsBinding;

import java.util.ArrayList;

public class ContinentsFragment extends Fragment implements OnClick {
    public static final String KEY_FOR_CONTINENTS_ID = "k";
    private FragmentContinentsBinding binding;
    private ArrayList<ContinentModel> continentModelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getData();
        binding = FragmentContinentsBinding.inflate(getLayoutInflater());
        binding.rvContinents.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvContinents.setAdapter(new ContinentsAdapter(continentModelArrayList, this));
        return binding.getRoot();
    }

    private void getData() {
        continentModelArrayList = new ArrayList<ContinentModel>();
        continentModelArrayList.add(new ContinentModel(1, "Asia",
                "Asia is a continent which is part of Eurasia. It is the largest continent " +
                        "in the world by both land area and population " +
                        "and shares the landmass of Afro-Eurasia with Europe and Africa. Asia covers " +
                        "an area of 44,579,000 square kilometres (17,212,000 sq mi), about 30% of Earth's " +
                        "total land area and 8.7% of Earth's total surface area. The continent, " +
                        "which has long been home to the majority of the human population," +
                        "was the site of many of the first civilizations. Its 4.7 billion people" +
                        "constitute roughly 60% of the world's population, having more people than all " +
                        "other continents combined.",
                "https://e7.pngegg.com/pngimages/482/792/png-clipart-asia-continental-map-asia-europe-globe-world-map-asia-world-map-thumbnail.png"));
        continentModelArrayList.add(new ContinentModel(2, "Africa",
                "Africa is the world's second-largest and second-most populous continent, " +
                        "after Asia in both cases. At about 30.3 million km2 (11.7 million square miles) " +
                        "including adjacent islands, it covers 6% of Earth's total surface area and " +
                        "20% of its land area.With 1.4 billion people as of 2021, it accounts " +
                        "for about 18% of the world's human population. Africa's population is the " +
                        "youngest amongst all the continents;[8][9] the median age in 2012 was 19.7, " +
                        "when the worldwide median age was 30.4 Despite a wide range of natural resources," +
                        " Africa is the least wealthy continent per capita and second-least wealthy " +
                        "by total wealth, behind Oceania. Scholars have attributed this to different " +
                        "factors including geography, climate, tribalism, colonialism, the Cold War, " +
                        "neocolonialism, lack of democracy, and corruption. Despite this low " +
                        "concentration of wealth, recent economic expansion and the large and young " +
                        "population make Africa an important economic market in the broader global context.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/60/Africa-outline.png/1200px-Africa-outline.png"));
        continentModelArrayList.add(new ContinentModel(3, "North America",
                "North America, the third-largest continent, extends from the tiny Aleutian " +
                        "Islands in the northwest to the Isthmus of Panama in the south. The continent " +
                        "includes the enormous island of Greenland in the northeast. In the far north," +
                        " the continent stretches halfway around the world, from Greenland to the Aleutians." +
                        " But at Panama’s narrowest part, the continent is just 50 kilometers (31 miles) across.",
                "https://upload.wikimedia.org/wikipedia/en/e/e9/North_America.PNG"));
        continentModelArrayList.add(new ContinentModel(4, "South America",
                "South America is connected to North America by the narrow Isthmus of Panama. " +
                        "These two continents weren’t always connected; they came together only " +
                        "three million years ago. South America is the fourth-largest continent and " +
                        "extends from the sunny beaches of the Caribbean Sea to the frigid waters" +
                        " near the Antarctic Circle.",
                "https://www.nicepng.com/png/detail/13-133279_south-america-south-america-png-map.png"));
        continentModelArrayList.add(new ContinentModel(5, "Europe",
                "Europe, the sixth-largest continent, contains just seven percent of the " +
                        "world’s land. In total area, the continent of Europe is only slightly larger " +
                        "than the country of Canada. However, the population of Europe is more than " +
                        "twice that of South America. Europe has more than 40 countries and many of " +
                        "the world’s major cities, including London, the United Kingdom; Paris, France; " +
                        "Berlin, Germany; Rome, Italy; Madrid, Spain; and Moscow, Russia.",
                "https://www.pngitem.com/pimgs/m/52-520368_europe-clipart-continent-europe-map-vector-png-transparent.png"));
    }

    @Override
    public void onClick(int position) {
        CountriesFragment countriesFragment = new CountriesFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_FOR_CONTINENTS_ID, continentModelArrayList.get(position).getId());
        countriesFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, countriesFragment).addToBackStack(null).commit();
    }
}