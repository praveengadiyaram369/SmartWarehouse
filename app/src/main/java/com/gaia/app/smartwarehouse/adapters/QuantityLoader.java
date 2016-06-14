package com.gaia.app.smartwarehouse.adapters;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by anant on 14/06/16.
 */

public class QuantityLoader {

    Context context;
    int spanCount;
    float weigth;

    public QuantityLoader(Context context, float weigth) {
        this.context = context;
        this.weigth = weigth;
    }

    void genrateColumn(int quantity){
        spanCount=4;

    }

    public GridLayoutManager returnManager(){
        genrateColumn(3);
        GridLayoutManager manager = new GridLayoutManager(context,spanCount, LinearLayoutManager.VERTICAL,true);
        return manager;
    }

    public RecyclerView.Adapter returnAdapter(){

        BoxAdapter box =new BoxAdapter();
        return box;
    }
}
