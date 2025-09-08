package Actividad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductoDTO> listaProductos = new ArrayList<>();
        Producto p1 = new Producto("001","juan",11,"jjlopez");
        Producto p2 = new Producto("002","nico",22,"jjz");
        Producto p3 = new Producto("003","jh",33,"jjpez");
        Producto p4 = new Producto("004","jose",44,"lopez");

        ProductoDTO p1dto = new ProductoDTO(p1.getCodigo(),p1.getNombre(), p1.getPrecio());
        ProductoDTO p2dto = new ProductoDTO(p2.getCodigo(),p2.getNombre(), p2.getPrecio());
        ProductoDTO p3dto = new ProductoDTO(p3.getCodigo(),p3.getNombre(), p3.getPrecio());
        ProductoDTO p4dto = new ProductoDTO(p4.getCodigo(),p4.getNombre(), p4.getPrecio());

        listaProductos.add(p1dto);
        listaProductos.add(p2dto);
        listaProductos.add(p3dto);
        listaProductos.add(p4dto);

        System.out.println("lista Dto");
        for (ProductoDTO l : listaProductos){
            System.out.println(l);
        }
    }
}
