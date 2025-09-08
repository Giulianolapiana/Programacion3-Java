package Actividad2;

import Actividad1.Persona;

public class Main {
    public static void main(String[] args) {
        Usuario u = Usuario.builder()
                .id("001")
                .nombre("jose")
                .email("jose@gmail.com")
                .build();
        System.out.println(u);
        Usuario u2 = Usuario.builder()
                .id("003")
                .nombre("juan")
                .email("hhjj@gg")
                .build();
        System.out.println(u2);
    }
}
