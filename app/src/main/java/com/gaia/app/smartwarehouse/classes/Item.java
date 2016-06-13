package com.gaia.app.smartwarehouse.classes;

/**
 * Created by anant on 13/06/16.
 */

public class Item {
    String Itname;
    int size;

    public void setItname(String itname) {
        Itname = itname;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getItname() {

        return Itname;
    }

    public int getSize() {
        return size;
    }

    public Item(String itname, int size) {
        Itname = itname;
        this.size = size;
    }
}
