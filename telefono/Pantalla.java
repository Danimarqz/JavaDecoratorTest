package com.montecastelo.telefono;

/**
 * Imprime cosas en la pantalla cuando es necesario
 * Imprimiendo en la pantalla:
 * System.out.println("hola");
 */
public class Pantalla implements Observador{
    public Telefono getTelefono() {
        return telefono;
    }

    private final Telefono telefono;
    //Llamar a Pantalla sin observador
    public Pantalla(Telefono telefono){
        this.telefono = telefono;
    }
    //Llamar a Pantalla CON observador

    @Override
    public void update(int digito) {
        System.out.println(digito);
    }
}
