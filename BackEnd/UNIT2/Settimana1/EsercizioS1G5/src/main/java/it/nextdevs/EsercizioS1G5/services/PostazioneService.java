package it.nextdevs.EsercizioS1G5.services;


import it.nextdevs.EsercizioS1G5.bean.Postazione;
import it.nextdevs.EsercizioS1G5.enumerators.TipoPostazione;
import it.nextdevs.EsercizioS1G5.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;
    public void inserisciPostazione(Postazione postazione) {
        postazioneRepository.save(postazione);
    }

    public Postazione getPostazione(int id){
        return postazioneRepository.findById(id).get();
    }

    public List<Postazione> getPostazione(){
        return postazioneRepository.findAll();
    }


    public void cancellaPostazione(int id){
        postazioneRepository.deleteById(id);

    }

    public List<Postazione> getPostazioniByTipoAndCitta(TipoPostazione tipoPostazione, String citta) {
        return postazioneRepository.findByTipoAndCitta(tipoPostazione, citta);
    }
}
