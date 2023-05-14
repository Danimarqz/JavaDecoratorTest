package com.montecastelo.pasteleria;

public class Multicapa extends PastelDecorator{
    private Pastel pastel;
    Multicapa(Pastel pastel){
        this.pastel=pastel;
    }
    private String decoratedWithMulticapa (){
        return " multicapa";
    }
    public String getDescripcion() {
        return pastel.getDescripcion()+decoratedWithMulticapa();
    }
    @Override
    public int getPrecio(){
        return pastel.getPrecio()+5;
    }
}
