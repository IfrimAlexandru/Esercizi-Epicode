package it.nextdevs.EsercizioS3G1.service;

import com.cloudinary.Cloudinary;
import it.nextdevs.EsercizioS3G1.DTO.DipendenteDTO;
import it.nextdevs.EsercizioS3G1.exception.DipendenteNotFoundException;
import it.nextdevs.EsercizioS3G1.model.Dipendente;
import it.nextdevs.EsercizioS3G1.repository.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collections;
import java.util.Optional;

@Service
public class DipendenteService {
    @Autowired
    private DipendenteRepository dipendenteRepository;
    @Autowired
    private Cloudinary cloudinary;
    @Autowired
    private JavaMailSenderImpl javaMailSender;

    public Page<Dipendente> getAllDipendenti(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return dipendenteRepository.findAll(pageable);
    }

    public Optional<Dipendente> getDipendenteById(Integer id){
        return dipendenteRepository.findById(id);
    }

    public String saveDipendente(DipendenteDTO dipendenteDTO){
        Dipendente dipendente = new Dipendente();
        dipendente.setUsername(dipendenteDTO.getUsername());
        dipendente.setName(dipendenteDTO.getName());
        dipendente.setSurname(dipendenteDTO.getSurname());
        dipendente.setEmail(dipendenteDTO.getEmail());
        dipendente.setPassword(dipendenteDTO.getPassword());
        dipendenteRepository.save(dipendente);
        sendMail(dipendente.getEmail());
        return "Dipendente creato con questo id: " + dipendente.getId();
    }

    private void sendMail(String email){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Registrazione NextDevs");
        message.setText("Registrazione al servizio rest avvenuta con successo");

        javaMailSender.send(message);
    }

    public Dipendente updateDipendente(Integer id, DipendenteDTO dipendenteDTO){
        Optional<Dipendente> dipendenteOptional = getDipendenteById(id);

        if(dipendenteOptional.isPresent()){
            Dipendente dipendente = dipendenteOptional.get();
            dipendente.setUsername(dipendenteDTO.getUsername());
            dipendente.setName(dipendenteDTO.getName());
            dipendente.setSurname(dipendenteDTO.getSurname());
            dipendente.setEmail(dipendenteDTO.getEmail());
            dipendente.setPassword(dipendenteDTO.getPassword());
            dipendenteRepository.save(dipendente);
            return dipendente;
        } else {
            throw new DipendenteNotFoundException("Dipendente con id: " + id +" non trovato");
        }
    }

    public String deleteDipendente(Integer id){
        Optional<Dipendente> dipendenteOptional = getDipendenteById(id);

        if(dipendenteOptional.isPresent()){
            Dipendente dipendente = dipendenteOptional.get();
            dipendenteRepository.delete(dipendente);
            return "Dipendente con id: " + id + " eliminato";
        } else {
            throw new DipendenteNotFoundException("Dipendente con id: " + id +" non trovato");
        }
    }

    public String patchAvatarDipendente(Integer id, MultipartFile avatar)throws IOException{
        Optional<Dipendente> dipendenteOptional = getDipendenteById(id);

        if(dipendenteOptional.isPresent()){
            String url = (String) cloudinary.uploader().upload(avatar.getBytes(),
            Collections.emptyMap()).get("url");
            Dipendente dipendente = dipendenteOptional.get();
            dipendente.setAvatar(url);
            dipendenteRepository.save(dipendente);
            return "Dipendente con id: " + id + " aggiornato";

        } else {
            throw new DipendenteNotFoundException("Dipendente con id: " + id +" non trovato");
        }

    }

    public Dipendente getDipendenteByEmail(String email){
        Optional<Dipendente> dipendenteOptional = dipendenteRepository.findByEmail(email);
        if(dipendenteOptional.isPresent()){
            return dipendenteOptional.get();
        } else {
            throw new DipendenteNotFoundException("Dipendente con email: " + email + " non trovato");
        }
    }
}
