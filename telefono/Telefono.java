package com.montecastelo.telefono;

import java.util.ArrayList;
import java.util.List;

/**
 * Almacena un número de teléfono, dígito a dígito
 */
public class Telefono{
    private List<Integer> digitos = new ArrayList<>();
    private List<Observador> obv = new ArrayList<>();
    public void addObv(Observador observador){
        obv.add(observador);
    }
    public void delObv(Observador observador){
        obv.remove(observador);
    }

    public void addDigito(int nuevoDigito) {
        digitos.add(nuevoDigito);
        notificarObservadores(nuevoDigito);
    }

    public List<Integer> getDigitos() {
        return digitos;
    }

    private void notificarObservadores(int digito){
        for (Observador observador: obv){
            observador.update(digito);
        }
    }
}
