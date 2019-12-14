package com.example.rey.modelos;

public class pedidos {
    private int imgFoto;
    private String titulo;
    private String precio;


    public pedidos(int _imgFoto, String _titulo, String _precio){
        this.imgFoto = _imgFoto;
        this.titulo = _titulo;
        this.precio = _precio;
    }

    public int getImgFoto() {return imgFoto; }

    public String getTitulo() {return titulo; }

    public String getPrecio() {return precio; }


}
