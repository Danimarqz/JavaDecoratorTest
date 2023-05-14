package com.montecastelo.pasteleria;

public class Main {
    public static void main(String[] args) {
        // Create the order
        Pedido pedido = new Pedido();
        pedido.addPastel(new PastelVainilla());
        pedido.addPastel(new PastelChocolate());

        // Print the order
        pedido.printPedido();
    }
}
