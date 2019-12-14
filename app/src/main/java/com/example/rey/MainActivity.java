package com.example.rey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View V){
        Intent intento = new Intent(this, ListProducts.class);
        startActivity(intento);
    }

    public void onClick1(View V){
        Intent intento = new Intent(this, Login.class);
        startActivity(intento);
    }

    public void onClick2(View V){
        Intent intento = new Intent(this, mi_carta.class);
        startActivity(intento);
    }
}
