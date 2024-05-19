package it.nextdevs.EsercizioS1G5.repositories;

import it.nextdevs.EsercizioS1G5.bean.Prenotazione;
import it.nextdevs.EsercizioS1G5.bean.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer> {
    List<Prenotazione> findByDataAndPostazione_Id(LocalDate data, Integer postazioneId);
    List<Prenotazione> findByUtenteAndData(Utente utente, LocalDate data);
}
