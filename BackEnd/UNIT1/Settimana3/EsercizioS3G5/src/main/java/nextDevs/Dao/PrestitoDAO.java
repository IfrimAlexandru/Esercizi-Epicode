package nextDevs.Dao;


import nextDevs.Entity.Prestito;
import nextDevs.Entity.ProdottoCatalogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.util.List;

public class PrestitoDAO {
    private EntityManager em;

    public PrestitoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Prestito prestito) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(prestito);
        et.commit();
    }

    public Prestito getByIsbn(Integer id) {
        return em.find(Prestito.class, id);
    }

    public void delete(Prestito prestito) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(prestito);
        et.commit();
    }

    public void update(Prestito prestito) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(prestito);
        et.commit();
    }


    public List<ProdottoCatalogo> getProductFromId (Integer Id) {
        return em.createQuery("SELECT pr FROM Prestito pr", Prestito.class)
                .getResultStream()
                .map(Prestito::getProdottoCatalogo)
                .toList();
    }

    public List<Prestito> getPrestitoScadutoNonConsegnato() {
        LocalDate today = LocalDate.now();
        return em.createQuery("SELECT pr FROM Prestito pr WHERE pr.dataRestituzioneEffettiva IS NULL OR " +
                        "pr.dataRestituzionePrevista < :today", Prestito.class)
                .setParameter("today", today)
                .getResultList();
    }
}