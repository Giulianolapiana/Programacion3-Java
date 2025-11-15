package Actividad4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.setContenido("Hola, Genéricos!");
        System.out.println(cajaTexto.getContenido());

        Caja<Integer> cajaNumeros = new Caja<>();
        cajaNumeros.setContenido(123);
        System.out.println(cajaNumeros.getContenido());

        List lista = new ArrayList<>();
    }
}
