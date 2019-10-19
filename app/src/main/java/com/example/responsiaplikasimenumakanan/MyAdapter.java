package com.example.responsiaplikasimenumakanan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Makanan> makanans;

    public MyAdapter(Context c, ArrayList<Makanan> makanans) {
        this.c = c;
        this.makanans = makanans;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.mTitle.setText(makanans.get(position).getMakanan());
        holder.mHarga.setText(makanans.get(position).getHarga());
        holder.mImageView.setImageResource(makanans.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return makanans.size();
    }
}
