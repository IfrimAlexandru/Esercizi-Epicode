package it.nextdevs.EsercizioS3G2.controller;

import it.nextdevs.EsercizioS3G2.DTO.DipendenteDTO;
import it.nextdevs.EsercizioS3G2.exception.DipendenteNotFoundException;
import it.nextdevs.EsercizioS3G2.exception.ParametersErrorException;
import it.nextdevs.EsercizioS3G2.model.Dipendente;
import it.nextdevs.EsercizioS3G2.service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController
public class DipendenteController {
    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping("/dipendenti")
    @PreAuthorize("hasAnyAuthority('ADMIN','USER')")
    public Page<Dipendente> getAllDipendenti(@RequestParam(defaultValue = "0") int page,
                                             @RequestParam(defaultValue = "15") int size,
                                             @RequestParam(defaultValue = "id") String sortBy) {
        return dipendenteService.getAllDipendente(page, size, sortBy);
    }

    @GetMapping("/dipendenti/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','USER')")
    public Dipendente getDipendenteById(@PathVariable Integer id) {
        Optional<Dipendente> dipendenteOptional = dipendenteService.getDipendenteById(id);
        if (dipendenteOptional.isPresent()) {
            return dipendenteOptional.get();
        } else {
            throw new DipendenteNotFoundException("Dipendente con id "+id+" non trovato");
        }
    }

    @PutMapping("/dipendenti/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Dipendente updateDipendente(@PathVariable Integer id,
                                       @RequestBody @Validated DipendenteDTO dipendenteDto,
                                       BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            throw new ParametersErrorException(bindingResult.getAllErrors().stream().
                    map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .reduce("", ((s, s2) -> s+s2)));
        }

        return dipendenteService.updateDipendente(id, dipendenteDto);
    }

    @DeleteMapping("/dipendenti/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String deleteDipendente(@PathVariable Integer id) {
        return dipendenteService.deleteDipendente(id);
    }

    @PatchMapping("/dipendenti/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN','USER')")
    @ResponseStatus(HttpStatus.OK)
    public String patchAvatarDipendente(@RequestBody MultipartFile avatar,
                                        @PathVariable Integer id) throws IOException {
        return dipendenteService.patchAvatarDipendente(id, avatar);
    }
}
