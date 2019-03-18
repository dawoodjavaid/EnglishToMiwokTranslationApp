package com.example.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    ArrayList<Row_Data> row_dataArrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        recyclerView = findViewById(R.id.recyclerView_Phrases);
        row_dataArrayList = new ArrayList<>();

        row_dataArrayList.add(new Row_Data(getString(R.string.Where),getString(R.string.Where1),R.raw.phrase_where_are_you_going));
        row_dataArrayList.add(new Row_Data(getString(R.string.What),getString(R.string.What1),R.raw.phrase_what_is_your_name));
        row_dataArrayList.add(new Row_Data(getString(R.string.My),getString(R.string.My1),R.raw.phrase_my_name_is));
        row_dataArrayList.add(new Row_Data(getString(R.string.How),getString(R.string.How1),R.raw.phrase_how_are_you_feeling));
        row_dataArrayList.add(new Row_Data(getString(R.string.I),getString(R.string.I1),R.raw.phrase_im_feeling_good));
        row_dataArrayList.add(new Row_Data(getString(R.string.Are),getString(R.string.Are1),R.raw.phrase_are_you_coming));
        row_dataArrayList.add(new Row_Data(getString(R.string.Yes),getString(R.string.Yes1),R.raw.phrase_yes_im_coming));
        row_dataArrayList.add(new Row_Data(getString(R.string.Im),getString(R.string.Im1),R.raw.phrase_im_coming));
        row_dataArrayList.add(new Row_Data(getString(R.string.Lets),getString(R.string.Lets1),R.raw.phrase_lets_go));
        row_dataArrayList.add(new Row_Data(getString(R.string.Come),getString(R.string.Come1),R.raw.phrase_come_here));

        MyRecyclerArrayAdapter myRecyclerArrayAdapter = new MyRecyclerArrayAdapter(row_dataArrayList,this,getResources().getColor(R.color.Phrases));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myRecyclerArrayAdapter);

    }
}
