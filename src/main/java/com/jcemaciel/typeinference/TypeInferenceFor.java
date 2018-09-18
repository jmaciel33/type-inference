package com.jcemaciel.typeinference;

import java.util.List;

public class TypeInferenceFor {

    public static void main(String[] args) {
        var lista = List.of("a","b","c", "e");
        imprimir(lista);
    }

    public static void imprimir(List lista){
        for (var letra : lista) {
            System.out.println(letra);
        }

    }
}
