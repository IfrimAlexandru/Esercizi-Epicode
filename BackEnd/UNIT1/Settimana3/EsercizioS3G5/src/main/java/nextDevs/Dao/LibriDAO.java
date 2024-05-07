package nextDevs.Dao;

import nextDevs.Entity.Libri;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class LibriDAO {
    private EntityManager em;

    public LibriDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Libri libri){
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(libri);
        et.commit();
    }

    public Libri getByIsbn(String isbn){
        return em.find(Libri.class,isbn);

    }


    public void delete(Libri evento) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(evento);
        et.commit();
    }

    public void update(Libri libri) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(libri);
        et.commit();
    }

    public List<Libri> findAll() {
        return em.createQuery("SELECT l FROM Libri l", Libri.class).getResultList();
    }
}
