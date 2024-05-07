package nextDevs.Dao;

import nextDevs.Entity.ProdottoCatalogo;
import nextDevs.Entity.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UtenteDAO {
    private EntityManager em;

    public UtenteDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Utente utente) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(utente);
        et.commit();
    }

    public Utente getById(Integer id) {
        return em.find(Utente.class, id);
    }

    public void delete(Utente utente) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(utente);
        et.commit();
    }

    public void update(ProdottoCatalogo prodottoCatalogo) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(prodottoCatalogo);
        et.commit();
    }
}