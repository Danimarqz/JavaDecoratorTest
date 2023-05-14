package com.montecastelo.pasteleria;

public class Fideos extends PastelDecorator{
    private Pastel pastel;
    Fideos(Pastel pastel){
        this.pastel=pastel;
    }
    private String decoratedWithFideos (){
        return " con fideos de azúcar";
    }
    public String getDescripcion() {
        return pastel.getDescripcion()+decoratedWithFideos();
    }
    @Override
    public int getPrecio(){
        return pastel.getPrecio()+2;
    }
}
