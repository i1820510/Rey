package com.example.rey.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rey.R;
import com.example.rey.modelos.pedidos;

import java.util.ArrayList;

public class adaptador_pedido extends BaseAdapter {

    private Context context;

    private ArrayList<pedidos> listaProductos;

    public adaptador_pedido(Context context, ArrayList<pedidos> _listaProductos) {
        this.context = context;
        this.listaProductos = _listaProductos;
    }

    @Override
    public int getCount() {
        return listaProductos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaProductos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        pedidos prod = (pedidos) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.item_producto, null);
        ImageView a_foto = (ImageView) convertView.findViewById(R.id.id_imgFoto);
        TextView b_titulo = (TextView) convertView.findViewById(R.id.tituloProducto);
        TextView c_precio = (TextView) convertView.findViewById(R.id.precioProducto);

        a_foto.setImageResource(prod.getImgFoto());
        b_titulo.setText(prod.getTitulo());
        c_precio.setText(prod.getPrecio());


        return convertView;


    }
}
