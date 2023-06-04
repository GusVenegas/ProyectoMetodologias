package Infrastucture.OutputAdapter;

import Domain.Cliente;
import Infrastucture.OutputPort.IClientRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ClientRepository  {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SistemaVentasRestaurante");
    protected EntityManager em = emf.createEntityManager();



    public void create(Cliente entity) {
        System.out.println("se ejecuta al guardar ");
        em.getTransaction().begin();
        try {
            em.persist(entity);
            em.getTransaction().commit();
            System.out.println("se ha guardado");
        }catch(Exception e) {
            System.out.println("Fallo en Create de JPA");
            if(em.getTransaction().isActive())
                em.getTransaction().rollback();
        }

    }
}
