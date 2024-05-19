package it.epicode.EsercizioS1G4.service;

import it.epicode.EsercizioS1G4.bean.Pizza;
import it.epicode.EsercizioS1G4.bean.VoceDiMenu;
import it.epicode.EsercizioS1G4.repository.VoceDiMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoceDiMenuService {
    @Autowired
    private VoceDiMenuRepository voceDiMenuRepository;

    public void salvaVoceDiMenu(VoceDiMenu voceDiMenu){
        voceDiMenuRepository.save(voceDiMenu);
    }

    public List<Pizza> getPizzaPriceLessThan(double prezzo){

        return voceDiMenuRepository.findByPrezzoLessThan(prezzo);
    }

    public long countPizze(){
        return voceDiMenuRepository.countPizze();
    }
}
