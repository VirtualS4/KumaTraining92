package com.example.rona.kumatraining92;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BearHands extends RecyclerView.Adapter<BearHands.ViewHolder> {
    private List<Characters> Candies;



    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView vname,vage,vrole;
        public ImageView imvpicture;
        public ViewHolder(View v){
            super(v);
            vname = v.findViewById(R.id.name);
            vage = v.findViewById(R.id.age);
            vrole = v.findViewById(R.id.role);
            imvpicture = v.findViewById(R.id.picture);
        }
    }

    public BearHands(List<Characters> list){
        this.Candies = list;
    }

    @Override
    public BearHands.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_character_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(BearHands.ViewHolder holder, int position) {

        Characters song = Candies.get(position);
        holder.vname.setText(song.getName());
        holder.vrole.setText(song.getRole());
        holder.vage.setText(song.getAge());
        holder.imvpicture.setImageResource(song.getPic());
    }

    @Override
    public int getItemCount() {
        return Candies.size();
    }

}
