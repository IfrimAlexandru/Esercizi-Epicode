package it.nextdevs.EsercizioS2G5.service;

import it.nextdevs.EsercizioS2G5.DTO.DispositivoDTO;
import it.nextdevs.EsercizioS2G5.enums.StatoDispositivo;
import it.nextdevs.EsercizioS2G5.exception.DipendenteNotFoundException;
import it.nextdevs.EsercizioS2G5.exception.DispositivoNotFoundException;
import it.nextdevs.EsercizioS2G5.model.Dipendente;
import it.nextdevs.EsercizioS2G5.model.Dispositivo;
import it.nextdevs.EsercizioS2G5.repository.DipendenteRepository;
import it.nextdevs.EsercizioS2G5.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DispositivoService {
    @Autowired
    private DispositivoRepository dispositivoRepository;
    @Autowired
    private DipendenteRepository dipendenteRepository;

    public Page<Dispositivo> getAllDispositivi(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return dispositivoRepository.findAll(pageable);
    }

    public Optional<Dispositivo> getDispositivoById(Integer id) {
        return dispositivoRepository.findById(id);
    }

    public String saveDispositivo(DispositivoDTO dispositivoDTO) {
        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setModel(dispositivoDTO.getModel());
        dispositivo.setTipoDispositivo(dispositivoDTO.getTipoDispositivo());
        dispositivo.setStatoDispositivo(dispositivoDTO.getStatoDispositivo());

        dispositivoRepository.save(dispositivo);
        return "Dispositivo create con questo id: "+dispositivo.getId();
    }

    public Dispositivo updateDispositivo(Integer id, DispositivoDTO dispositivoDTO) {
        Optional<Dispositivo> dispositivoOptional = getDispositivoById(id);

        if (dispositivoOptional.isPresent()) {
            Dispositivo dispositivo = dispositivoOptional.get();
            dispositivo.setStatoDispositivo(dispositivoDTO.getStatoDispositivo());
            dispositivo.setTipoDispositivo(dispositivoDTO.getTipoDispositivo());
            dispositivo.setModel(dispositivoDTO.getModel());

            return dispositivoRepository.save(dispositivo);
        } else {
            throw new DipendenteNotFoundException("Dispositivo con id "+id+" non trovato");
        }
    }

    public String deleteDispositivo(Integer id) {
        Optional<Dispositivo> dispositivoOptional = getDispositivoById(id);

        if (dispositivoOptional.isPresent()) {
            dispositivoRepository.delete(dispositivoOptional.get());
            return "Dispositivo con id "+id+" cancellato con successo";
        } else {
            throw new DipendenteNotFoundException("Dispositivo con id "+id+" non trovato");
        }
    }

    public String assegnaDispositivo(Integer idDis, Integer idDip) {
        Optional<Dipendente> dipendenteOptional = dipendenteRepository.findById(idDip);
        if (dipendenteOptional.isPresent()) {
            Optional<Dispositivo> dispositivoOptional = getDispositivoById(idDis);
            if (dispositivoOptional.isPresent()) {
                Dispositivo dispositivo = dispositivoOptional.get();
                dispositivo.setDipendente(dipendenteOptional.get());
                dispositivo.setStatoDispositivo(StatoDispositivo.ASSEGNATO);
                dispositivoRepository.save(dispositivo);
                return "Dispositivo con id "+idDis+" assegnato al dipendente con id "+idDip;
            } else {
                throw new DispositivoNotFoundException("Dispositivo con id "+idDis+" non trovato");
            }
        } else {
            throw new DipendenteNotFoundException("Dipendente con id "+ idDip +" non trovato");
        }
    }
}