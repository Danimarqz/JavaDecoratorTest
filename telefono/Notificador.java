package com.montecastelo.telefono;

public class Notificador implements Observador{

    private Pantalla pantalla;
    public Notificador(Pantalla pantalla){
       this.pantalla=pantalla;
    }
    @Override
    public void update(int digito) {

    }
    public void imprimirTodo(){
        System.out.print("Marcando ");
        for (int i: pantalla.getTelefono().getDigitos()) {
            System.out.print(i);
        }
        System.out.println("...");
    }
}
