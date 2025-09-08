package Actividad1;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("juan",8);
        Persona p2 = new Persona();
        p2.setEdad(25);
        p2.setNombre("julian");

        System.out.println(p);
        System.out.println("edad: "+ p2.getEdad()+ " nombre: "+ p2.getNombre());
    }
}
