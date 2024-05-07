package nextDevs.Dao;


import nextDevs.Entity.Riviste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class RivisteDAO {

    private EntityManager em;

    public RivisteDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Riviste riviste){
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(riviste);
        et.commit();
    }

    public Riviste getByIsbn(String isbn){
        return em.find(Riviste.class,isbn);

    }

    public void delete(Riviste riviste) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(riviste);
        et.commit();
    }

    public void update(Riviste riviste) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(riviste);
        et.commit();
    }

    public List<Riviste> findAll() {
        return em.createQuery("SELECT r FROM Riviste r", Riviste.class).getResultList();
    }
}
