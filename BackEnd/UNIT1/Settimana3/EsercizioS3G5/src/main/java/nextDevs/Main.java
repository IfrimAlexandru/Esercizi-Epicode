package nextDevs;

import nextDevs.Dao.*;
import nextDevs.Entity.*;
import nextDevs.Enums.Periodicita;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
        EntityManager em = emf.createEntityManager();

        LibriDAO libroDao = new LibriDAO(em);
        ProdottoDAO prodottoDAO = new ProdottoDAO(em);
        RivisteDAO rivistaDao = new RivisteDAO(em);
        UtenteDAO utenteDao = new UtenteDAO(em);
        PrestitoDAO prestitoDao = new PrestitoDAO(em);


        System.out.println();
        System.out.println("--------Aggiunta libri al catalogo--------");
        System.out.println();
        Libri l1 = new Libri();
        l1.setCodiceISBN("La00001");
        l1.setTitolo("Guerra e Pace");
        l1.setAnnoPubblicazione(1867);
        l1.setNumeroPagine(557);
        l1.setAutore("Lev Tolstoj");
        l1.setGenere("Romanzo storico");
        try {
            libroDao.save(l1);
            System.out.println("Libro salvato con successo");
        } catch (Exception e) {
            System.err.println("Libro duplicato");
        }


        Libri l2 = new Libri();
        l2.setCodiceISBN("La00002");
        l2.setTitolo("Il ritratto di Dorian Gray");
        l2.setAnnoPubblicazione(1890);
        l2.setNumeroPagine(240);
        l2.setAutore("Oscar Wilde");
        l2.setGenere("Narrativa filosofica");
        try {
            libroDao.save(l2);
            System.out.println("Libro salvato con successo");
        } catch (Exception e) {
            System.err.println("Libro duplicato");
        }

        Libri l3 = new Libri();
        l3.setCodiceISBN("La00003");
        l3.setTitolo("Il conte di Montecristo");
        l3.setAnnoPubblicazione(1884);
        l3.setNumeroPagine(336);
        l3.setAutore("Alexandre Dumas");
        l3.setGenere("Romanzo");
        try {
            libroDao.save(l3);
            System.out.println("Libro salvato con successo");
        } catch (Exception e) {
            System.err.println("Libro duplicato");
        }

        System.out.println();
        System.out.println("--------Aggiunta riviste al catalogo--------");
        System.out.println();
        Riviste r1 = new Riviste();
        r1.setCodiceISBN("Ra00001");
        r1.setTitolo("Forbes");
        r1.setNumeroPagine(50);
        r1.setPeriodicita(Periodicita.MENSILE);
        r1.setAnnoPubblicazione(2014);
        try {
            rivistaDao.save(r1);
            System.out.println("Rivista salvato con successo");
        } catch (Exception e) {
            System.err.println("Rivista duplicato");
        }

        Riviste r2 = new Riviste();
        r2.setCodiceISBN("Ra00002");
        r2.setTitolo("National Geographic Magazine");
        r2.setNumeroPagine(30);
        r2.setPeriodicita(Periodicita.SETTIMANALE);
        r2.setAnnoPubblicazione(2013);
        try {
            rivistaDao.save(r2);
            System.out.println("Rivista salvato con successo");
        } catch (Exception e) {
            System.err.println("Rivista duplicato");
        }

        Riviste r3 = new Riviste();
        r3.setCodiceISBN("Ra00003");
        r3.setTitolo("Focus");
        r3.setNumeroPagine(25);
        r3.setPeriodicita(Periodicita.ANNUALE);
        r3.setAnnoPubblicazione(2012);
        try {
            rivistaDao.save(r3);
            System.out.println("Rivista salvato con successo");
        } catch (Exception e) {
            System.err.println("Rivista duplicato");
        }

        System.out.println();
        System.out.println("--------Rimozione di un elemento del catalogo dato un codice ISBN--------");
        System.out.println();
        try {
            ProdottoCatalogo prodottoCatalogo = prodottoDAO.getByIsbn("Ra00002");
            if (prodottoCatalogo != null) {
                prodottoDAO.delete(prodottoCatalogo);
                System.out.println("Prodotto eliminato");
            } else {
                throw new RuntimeException("Prodotto inesistente");
            }
        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }


            ProdottoCatalogo prodottoCatalogo = prodottoDAO.getByIsbn("5435");
            if (prodottoCatalogo != null) {
                prodottoDAO.delete(prodottoCatalogo);
                System.out.println("Prodotto eliminato");
            } else {
                System.out.println("********Prodotto inesistente********");
            }


        System.out.println();
        System.out.println("--------Ricerca per ISBN--------");
        System.out.println();
        ProdottoCatalogo findCatalogo = prodottoDAO.getByIsbn("La00002");
        System.out.println(findCatalogo);

        System.out.println();
        System.out.println("--------Ricerca per anno pubblicazione--------");
        System.out.println();
        List<ProdottoCatalogo> cataloghiByYear = prodottoDAO.findByYear(1890);
        cataloghiByYear.forEach(System.out::println);

        System.out.println();
        System.out.println("--------Ricerca per autore--------");
        System.out.println();
        List<ProdottoCatalogo> catalogoByAutore = prodottoDAO.findByAuthor("Alexandre Dumas");
        catalogoByAutore.forEach(System.out::println);

        System.out.println();
        System.out.println("--------Ricerca per titolo o parte di esso--------");
        System.out.println();
        List<ProdottoCatalogo> catalogoByTitle = prodottoDAO.findByTitle("risto");
        catalogoByTitle.forEach(System.out::println);

        System.out.println();
        System.out.println("--------Creazione utenti--------");
        System.out.println();
        Utente u1 = new Utente();
        u1.setNome("Alexandru");
        u1.setCognome("Ifrim");
        u1.setDataNascita(LocalDate.of(1998, 5, 16));
        try {
            utenteDao.save(u1);
            System.out.println("Utente salvato con successo");
        } catch (Exception e) {
            System.err.println("Utente duplicato");
        }

        Utente u2 = new Utente();
        u1.setNome("Roronoa");
        u1.setCognome("Zoro");
        u1.setDataNascita(LocalDate.of(1997, 8, 2));
        try {
            utenteDao.save(u2);
            System.out.println("Utente salvato con successo");
        } catch (Exception e) {
            System.err.println("Utente duplicato");
        }

        Utente u3 = new Utente();
        u3.setNome("Donquixote");
        u3.setCognome("Doflamingo");
        u3.setDataNascita(LocalDate.of(1998, 2, 14));
        try {
            utenteDao.save(u3);
            System.out.println("Utente salvato con successo");
        } catch (Exception e) {
            System.err.println("Utente duplicato");
        }

        System.out.println();
        System.out.println("--------Creazione prestiti--------");
        System.out.println();
        Prestito pr1 = new Prestito();
        pr1.setUtente(utenteDao.getById(1));
        pr1.setDataInizioPrestito(LocalDate.now());
        pr1.setProdottoCatalogo(prodottoDAO.getByIsbn("La00001"));
        try {
            prestitoDao.save(pr1);
            System.out.println("Prestito salvato con successo");
        } catch (Exception e) {
            System.err.println("Prestito duplicato");
        }

        Prestito pr2 = new Prestito();
        pr2.setUtente(utenteDao.getById(2));
        pr2.setDataInizioPrestito(LocalDate.now());
        pr2.setProdottoCatalogo(prodottoDAO.getByIsbn("La00002"));
        try {
            prestitoDao.save(pr2);
            System.out.println("Prestito salvato con successo");
        } catch (Exception e) {
            System.err.println("Prestito duplicato");
        }

        Prestito pr3 = new Prestito();
        pr3.setUtente(utenteDao.getById(3));
        pr3.setDataInizioPrestito(LocalDate.now());
        pr3.setProdottoCatalogo(prodottoDAO.getByIsbn("La00003"));
        try {
            prestitoDao.save(pr3);
            System.out.println("Prestito salvato con successo");
        } catch (Exception e) {
            System.err.println("Prestito duplicato");
        }

        System.out.println();
        System.out.println("--------Ricerca degli elementi attualmente in prestito dato un numero di tessera utente--------");
        System.out.println();
        List<ProdottoCatalogo> prodottiPrestito = prestitoDao.getProductFromId(1);
        prodottiPrestito.forEach(System.out::println);

        System.out.println();
        System.out.println("--------Ricerca di tutti i prestiti scaduti e non ancora restituiti----------");
        System.out.println();
        List<Prestito> prestitiNonRestituiti = prestitoDao.getPrestitoScadutoNonConsegnato();
        prestitiNonRestituiti.forEach(System.out::println);

    }
}