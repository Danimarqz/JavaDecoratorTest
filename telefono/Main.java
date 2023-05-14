package com.montecastelo.telefono;

public class Main {
    public static void main(String[] args) {
        final int NUMERO_DIGITOS = 10;

        Telefono telefono = new Telefono();
        Pantalla pantalla = new Pantalla(telefono);
        Teclado teclado = new Teclado(telefono);

        teclado.simularMarcado(NUMERO_DIGITOS);
    }
}
