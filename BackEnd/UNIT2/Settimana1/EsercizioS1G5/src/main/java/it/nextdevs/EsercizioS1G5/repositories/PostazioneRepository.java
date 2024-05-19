package it.nextdevs.EsercizioS1G5.repositories;

import it.nextdevs.EsercizioS1G5.bean.Postazione;
import it.nextdevs.EsercizioS1G5.enumerators.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Integer> {

    @Query("SELECT p FROM Postazione p WHERE p.tipoPostazione = :tipoPostazione AND p.edificio.citta = :citta")
    List<Postazione> findByTipoAndCitta(@Param("tipoPostazione") TipoPostazione tipoPostazione, @Param("citta") String citta);
}

