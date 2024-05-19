package it.epicode.EsercizioS1G4.repository;

import it.epicode.EsercizioS1G4.bean.Pizza;
import it.epicode.EsercizioS1G4.bean.VoceDiMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VoceDiMenuRepository extends JpaRepository <VoceDiMenu, Integer> {

    public List<Pizza> findByPrezzoLessThan(double prezzo);

    @Query("select count(p) from Pizza p")
    public long countPizze();

}
