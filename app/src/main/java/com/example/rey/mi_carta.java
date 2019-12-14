package com.example.rey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.rey.adaptadores.adaptador_pedido;
import com.example.rey.modelos.pedidos;

import java.util.ArrayList;

public class mi_carta extends AppCompatActivity {

    private ListView listaProd;
    private adaptador_pedido adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_carta);

        listaProd = (ListView) findViewById(R.id.lista_productos);
        adaptador = new adaptador_pedido(this, getArrayItems());
        listaProd.setAdapter(adaptador);
    }


    private ArrayList<pedidos> getArrayItems(){

        ArrayList<pedidos> listaprod = new ArrayList<pedidos>();
        listaprod.add(new pedidos(R.drawable.producto1, "Pollo al limón","S/. 18.00"));
        listaprod.add(new pedidos(R.drawable.producto1, "Pollo al limón","S/. 18.00"));
        listaprod.add(new pedidos(R.drawable.producto1, "Pollo al limón","S/. 18.00"));
        listaprod.add(new pedidos(R.drawable.producto1, "Pollo al limón","S/. 18.00"));
        listaprod.add(new pedidos(R.drawable.producto1, "Pollo al limón","S/. 18.00"));
        listaprod.add(new pedidos(R.drawable.producto1, "Pollo al limón","S/. 18.00"));

        return listaprod;
    }
}
