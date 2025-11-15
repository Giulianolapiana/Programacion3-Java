package Actividad1;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("jose", 8, "Prog"),
                new Alumno("pepe", 6, "Mate"),
                new Alumno("carla", 9, "Prog"),
                new Alumno("pedro", 7, "Mate"),
                new Alumno("marcos", 10, "Mate")
        );

        //1
        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println( aprobados);

        // 2
        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0);
        System.out.println("Promedio general: " + promedio);

        //3
        Map<String, List<Alumno>> porCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println("Alumnos agrupados por curso: " + porCurso);

        List<Alumno> top3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3: " + top3);

    }
}
