package it.nextdevs.EsercizioS1G5.repositories;

import it.nextdevs.EsercizioS1G5.bean.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, Integer> {
}