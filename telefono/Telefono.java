package com.montecastelo.telefono;

import java.util.ArrayList;
import java.util.List;

/**
 * Almacena un número de teléfono, dígito a dígito
 */
public class Telefono{
    private List<Integer> digitos = new ArrayList<>();
    //Array de observadores
    private List<Observador> obv = new ArrayList<>();
    public void addObv(Observador observador){
        obv.add(observador);
    }
    public void delObv(Observador observador){
        obv.remove(observador);
    }

    public void addDigito(int nuevoDigito) {
        digitos.add(nuevoDigito);
        //Añadido al método para que cada vez que se ejecuta updatee al observer
        notificarObservadores(nuevoDigito);
    }

    public List<Integer> getDigitos() {
        return digitos;
    }
    //Metodo que recorre todos los observadores e imprime el digito cada vez que se añade un digito
    private void notificarObservadores(int digito){
        for (Observador observador: obv){
            observador.update(digito);
        }
    }
}
