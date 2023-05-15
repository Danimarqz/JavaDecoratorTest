package com.montecastelo.telefono;

public class Notificador implements Observador{

    private Telefono telefono;
    //Poder llamar a notificador
    public Notificador(Telefono telefono){
       this.telefono=telefono;
    }

    //Metodo que, cada vez que el observador es notificado, ejecuta la accion
    @Override
    public void update(int digito) {
        //Según la cantidad de digitos puesta en main, imprime el array entero cuando su tamaño es igual al numero de digitos
        if(telefono.getDigitos().size() == Main.NUMERO_DIGITOS){
            imprimirTodo();
        }
    }
    //Metodo para imprimir el array entero
    public void imprimirTodo(){
        System.out.print("Marcando ");
        for (int i: telefono.getDigitos()) {
            System.out.print(i);
        }
        System.out.println("...");
    }
}
