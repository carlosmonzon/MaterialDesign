package com.example.carlos.materialdesign.adapters;

import com.example.carlos.materialdesign.R;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * author cmonzon
 */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder> {

    ArrayList<String> titles;

    public SimpleAdapter(ArrayList<String> titles) {
        this.titles = titles;
    }

    @Override
    public SimpleAdapter.SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_simple_textview, parent, false);
        SimpleViewHolder pvh = new SimpleViewHolder(v);

        return pvh;
    }

    @Override
    public void onBindViewHolder(SimpleAdapter.SimpleViewHolder holder, int position) {

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
            mTextView = (TextView) itemView.findViewById(R.id.simple_text);
        }
    }
}
