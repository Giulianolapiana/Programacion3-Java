package Actividad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void imprimirLista(List<T> lista){
        for (T elemento: lista){
            System.out.println(elemento);
        }
    }
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(10);
        listaEnteros.add(20);
        listaEnteros.add(30);

        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Ana");
        listaCadenas.add("Luis");
        listaCadenas.add("Carla");

        System.out.println("Lista de Enteros:");
        imprimirLista(listaEnteros);

        System.out.println("\nLista de Cadenas:");
        imprimirLista(listaCadenas);
    }
}
