package com.gaia.app.smartwarehouse.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gaia.app.smartwarehouse.R;

/**
 * Created by anant on 14/06/16.
 */

public class BoxAdapter extends RecyclerView.Adapter<BoxAdapter.ViewHolder> {


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fill_table, parent, false);

        BoxAdapter.ViewHolder viewHolder = new BoxAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ViewHolder(View v){
            super(v);
            imageView = (ImageView) v.findViewById(R.id.box);
        }

    }
}
