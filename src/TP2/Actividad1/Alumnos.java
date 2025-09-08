package TP2.Actividad1;

public class Alumnos {
    private String nombre;
    private int nota;

    public Alumnos(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota ;
    }
}
