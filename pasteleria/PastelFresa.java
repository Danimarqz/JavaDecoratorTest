package com.montecastelo.pasteleria;

public class PastelFresa extends Pastel{

    private final int PRECIO = 20;

    public String getDescripcion() {
        return "Pastel de fresa";
    }
    @Override
    public int getPrecio(){
        return PRECIO;
    }
}
