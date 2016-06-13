package com.gaia.app.smartwarehouse;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gaia.app.smartwarehouse.adapters.ItemAdapter;

/**
 * Created by anant on 13/06/16.
 */

public class ItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.itemgrid);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(layoutManager);
        ItemAdapter itemAdapter = new ItemAdapter();
        recyclerView.setAdapter( itemAdapter);

    }


}
