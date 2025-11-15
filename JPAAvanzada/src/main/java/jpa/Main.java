package jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MiPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");
        cliente.setEmail("juan@mail.com");

        em.persist(cliente);

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("✅ Cliente guardado en la base de datos!");
    }
}

