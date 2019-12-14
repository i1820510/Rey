package com.example.rey.modelos;

import android.widget.TextView;

import java.util.ArrayList;

public class productos {
    public String Name;
    public String Image;
    public String Price;
    public String Quantity;

    public productos(String _Name, String _Image, String _Price, String _Quantity){
        this.Name = _Name;
        this.Image = _Image;
        this.Price = _Price;
        this.Quantity = _Quantity;
    }

    public static ArrayList<productos> getData() {
        ArrayList<productos> productos= new ArrayList<>();
        productos.add(new productos("pollo alo Rey","", "12.50", "1"));
        productos.add(new productos("Pollo ala parrilla","", "12.50", "1"));
        productos.add(new productos("Anticuchos","", "12.50", "1"));
        productos.add(new productos("Pitza","", "12.50", "1"));
        productos.add(new productos("Pollo a la plancha","", "12.50", "1"));
        productos.add(new productos("Pollo a la leña","", "12.50", "1"));
        return productos;
    }


}
