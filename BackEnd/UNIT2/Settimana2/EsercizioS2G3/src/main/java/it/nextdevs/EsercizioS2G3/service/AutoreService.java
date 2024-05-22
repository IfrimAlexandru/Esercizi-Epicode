package it.nextdevs.EsercizioS2G3.service;


import it.nextdevs.EsercizioS2G3.DTO.AutoreDTO;
import it.nextdevs.EsercizioS2G3.exception.AutoreNonTrovatoException;
import it.nextdevs.EsercizioS2G3.model.Autore;
import it.nextdevs.EsercizioS2G3.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;



    public String saveAutore(AutoreDTO autoreDTO) {
        Autore autore = new Autore();
        autore.setNome(autoreDTO.getNome());
        autore.setCognome(autoreDTO.getCognome());
        autore.setEmail(autoreDTO.getEmail());
        autore.setDataDiNascita(autoreDTO.getDataDiNascita());

        return "Autore salvato con successo, id: " + autore.getId();
    }

    public Optional<Autore> getAutoreById(int id) {
        return autoreRepository.findById(id);
    }

    public Page<Autore> getAllAutori(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return autoreRepository.findAll(pageable);

    }

    public Autore updateAutore(int id, AutoreDTO autoreDTO) throws AutoreNonTrovatoException {
        Optional<Autore> autoreOptional = getAutoreById(id);
        if (autoreOptional.isPresent()) {
            Autore autore = autoreOptional.get();
            autore.setDataDiNascita(autoreDTO.getDataDiNascita());
            autore.setNome(autoreDTO.getNome());
            autore.setCognome(autoreDTO.getCognome());
            autore.setEmail(autoreDTO.getEmail());
            return autoreRepository.save(autore);
        } else {
        throw new AutoreNonTrovatoException("Autore con id: " + id + " non trovato");
        }
    }

    public String deleteAutore(int id) throws AutoreNonTrovatoException {
        Optional<Autore> autoreOpt = getAutoreById(id);
        if (autoreOpt.isPresent()) {
            autoreRepository.delete(autoreOpt.get());
            return "Autore con id: " +id +" eliminato";
        } else {
            throw new AutoreNonTrovatoException("Autore non trovato");
        }
    }
}
