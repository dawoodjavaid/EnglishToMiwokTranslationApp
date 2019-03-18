package com.example.miwokapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyRecyclerArrayAdapter extends RecyclerView.Adapter<MyRecyclerArrayAdapter.MyViewHolder> {

    ArrayList<Row_Data> dataArrayList ;
    Context context ;
    int Color;
    MediaPlayer mediaPlayer=null;

    public MyRecyclerArrayAdapter(ArrayList<Row_Data> dataArrayList,Context context,int Color) {
        this.dataArrayList = dataArrayList;
        this.context =context;
        this.Color = Color;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View myView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.word_list,viewGroup,false);
        return new MyViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.textViewEnglish.setText(dataArrayList.get(i).getEnglishWord());
        myViewHolder.textViewMiwok.setText(dataArrayList.get(i).getMiwokWord());
        myViewHolder.linearLayout.setBackgroundColor(Color);
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewMiwok, textViewEnglish;
        LinearLayout  linearLayout;
        public MyViewHolder(View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linearLayout_Box);
            textViewMiwok = itemView.findViewById(R.id.MiwokWord_Tv);
            textViewEnglish = itemView.findViewById(R.id.EnglishWord_Tv);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if (mediaPlayer!=null){
                mediaPlayer.stop();
                mediaPlayer=null;
            }

            mediaPlayer = MediaPlayer.create(context,dataArrayList.get(getLayoutPosition()).getAudio());
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.stop();
                    mediaPlayer=null;
                }
            });

        }
    }
}
