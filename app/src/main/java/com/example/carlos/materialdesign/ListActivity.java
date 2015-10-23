package com.example.carlos.materialdesign;

import com.example.carlos.materialdesign.adapters.SimpleAdapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;


    private ArrayList<String> titles = new ArrayList<>();

    SimpleAdapter simpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        titles.add("Android");
        titles.add("Windows phone");
        titles.add("Tizen");
        titles.add("Firefox Os");
        titles.add("ios :/");

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        simpleAdapter = new SimpleAdapter(titles);
        mRecyclerView.setAdapter(simpleAdapter);

        mRecyclerView.setHasFixedSize(true); //si los view tendran el mismo height

        //Administrador de dise;o
        mRecyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }


}
