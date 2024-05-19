package it.nextdevs.EsercizioS1G5.services;

import it.nextdevs.EsercizioS1G5.bean.Postazione;
import it.nextdevs.EsercizioS1G5.bean.Prenotazione;
import it.nextdevs.EsercizioS1G5.bean.Utente;
import it.nextdevs.EsercizioS1G5.enumerators.TipoPostazione;
import it.nextdevs.EsercizioS1G5.repositories.PostazioneRepository;
import it.nextdevs.EsercizioS1G5.repositories.PrenotazioneRepository;
import it.nextdevs.EsercizioS1G5.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    public List<Postazione> cercaPostazioni(TipoPostazione tipo, String citta) {
        return postazioneRepository.findByTipoAndCitta(tipo, citta);
    }
@Transactional
    public Prenotazione prenotaPostazione(Utente utente, Postazione postazione, LocalDate data) {
        if (isPostazioneLibera(postazione, data) && !hasUserBookingOnDate(utente, data)) {
            Prenotazione prenotazione = new Prenotazione();
            prenotazione.setUtente(utente);
            prenotazione.setPostazione(postazione);
            prenotazione.setData(data);
            return prenotazioneRepository.save(prenotazione);
        }
        return null;
    }
    private boolean isPostazioneLibera(Postazione postazione, LocalDate data) {
        return prenotazioneRepository.findByDataAndPostazione_Id(data, postazione.getId()).isEmpty();
    }

    private boolean hasUserBookingOnDate(Utente utente, LocalDate data) {
        return !prenotazioneRepository.findByUtenteAndData(utente, data).isEmpty();
    }


}

