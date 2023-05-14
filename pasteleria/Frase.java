package com.montecastelo.pasteleria;

public class Frase extends PastelDecorator{
    private Pastel pastel;
    private String frase;
    public String getFrase() {
        return frase;
    }

    Frase(Pastel pastel, String f){
        this.pastel=pastel;
        this.frase=f;
    }
    private String decoratedWithFrase (String frase){
        return " con la frase " + frase;
    }
    public String getDescripcion() {
        return pastel.getDescripcion()+decoratedWithFrase(getFrase());
    }
    @Override
    public int getPrecio(){
        return pastel.getPrecio();
    }
}
