package EJPractico;

import lombok.*;

@Getter
@Setter
public class ProductoDTO {
    private int codigo;
    private String nombre;
    private int precio;

    public ProductoDTO(String nombre, int codigo, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public ProductoDTO() {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
