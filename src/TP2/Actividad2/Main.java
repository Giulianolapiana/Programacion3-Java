package TP2.Actividad2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        Producto p1 = new Producto("1", "Teclado");
        Producto p2 = new Producto("2", "Mouse");
        Producto p3 = new Producto("1", "Teclado Gamer");
        Producto p4 = new Producto("3", "Monitor");

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);

        for (Producto producto: productos){
            System.out.println(producto);
        }
    }
}
