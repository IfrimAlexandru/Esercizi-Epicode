package it.nextdevs.EsercizioS3G2.repository;

import it.nextdevs.EsercizioS3G2.model.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DipendenteRepository extends JpaRepository<Dipendente, Integer> {
public Optional<Dipendente> findByEmail(String email);
}
