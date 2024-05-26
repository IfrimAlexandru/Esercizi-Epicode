package it.nextdevs.EsercizioS2G5.controller;

import it.nextdevs.EsercizioS2G5.DTO.DispositivoDTO;
import it.nextdevs.EsercizioS2G5.exception.DispositivoNotFoundException;
import it.nextdevs.EsercizioS2G5.exception.ParametersErrorException;
import it.nextdevs.EsercizioS2G5.model.Dispositivo;
import it.nextdevs.EsercizioS2G5.service.DispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.data.domain.Page;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DispositivoController {
    @Autowired
    private DispositivoService dispositivoService;

    @GetMapping("/dispositivi")
    public Page<Dispositivo> getAllDispositivi(@RequestParam(defaultValue = "0") int page,
                                               @RequestParam(defaultValue = "15") int size,
                                               @RequestParam(defaultValue = "id") String sortBy) {
        return dispositivoService.getAllDispositivi(page, size, sortBy);
    }

    @GetMapping("/dispositivi/{id}")
    public Dispositivo getDispositivoById(@PathVariable Integer id) {
        Optional<Dispositivo> dispositivoOptional = dispositivoService.getDispositivoById(id);
        if (dispositivoOptional.isPresent()) {
            return dispositivoOptional.get();
        } else {
            throw new DispositivoNotFoundException("Dispositivo con id "+id+" non trovato");
        }
    }

    @PostMapping("/dispositivi")
    public String saveDispositivo(@RequestBody @Validated DispositivoDTO dispositivoDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ParametersErrorException(bindingResult.getAllErrors().stream().
                    map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .reduce("", ((s, s2) -> s+s2)));
        }

        return dispositivoService.saveDispositivo(dispositivoDTO);
    }

    @PutMapping("/dispositivi/{id}")
    public Dispositivo updateDispositivo(@PathVariable Integer id,
                                         @RequestBody @Validated DispositivoDTO dispositivoDTO,
                                         BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            throw new ParametersErrorException(bindingResult.getAllErrors().stream().
                    map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .reduce("", ((s, s2) -> s+s2)));
        }

        return dispositivoService.updateDispositivo(id, dispositivoDTO);
    }

    @DeleteMapping("/dispositivi/{id}")
    public String deleteDispositivo(@PathVariable Integer id) {
        return dispositivoService.deleteDispositivo(id);
    }

    @PatchMapping("/dispositivi/{id}/dipendente")
    public String patchAssegnazioneDispositivo(@RequestBody String idDipendente,
                                               @PathVariable Integer id) {
        return dispositivoService.assegnaDispositivo(id, Integer.parseInt(idDipendente));
    }
}

