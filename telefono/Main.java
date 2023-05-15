package com.montecastelo.telefono;

public class Main {
    final  static int NUMERO_DIGITOS = 10;
    public static void main(String[] args) {



        Telefono telefono = new Telefono();
        Pantalla pantalla = new Pantalla(telefono);
        Teclado teclado = new Teclado(telefono);
        Notificador notificador = new Notificador(telefono);
        //Se añade observador de cada pulsación
        telefono.addObv(pantalla);
        //Se añade observador del array entero
        telefono.addObv(notificador);

        teclado.simularMarcado(NUMERO_DIGITOS);

    }
}
