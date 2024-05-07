package nextDevs.Dao;

import nextDevs.Entity.ProdottoCatalogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ProdottoDAO {

    private EntityManager em;

    public ProdottoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(ProdottoCatalogo prodottoCatalogo){
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(prodottoCatalogo);
        et.commit();
    }

    public ProdottoCatalogo getByIsbn(String isbn){
        return em.find(ProdottoCatalogo.class,isbn);

    }


    public void delete(ProdottoCatalogo prodottoCatalogo) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(prodottoCatalogo);
        et.commit();
    }

    public void update(ProdottoCatalogo prodottoCatalogo) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(prodottoCatalogo);
        et.commit();
    }

    public List<ProdottoCatalogo>findByYear(Integer anno){
        return em.createQuery("SELECT ctg FROM ProdottoCatalogo ctg WHERE annoPubblicazione= :anno ", ProdottoCatalogo.class)
                .setParameter("anno",anno)
                .getResultList();
    }

    public List<ProdottoCatalogo>findByTitle(String titolo){
        return em.createQuery("SELECT ctg FROM ProdottoCatalogo ctg WHERE titolo LIKE :titolo", ProdottoCatalogo.class)
                .setParameter("titolo", "%" + titolo + "%")
                .getResultList();
    }

    public List<ProdottoCatalogo> findByAuthor(String author){
        return em.createQuery("SELECT ctg FROM ProdottoCatalogo ctg WHERE autore LIKE :autore ", ProdottoCatalogo.class)
                .setParameter("autore","%" + author + "%")
                .getResultList();
    }
}
