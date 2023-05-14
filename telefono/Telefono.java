package com.montecastelo.telefono;

import java.util.ArrayList;
import java.util.List;

/**
 * Almacena un número de teléfono, dígito a dígito
 */
public class Telefono {
    private List<Integer> digitos = new ArrayList<>();

    public void addDigito(int nuevoDigito) {
        digitos.add(nuevoDigito);
    }

    public List<Integer> getDigitos() {
        return digitos;
    }
}
