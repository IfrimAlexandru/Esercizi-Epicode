package it.nextdevs.PraticaS2G2U2Backend.service;

import it.nextdevs.PraticaS2G2U2Backend.exception.AutoreNonTrovatoException;
import it.nextdevs.PraticaS2G2U2Backend.model.Autore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {

    private List<Autore> autori = new ArrayList<Autore>();

    public Optional<Autore> getAutoreById(int id) {
        return autori.stream().filter(autore -> autore.getId() == id).findFirst();
    }

    public List<Autore> getAllAutori() {
        return autori;
    }

    public String saveAutore(Autore autore) {
        autori.add(autore);
        return "Autore salvato con successo, id: " + autore.getId();
    }

    public Autore updateAutore(int id, Autore autoreUpd) throws AutoreNonTrovatoException {
        Optional<Autore> autoreOptional = getAutoreById(id);
        if (autoreOptional.isPresent()) {
            Autore autore = autoreOptional.get();
            autore.setNome(autoreUpd.getNome());
            autore.setCognome(autoreUpd.getCognome());
            return autore;
        } else {
        throw new AutoreNonTrovatoException("Autore non trovato");
        }
    }

    public String deleteAutore(int id) throws AutoreNonTrovatoException {
        Optional<Autore> autoreOpt = getAutoreById(id);
        if (autoreOpt.isPresent()) {
            autori.remove(autoreOpt.get());
            return "Autore eliminato";
        } else {
            throw new AutoreNonTrovatoException("Autore non trovato");
        }
    }
}
