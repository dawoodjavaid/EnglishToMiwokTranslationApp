package com.example.miwokapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {


    ArrayList<Row_Data> row_dataArrayList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        recyclerView = findViewById(R.id.FamilyRecyclerView);
        row_dataArrayList = new ArrayList<>();

        row_dataArrayList.add(new Row_Data(getString(R.string.Father),getString(R.string.Apa),R.raw.family_father));
        row_dataArrayList.add(new Row_Data(getString(R.string.Mother),getString(R.string.Ata),R.raw.family_mother));
        row_dataArrayList.add(new Row_Data(getString(R.string.Son),getString(R.string.Angsi),R.raw.family_son));
        row_dataArrayList.add(new Row_Data(getString(R.string.Daughter),getString(R.string.Tune),R.raw.family_daughter));
        row_dataArrayList.add(new Row_Data(getString(R.string.Older_Brother),getString(R.string.Taachi),R.raw.family_older_brother));
        row_dataArrayList.add(new Row_Data(getString(R.string.Younger_Brother),getString(R.string.Chalitti),R.raw.family_younger_brother));
        row_dataArrayList.add(new Row_Data(getString(R.string.Older_Sister),getString(R.string.Tete),R.raw.family_older_sister));
        row_dataArrayList.add(new Row_Data(getString(R.string.Younger_Sister),getString(R.string.Kolliti),R.raw.family_younger_sister));
        row_dataArrayList.add(new Row_Data(getString(R.string.Grand_Mother),getString(R.string.Ama),R.raw.family_grandmother));
        row_dataArrayList.add(new Row_Data(getString(R.string.Grand_Ftaher),getString(R.string.Paapa),R.raw.family_grandfather));



        MyRecyclerArrayAdapter myRecyclerArrayAdapter = new MyRecyclerArrayAdapter(row_dataArrayList,this,getResources().getColor(R.color.Family));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myRecyclerArrayAdapter);



    }
}
