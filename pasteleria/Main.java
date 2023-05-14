package com.montecastelo.pasteleria;

public class Main {
    public static void main(String[] args) {
        // Create the order
        Pedido pedido = new Pedido();
        pedido.addPastel(new PastelChocolate());
        pedido.addPastel(new Frase(new PastelVainilla(),"”¡básico!”"));
        pedido.addPastel(new Frase(new Fideos(new PastelVainilla()),"”¡sofisticado!”"));
        pedido.addPastel(new Frase(new Frase(new Fideos(new Fideos(new Multicapa(new PastelFresa()))),"”el doble de”"),"”todo”"));

        // Print the order
        pedido.printPedido();
    }
}