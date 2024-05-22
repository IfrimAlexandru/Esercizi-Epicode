package it.nextdevs.EsercizioS2G3.controller;


import it.nextdevs.EsercizioS2G3.DTO.AutoreDTO;
import it.nextdevs.EsercizioS2G3.exception.AutoreNonTrovatoException;
import it.nextdevs.EsercizioS2G3.model.Autore;
import it.nextdevs.EsercizioS2G3.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AutoreController {

    @Autowired
    private AutoreService autoreService;

    @PostMapping("/autori")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveAutore(@RequestBody AutoreDTO autoreDTO){
        return autoreService.saveAutore(autoreDTO);
    }

    @GetMapping("/autori")
    public Page<Autore> getAllAutori(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "15") int size,
                                     @RequestParam(defaultValue = "id") String sortBy){
        return autoreService.getAllAutori(page, size, sortBy);
    }

    @GetMapping("/autori/{id}")
    public Autore getAutoreById(@PathVariable int id)throws AutoreNonTrovatoException{
        Optional<Autore> autoreOpt = autoreService.getAutoreById(id);
        if(autoreOpt.isPresent()){
            return autoreOpt.get();
        } else {
            throw new AutoreNonTrovatoException("Autore con id " + id + " non trovato");
        }
    }

    @PutMapping("/autori/{id}")
    public Autore updateAutore(@PathVariable int id, @RequestBody AutoreDTO autoreDTO) throws AutoreNonTrovatoException{
        return autoreService.updateAutore(id, autoreDTO);
    }

    @DeleteMapping("/autori/{id}")
    public String deleteAutore(@PathVariable int id) throws AutoreNonTrovatoException{
        return autoreService.deleteAutore(id);
    }
}
