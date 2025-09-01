package TP1.Actividad4;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        Producto p1 = (new Producto(1,"coca cola",200));
        Producto p2 = (new Producto(2,"pepsi",250));
        Producto p3 = (new Producto(3,"7up",490));
        Producto p4 = (new Producto(2,"7up zero",490));

        if (!productos.contains(p1)) productos.add(p1);
        if (!productos.contains(p2)) productos.add(p2);
        if (!productos.contains(p3)) productos.add(p3);
        if (!productos.contains(p4)) productos.add(p4);

        System.out.println(productos);
    }
}
