package TP2.Actividad3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Curso> cursos = new HashMap<>();
        cursos.put("aula 1",new Curso("rafa","primero"));
        cursos.put("aula 2",new Curso("lana","segundo"));
        cursos.put("aula 3",new Curso("pepe","tercero"));
        cursos.put("aula 4",new Curso("juan","4to"));
        cursos.put("aula 5",new Curso("cito","5to"));

        System.out.println(cursos.get("aula 3"));

        for (Map.Entry<String,Curso> entry : cursos.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
