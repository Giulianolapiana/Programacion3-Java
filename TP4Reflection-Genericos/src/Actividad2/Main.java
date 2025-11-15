package Actividad2;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Persona p = new Persona("juan",8);
        Class<?> clase = p.getClass();
        //1
        Constructor<?>[] constructors = clase.getConstructors();
        System.out.println("\nConstructores: ");
        for (Constructor<?> constructor : constructors) {
            System.out.println(" " + constructor.getName());
        }
        //2
        Constructor<?> cons = clase.getConstructor(String.class, int.class);
        Object persona = cons.newInstance("Ana", 25);
        System.out.println(p);
        System.out.println(persona);
        //3
        Field nameField = clase.getDeclaredField("nombre");
        nameField.setAccessible(true);
        nameField.set(p, "Jane");
        System.out.println(p);
        nameField.set(persona, "Janamontana");
        System.out.println(persona);
        //4
        Method mostrarMethod = clase.getDeclaredMethod("mostrar");
        mostrarMethod.invoke(p);
        //5
        System.out.println(p.saludar());
        Method saludarMethod = clase.getDeclaredMethod("saludar");
        saludarMethod.setAccessible(true);
        Object saludarPublic = saludarMethod.invoke(p);
        System.out.println(saludarPublic);

    }
}
