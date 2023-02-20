package com.example.fragment_recycle.countries;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fragment_recycle.R;
import com.example.fragment_recycle.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesViewHolder> {
    private ArrayList<CountryModel> countryModelArrayList;

    public CountriesAdapter(ArrayList<CountryModel> countryModelArrayList) {
        this.countryModelArrayList = countryModelArrayList;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContinentBinding binding = ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CountriesViewHolder(binding);
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.item_continent;
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        CountryModel item = countryModelArrayList.get(position);
        holder.getBinding().titleContinent.setText(item.getName());
        holder.getBinding().descriptionContinent.setText(item.getDescription());
        Glide.with(holder.getBinding().imageContinent).load(item.getFlagUrl())
                .into(holder.getBinding().imageContinent);
    }

    @Override
    public int getItemCount() {
        return countryModelArrayList.size();
    }
}
