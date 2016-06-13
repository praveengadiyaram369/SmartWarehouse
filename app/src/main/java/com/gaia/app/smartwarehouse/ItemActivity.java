package com.gaia.app.smartwarehouse;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import com.gaia.app.smartwarehouse.adapters.ItemAdapter;
import com.gaia.app.smartwarehouse.classes.Item;

/**
 * Created by anant on 13/06/16.
 */

public class ItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        GridView gridView = (GridView) findViewById(R.id.itemgrid);
        ItemAdapter
        gridView.setAdapter();

    }


}
