package TP1.Actividad2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listaDeEstudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante e) {
        listaDeEstudiantes.add(e);
    }

    @Override
    public String toString() {
        String resultado = "Curso: " + nombre + "\nEstudiantes:\n";
        for (Estudiante e : listaDeEstudiantes) {
            resultado += " - " + e + "\n";
        }
        return resultado;
    }
}
