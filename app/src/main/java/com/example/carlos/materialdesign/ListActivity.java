package com.example.carlos.materialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import com.example.carlos.materialdesign.adapters.SimpleAdapter;

import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {

    SimpleAdapter simpleAdapter;
    private RecyclerView mRecyclerView;
    private ArrayList<String> titles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        titles.add("Android is awesome, pretty  :)");
        titles.add("Windows phone, I don't like it. It sucks. Windows phone, I don't like it. It sucks ");
        titles.add("Tizen, what is that?");
        titles.add("Firefox Os");
        titles.add("ios :/");
        titles.add("Android is awesome, pretty  :)");
        titles.add("Windows phone, I don't like it. It sucks ");
        titles.add("Tizen, what is that?");
        titles.add("Firefox Os");
        titles.add("ios :/");


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        simpleAdapter = new SimpleAdapter(titles);

        mRecyclerView.setAdapter(simpleAdapter);


//        mRecyclerView.setHasFixedSize(true); //si los view tendran el mismo height

        //Administrador de dise;o
        mRecyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_card_view_activty, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_add_item) {
            titles.add("New OS, new Description");
            simpleAdapter.notifyItemInserted(titles.size());
        }

        return true;
    }
}
