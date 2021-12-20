package com.geektech.lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> names = new ArrayList<>();
    private itemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        LoadData();
        adapter = new itemAdapter(names);
recyclerView.setAdapter(adapter);
    }

    private void LoadData() {
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
        names.add(new Model(R.drawable.ic_circle, "Mubarak \n 0771416416"));
    }
}