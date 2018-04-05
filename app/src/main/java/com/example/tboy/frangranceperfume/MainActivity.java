package com.example.tboy.frangranceperfume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PerfumeAdapter adapter;
    List<Perfume> PerfumeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PerfumeList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        PerfumeList.add(
                new Perfume(
                        "Cashmere Mist",
                        "By Donna Karan",
                        "Women",
                        "6 Sizes Available",
                        R.drawable.cashmere_mist));

        PerfumeList.add(
                new Perfume(
                        "Aromatics Elixir",
                        "By Clinique",
                        "Men",
                        "3 Sizes Available",
                        R.drawable.aromatics_elixir));

        PerfumeList.add(
                new Perfume(
                        "Euphoria",
                        "By Taiwo Sunday",
                        "Women",
                        "5 Sizes Available",
                        R.drawable.euphoria));

        PerfumeList.add(
                new Perfume(
                        "Miss Dice",
                        "By Dominic BurstBrain",
                        "men",
                        "2 Sizes Available",
                        R.drawable.missdice));
        adapter = new PerfumeAdapter(this, PerfumeList);
        recyclerView.setAdapter(adapter);
    }
}
