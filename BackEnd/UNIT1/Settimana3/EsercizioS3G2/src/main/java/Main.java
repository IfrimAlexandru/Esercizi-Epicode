import nextdevs.dao.EventoDAO;
import nextdevs.entity.Evento;
import nextdevs.entity.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EsercizioS3G2_jpa");
        EntityManager em = emf.createEntityManager();
        EventoDAO dao = new EventoDAO(em);

        Evento e1 = new Evento();

        e1.setDescrizione("Concerto");
        e1.setTipoEvento(TipoEvento.PRIVATO);
        e1.setDataEvento(LocalDate.of(2024,6,14));
        e1.setNumeroMassimoPartecipanti(10000);
        e1.setTitolo("Dancing in the rain");

        //dao.save(e1);

        Evento e2 = new Evento();

        e2.setDescrizione("Compleanno Alexandru");
        e2.setTipoEvento(TipoEvento.PUBBLICO);
        e2.setDataEvento(LocalDate.of(2024,5,16));
        e2.setNumeroMassimoPartecipanti(10);
        e2.setTitolo("Festa di compleanno");

        //dao.save(e2);

        dao.delete(e1);
        dao.delete(e2);

        System.out.println(e2);



    }
}
