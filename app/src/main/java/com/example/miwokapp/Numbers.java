package com.example.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    ArrayList<Row_Data> row_dataArrayList ;
    RecyclerView recyclerView;
    MyRecyclerArrayAdapter myRecyclerArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        row_dataArrayList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_List_View);

        row_dataArrayList.add(new Row_Data(getString(R.string.One),getString(R.string.Lutti),R.raw.number_one));
        row_dataArrayList.add(new Row_Data(getString(R.string.Two),getString(R.string.Otiko),R.raw.number_two));
        row_dataArrayList.add(new Row_Data(getString(R.string.Three),getString(R.string.Tolookosu),R.raw.number_three));
        row_dataArrayList.add(new Row_Data(getString(R.string.Four),getString(R.string.Oyyisa),R.raw.number_four));
        row_dataArrayList.add(new Row_Data(getString(R.string.Five),getString(R.string.Massokka),R.raw.number_five));
        row_dataArrayList.add(new Row_Data(getString(R.string.Six),getString(R.string.Temmokka),R.raw.number_six));
        row_dataArrayList.add(new Row_Data(getString(R.string.Seven),getString(R.string.Kenekuka),R.raw.number_seven));
        row_dataArrayList.add(new Row_Data(getString(R.string.Eight),getString(R.string.Kawinta),R.raw.number_eight));
        row_dataArrayList.add(new Row_Data(getString(R.string.Nine),getString(R.string.Woe),R.raw.number_nine));
        row_dataArrayList.add(new Row_Data(getString(R.string.Ten),getString(R.string.Naaacha),R.raw.number_ten));


        myRecyclerArrayAdapter = new MyRecyclerArrayAdapter(row_dataArrayList,this,getResources().getColor(R.color.Numbers));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myRecyclerArrayAdapter);

    }
}
