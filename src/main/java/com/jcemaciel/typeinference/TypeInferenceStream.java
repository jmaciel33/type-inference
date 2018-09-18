package com.jcemaciel.typeinference;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceStream {

    public static void main(String[] args) {
        var list = List.of("a","b","c", "e");
        imprimir(list);
    }

    public static void imprimir(List list){
        var stream = list.stream();
        stream.forEach(i -> System.out.println(i));

    }
}
