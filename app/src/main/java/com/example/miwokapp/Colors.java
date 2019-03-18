package com.example.miwokapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    ArrayList<Row_Data> row_dataArrayList;
    RecyclerView recyclerView;
    int Color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        recyclerView = findViewById(R.id.recyclerView_Color);
        row_dataArrayList = new ArrayList<>();

        row_dataArrayList.add(new Row_Data(getString(R.string.Red),getString(R.string.Wetetti),R.raw.color_red));
        row_dataArrayList.add(new Row_Data(getString(R.string.Green),getString(R.string.Chokokki),R.raw.color_green));
        row_dataArrayList.add(new Row_Data(getString(R.string.Brown),getString(R.string.Takaakki),R.raw.color_brown));
        row_dataArrayList.add(new Row_Data(getString(R.string.Gray),getString(R.string.Topappi),R.raw.color_gray));
        row_dataArrayList.add(new Row_Data(getString(R.string.Black),getString(R.string.Kululli),R.raw.color_black));
        row_dataArrayList.add(new Row_Data(getString(R.string.White),getString(R.string.Kelelli),R.raw.color_white));
        row_dataArrayList.add(new Row_Data(getString(R.string.Dusty_Yellow),getString(R.string.Topiisa),R.raw.color_dusty_yellow));
        row_dataArrayList.add(new Row_Data(getString(R.string.Mustard_Yellow),getString(R.string.Chiwita),R.raw.color_mustard_yellow));

        MyRecyclerArrayAdapter myRecyclerArrayAdapter = new MyRecyclerArrayAdapter(row_dataArrayList,this,getResources().getColor(R.color.Color));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myRecyclerArrayAdapter);

    }
}
