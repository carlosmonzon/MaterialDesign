package com.example.carlos.materialdesign.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.carlos.materialdesign.R;

import java.util.ArrayList;

/**
 * author Carlos Monzon
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.SimpleViewHolder> {

    ArrayList<String> titles;

    public CardAdapter(ArrayList<String> titles) {
        this.titles = titles;
    }

    @Override
    public CardAdapter.SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.simple_cardview, parent, false);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        SimpleViewHolder pvh = new SimpleViewHolder(v);

        return pvh;
    }

    @Override
    public void onBindViewHolder(CardAdapter.SimpleViewHolder holder, int position) {

        holder.mTextView.setText(titles.get(position));

    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public static class SimpleViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        SimpleViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_body);
        }
    }
}

