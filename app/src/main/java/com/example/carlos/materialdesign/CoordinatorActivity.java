package com.example.carlos.materialdesign;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.carlos.materialdesign.adapters.CardAdapter;


import java.util.ArrayList;

public class CoordinatorActivity extends AppCompatActivity {

    CardAdapter simpleAdapter;
    private RecyclerView mRecyclerView;
    private ArrayList<String> titles = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

        titles.add("Android is awesome, pretty  :) Android is awesome, pretty  :) Android is awesome, pretty  :)");
        titles.add("Windows phone, I don't like it . Windows phone, I don't like it  Windows phone, I don't like it  ");
        titles.add("Tizen, what is that?. Tizen, what is that?. Tizen, what is that?");
        titles.add("Firefox Os. Firefox Os Firefox Os Firefox Os Firefox Os Firefox Os Firefox Os");
        titles.add("Android is awesome, pretty  :) Android is awesome, pretty  :) Android is awesome, pretty  :)");
        titles.add("Windows phone, I don't like it . Windows phone, I don't like it  Windows phone, I don't like it  ");
        titles.add("Tizen, what is that?. Tizen, what is that?. Tizen, what is that?");
        titles.add("Firefox Os. Firefox Os Firefox Os Firefox Os Firefox Os Firefox Os Firefox Os");
        titles.add("Android is awesome, pretty  :) Android is awesome, pretty  :) Android is awesome, pretty  :)");
        titles.add("Windows phone, I don't like it . Windows phone, I don't like it  Windows phone, I don't like it  ");
        titles.add("Tizen, what is that?. Tizen, what is that?. Tizen, what is that?");
        titles.add("Firefox Os. Firefox Os Firefox Os Firefox Os Firefox Os Firefox Os Firefox Os");


        mRecyclerView = (RecyclerView) findViewById(R.id.card_list);

        simpleAdapter = new CardAdapter(titles);

        mRecyclerView.setAdapter(simpleAdapter);


//        mRecyclerView.setHasFixedSize(true); //si los view tendran el mismo height

        //Administrador de dise;o
        mRecyclerView.setLayoutManager(
                new LinearLayoutManager(this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_coordinator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
