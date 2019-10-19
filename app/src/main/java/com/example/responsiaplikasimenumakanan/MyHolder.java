package com.example.responsiaplikasimenumakanan;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mImageView;
    TextView mTitle, mdesc, mHarga;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.ImageIv);
        this.mTitle = itemView.findViewById(R.id.titleMakanan);
        this.mHarga = itemView.findViewById(R.id.harga);
    }
}
