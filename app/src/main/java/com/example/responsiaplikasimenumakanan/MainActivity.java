package com.example.responsiaplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Makanan> getMyList(){
        ArrayList<Makanan> makanans = new ArrayList<>();

        Makanan m = new Makanan();
        m.setMakanan("Pecel Lele");
        m.setHarga("Rp 15.000");
        m.setDescription("Makanan Lesehan");
        m.setImg(R.drawable.gep);
        makanans.add(m);

        m = new Makanan();
        m.setMakanan("Nasi Goreng Mercon");
        m.setHarga("Rp 14.500");
        m.setDescription("Nasi Goreng Pedas Banget");
        m.setImg(R.drawable.gep);
        makanans.add(m);

        m = new Makanan();
        m.setMakanan("Ayam Geprek Keju");
        m.setHarga("Rp 20.000");
        m.setDescription("Ayam yang digeprek yang ditambahi keju");
        m.setImg(R.drawable.gep);
        makanans.add(m);

        m = new Makanan();
        m.setMakanan("Kari Ayam");
        m.setHarga("Rp 17.500");
        m.setDescription("Kari dengan daging ayam");
        m.setImg(R.drawable.gep);
        makanans.add(m);

        m = new Makanan();
        m.setMakanan("Tahu Bulat");
        m.setHarga("Rp 500");
        m.setDescription("Tahu Bulat yang digoreng dadakan");
        m.setImg(R.drawable.gep);
        makanans.add(m);

        m = new Makanan();
        m.setMakanan("Salad Buah");
        m.setHarga("Rp 12.000");
        m.setDescription("Salad isi buah");
        m.setImg(R.drawable.gep);
        makanans.add(m);

        return makanans;
    }

    public void berikut(View view) {
        Intent intent = new Intent(this, HalamanDes.class);

        startActivity(intent);
    }
}
