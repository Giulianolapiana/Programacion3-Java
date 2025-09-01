package EJPractico;

import java.util.Objects;

public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
    private String autor;

    public Producto(int codigo, String nombre, int precio, String autor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.autor = autor;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo && precio == producto.precio && Objects.equals(nombre, producto.nombre) && Objects.equals(autor, producto.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, precio, autor);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", autor='" + autor + '\'' +
                '}';
    }
}
