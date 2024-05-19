package it.nextdevs.EsercizioS1G5.repositories;

import it.nextdevs.EsercizioS1G5.bean.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, String> {


}