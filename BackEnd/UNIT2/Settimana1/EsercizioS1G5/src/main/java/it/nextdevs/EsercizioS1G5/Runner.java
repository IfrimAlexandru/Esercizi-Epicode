package it.nextdevs.EsercizioS1G5;

import it.nextdevs.EsercizioS1G5.bean.Edificio;
import it.nextdevs.EsercizioS1G5.bean.Postazione;
import it.nextdevs.EsercizioS1G5.bean.Prenotazione;
import it.nextdevs.EsercizioS1G5.bean.Utente;
import it.nextdevs.EsercizioS1G5.enumerators.TipoPostazione;
import it.nextdevs.EsercizioS1G5.services.EdificioService;
import it.nextdevs.EsercizioS1G5.services.PostazioneService;
import it.nextdevs.EsercizioS1G5.services.PrenotazioneService;
import it.nextdevs.EsercizioS1G5.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@PropertySource("application.properties")
public class Runner implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private UtenteService utenteService;

   @Autowired
   private PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {
        // Creazione edifici
        Edificio edificio1 = new Edificio();
        edificio1.setNome("Edificio A");
        edificio1.setIndirizzo("Via Roma 1");
        edificio1.setCitta("Milano");
        edificioService.inserisciEdificio(edificio1);

        Edificio edificio2 = new Edificio();
        edificio2.setNome("Edificio B");
        edificio2.setIndirizzo("Via Milano 2");
        edificio2.setCitta("Roma");
        edificioService.inserisciEdificio(edificio2);

        // Creazione postazioni
        Postazione postazione1 = new Postazione();
        postazione1.setId(001);
        postazione1.setDescrizione("Postazione privata");
        postazione1.setTipoPostazione(TipoPostazione.PRIVATO);
        postazione1.setNumeroMaxPartecipanti(1);
        postazione1.setEdificio(edificio1);
        postazioneService.inserisciPostazione(postazione1);

        Postazione postazione2 = new Postazione();
        postazione2.setId(002);
        postazione2.setDescrizione("Sala riunioni");
        postazione2.setTipoPostazione(TipoPostazione.SALA_RIUNIONI);
        postazione2.setNumeroMaxPartecipanti(10);
        postazione2.setEdificio(edificio2);
        postazioneService.inserisciPostazione(postazione2);

        // Creazione utenti
        Utente utente1 = new Utente();
        utente1.setUsername("jdoe");
        utente1.setNomeCognome("John Doe");
        utente1.setMail("jdoe@example.com");
        utenteService.inserisciUtente(utente1);

        Utente utente2 = new Utente();
        utente2.setUsername("asmith");
        utente2.setNomeCognome("Anna Smith");
        utente2.setMail("asmith@example.com");
        utenteService.inserisciUtente(utente2);

        // Creazione prenotazioni
//        Prenotazione prenotazione1 = new Prenotazione();
//        prenotazione1.setPostazione(postazione1);
//        prenotazione1.setUtente(utente1);
//        prenotazione1.setData(LocalDate.now().plusDays(1));
//        prenotazioneRepository.save(prenotazione1);
//
//        Prenotazione prenotazione2 = new Prenotazione();
//        prenotazione2.setPostazione(postazione2);
//        prenotazione2.setUtente(utente2);
//        prenotazione2.setData(LocalDate.now().plusDays(2));
//        prenotazioneRepository.save(prenotazione2);

        Prenotazione prenotazione = prenotazioneService.prenotaPostazione(utente1, postazione1, LocalDate.now());

        if (prenotazione != null) {
            System.out.println("----------");
            System.out.println("Prenotazione avvenuta con successo:");
            System.out.println("Utente: " + prenotazione.getUtente().getNomeCognome());
            System.out.println("Postazione: " + prenotazione.getPostazione().getTipoPostazione());
            System.out.println("Data: " + prenotazione.getData());
            System.out.println("----------");
        } else {
            System.err.println("----------");
            System.err.println("Prenotazione fallita. Postazione già occupata o l'utente ha già una prenotazione per questa data.");
            System.err.println("----------");
        }

        List<Postazione> postazioni = postazioneService.getPostazioniByTipoAndCitta(TipoPostazione.PRIVATO, "Milano");

        if (postazioni.isEmpty()) {
            System.err.println("----------");
            System.err.println("Nessuna postazione trovata per il tipo specificato e la città.");
            System.err.println("----------");
        } else {
            postazioni.forEach(postazione -> {
                System.out.println("--------");
                System.out.println("Postazione ID: " + postazione.getId());
                System.out.println("Descrizione: " + postazione.getDescrizione());
                System.out.println("Tipo: " + postazione.getTipoPostazione());
                System.out.println("Città: " + postazione.getEdificio().getCitta());
                System.out.println("--------");
            });
        }


    }


}
