package com.example.mcm10.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mcm10.R;
import com.example.mcm10.RecyclerView.Adapter;
import com.example.mcm10.RecyclerView.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    Adapter adapter;

    List<Items> itemList = new ArrayList<>();
    List<String> titles = new ArrayList<>();
    List<String> dates = new ArrayList<>();
    List<Integer> images = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fillItemList();

        for (Items item : itemList) {
            titles.add(item.getTitle());
            dates.add(item.getDate());
            images.add(item.getImage());
        }

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), titles, dates, images);
        recyclerView.setAdapter(adapter);
    }

    private void fillItemList() {
        Items i0 = new Items("Minds in Motion", "May 10, 2024", R.drawable._41030218_847772100724534_5076003307943691895_n__1_);
        Items i1 = new Items("Enrollment currently ongoing", "May 13, 2024", R.drawable._40096297_844122001089544_8651516815143089047_n);
        Items i2 = new Items("asdasdsafajkhdkajshdkjh", "2024-15-09", R.drawable.ic_launcher_background);

        itemList.addAll(Arrays.asList(i0, i1, i2));
    }
}