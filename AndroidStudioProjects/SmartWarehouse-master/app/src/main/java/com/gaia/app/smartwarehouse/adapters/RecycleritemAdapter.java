package com.gaia.app.smartwarehouse.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.gaia.app.smartwarehouse.R;

/**
 * Created by praveen_gadi on 6/14/2016.
 */
public class RecycleritemAdapter extends RecyclerView.Adapter<RecycleritemAdapter.ViewHolder> {
    public String[] dataarray;
    Context context;
    public RecycleritemAdapter(Context context,String[]dataArray)
    {
        this.context=context;
        dataarray=dataArray;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView= (TextView)itemView.findViewById(R.id.text);
            textView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int a=getAdapterPosition();
            a++;
            Toast.makeText(context, "item is   "+a, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(dataarray[position]);

    }

    @Override
    public int getItemCount() {
        return dataarray.length;
    }


}
