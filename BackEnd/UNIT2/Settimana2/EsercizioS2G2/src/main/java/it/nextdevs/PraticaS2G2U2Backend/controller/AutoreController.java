package it.nextdevs.PraticaS2G2U2Backend.controller;

import it.nextdevs.PraticaS2G2U2Backend.exception.AutoreNonTrovatoException;
import it.nextdevs.PraticaS2G2U2Backend.model.Autore;
import it.nextdevs.PraticaS2G2U2Backend.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @PostMapping("/api/autori")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveAutore(@RequestBody Autore autore){
        return autoreService.saveAutore(autore);
    }

    @GetMapping("/api/autori")
    public List<Autore> getAllAutori(){
        return autoreService.getAllAutori();
    }

    @GetMapping("/api/autori/{id}")
    public Autore getAutoreById(@PathVariable int id)throws AutoreNonTrovatoException{
        Optional<Autore> autoreOpt = autoreService.getAutoreById(id);
        if(autoreOpt.isPresent()){
            return autoreOpt.get();
        } else {
            throw new AutoreNonTrovatoException("Autore con id " + id + " non trovato");
        }
    }

    @PutMapping("/api/autori/{id}")
    public Autore updateAutore(@PathVariable int id, @RequestBody Autore autoreUpd) throws AutoreNonTrovatoException{
        return autoreService.updateAutore(id, autoreUpd);
    }

    @DeleteMapping("/api/autori/{id}")
    public String deleteAutore(@PathVariable int id) throws AutoreNonTrovatoException{
        return autoreService.deleteAutore(id);
    }
}
