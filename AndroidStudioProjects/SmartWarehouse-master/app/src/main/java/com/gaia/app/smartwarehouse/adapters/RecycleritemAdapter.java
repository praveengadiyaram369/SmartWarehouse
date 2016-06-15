package com.gaia.app.smartwarehouse.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gaia.app.smartwarehouse.DetailActivity;
import com.gaia.app.smartwarehouse.MainActivity;
import com.gaia.app.smartwarehouse.R;

/**
 * Created by praveen_gadi on 6/14/2016.
 */
public class RecycleritemAdapter extends RecyclerView.Adapter<RecycleritemAdapter.ViewHolder> {
    public String[] dataarray;
    Context context;
    String category;
    public RecycleritemAdapter(Context context,String[]dataArray,String category)
    {
        this.context=context;
        dataarray=dataArray;
        this.category=category;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView textView;
        public ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView= (TextView)itemView.findViewById(R.id.text);
            imageView=(ImageView)itemView.findViewById(R.id.image);
            textView.setOnClickListener(this);
            imageView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int a=getAdapterPosition();
            a++;
            Toast.makeText(context,"item "+a+" from "+category, Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(context,DetailActivity.class);
            context.startActivity(intent);
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
