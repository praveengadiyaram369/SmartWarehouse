package com.gaia.app.smartwarehouse.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gaia.app.smartwarehouse.R;

/**
 * Created by anant on 13/06/16.
 */

class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText("item");
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(View v){
            super(v);
            imageView = (ImageView) v.findViewById(R.id.rectangle);
            textView = (TextView) v.findViewById(R.id.textView1);
        }

    }
}