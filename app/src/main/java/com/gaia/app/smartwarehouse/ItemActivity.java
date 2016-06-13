package com.gaia.app.smartwarehouse;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.GridLayout;
import android.widget.TextView;

/**
 * Created by anant on 13/06/16.
 */

public class ItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);


        GridLayout gridLayout = (GridLayout)findViewById(R.id.itemgrid);
        CardView cardView = (CardView)findViewById(R.id.card_view1);
        TextView textView= (TextView)findViewById(R.id.textView1);
        textView.setText("ITEM");
        gridLayout.addView(cardView);
    }
}
