package TP1.Actividad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("primero A");
        Curso c2 = new Curso("Segundo B");

        Estudiante e1 = new Estudiante("Ana", 20, "Ingeniería");
        Estudiante e2 = new Estudiante("Luis", 22, "Medicina");
        Estudiante e3 = new Estudiante("Carla", 19, "Derecho");
        Estudiante e4 = new Estudiante("juan", 27, "Ingeniería");
        Estudiante e5 = new Estudiante("pedro", 28, "Medicina");
        Estudiante e6 = new Estudiante("toto", 99, "Derecho");

        c1.agregarEstudiante(e1);
        c1.agregarEstudiante(e3);
        c1.agregarEstudiante(e5);
        c2.agregarEstudiante(e2);
        c2.agregarEstudiante(e4);
        c2.agregarEstudiante(e6);
        System.out.println("-----------Primer Curso -----------");
        System.out.println(c1);
        System.out.println("-----------Segundo Curso -----------");
        System.out.println(c2);
    }
}

