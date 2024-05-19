package it.nextdevs.EsercizioS1G5.services;

import it.nextdevs.EsercizioS1G5.bean.Postazione;
import it.nextdevs.EsercizioS1G5.bean.Utente;
import it.nextdevs.EsercizioS1G5.repositories.PostazioneRepository;
import it.nextdevs.EsercizioS1G5.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;
    public void inserisciUtente(Utente utente) {
        utenteRepository.save(utente);
    }

    public Utente getUtente(String username){
        return utenteRepository.findById(username).get();
    }

    public List<Utente> getUtente(){
        return utenteRepository.findAll();
    }


    public void cancellaUtente(String username){
        utenteRepository.deleteById(username);

    }
}
