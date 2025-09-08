package TP2.Actividad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumnos> alumnos = new ArrayList<>();
        Alumnos a1 = new Alumnos("giuliano",8);
        Alumnos a2 = new Alumnos("marcelo",3);
        Alumnos a3 = new Alumnos("nico",6);
        Alumnos a4 = new Alumnos("gio",7);

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);

        for (Alumnos alumno: alumnos){
            System.out.println(alumno);
        }

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
    }
}
