package com.gaia.app.smartwarehouse.resources;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.gaia.app.smartwarehouse.DetailActivity;
import com.gaia.app.smartwarehouse.R;

/**
 * Created by anant on 14/06/16.
 */

public class NavItemSelect extends AppCompatActivity  {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    MenuItem item;
    DrawerLayout drawer;
    Context context;

    public NavItemSelect(Context context, MenuItem item, DrawerLayout drawer) {
        this.item = item;
        this.drawer = drawer;
        this.context = context;

    }

    public void action() {

        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.detail) {
            Intent i = new Intent(context, DetailActivity.class);
            startActivity(i);
            finish();
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        drawer.closeDrawer(GravityCompat.START);
    }


}