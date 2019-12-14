package com.example.rey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.rey.Adapters.ProducAdapter;
import com.example.rey.modelos.productos;

public class ListProducts extends AppCompatActivity {
            ListView Lis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_products);
        Lis = findViewById(R.id.listaproductos);

        ProducAdapter adapter = new ProducAdapter(this,
                productos.getData());

        Lis.setAdapter(adapter);
    }
}
