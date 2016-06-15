package com.gaia.app.smartwarehouse.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gaia.app.smartwarehouse.ItemActivity;
import com.gaia.app.smartwarehouse.R;

/**
 * Created by praveen_gadi on 6/14/2016.
 */
public class RecyclerRowAdapter extends RecyclerView.Adapter<RecyclerRowAdapter.ItemRowHolder> {
    public LinearLayoutManager layoutManager;
    public Context context;
    public String[] dataarray,itemarray;

    public RecyclerRowAdapter(Context context,String[] dataArray,String[] itemarray)
    {

        this.context=context;
        dataarray=dataArray;
        this.itemarray=itemarray;
    }

    @Override
    public ItemRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist, null);
        ItemRowHolder mh = new ItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(ItemRowHolder holder, int position) {
        String category=dataarray[position];
        holder.textView.setText(dataarray[position]);
        RecycleritemAdapter recyclerAdapter=new RecycleritemAdapter(context,itemarray,category);
        holder.recycler_view_list.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        holder.recycler_view_list.setLayoutManager(layoutManager);
        holder.recycler_view_list.setAdapter(recyclerAdapter);
        holder.recycler_view_list.setNestedScrollingEnabled(true);

    }

    @Override
    public int getItemCount() {
        return dataarray.length;
    }

    public class ItemRowHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public RecyclerView recycler_view_list;
        public TextView textView;
        public Button button;
        public ItemRowHolder(View itemView) {
            super(itemView);
            recycler_view_list=(RecyclerView)itemView.findViewById(R.id.recycler_view_list);
            textView= (TextView)itemView.findViewById(R.id.textView);
            button=(Button)itemView.findViewById(R.id.buttonid);
            textView.setOnClickListener(this);
            button.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int a=getAdapterPosition();
            a++;
            String s="Category is   "+a;
            Toast.makeText(context,s, Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(context,ItemActivity.class);
            intent.putExtra("Category ",s);
            context.startActivity(intent);
        }

    }

}
