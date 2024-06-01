package it.nextdevs.EsercizioS3G2.service;

import com.cloudinary.Cloudinary;
import it.nextdevs.EsercizioS3G2.DTO.DipendenteDTO;
import it.nextdevs.EsercizioS3G2.enums.Role;
import it.nextdevs.EsercizioS3G2.exception.BadRequestException;
import it.nextdevs.EsercizioS3G2.exception.DipendenteNotFoundException;
import it.nextdevs.EsercizioS3G2.model.Dipendente;
import it.nextdevs.EsercizioS3G2.repository.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collections;
import java.util.Optional;
import java.util.List;

@Service
public class DipendenteService {
    @Autowired
    private DipendenteRepository dipendenteRepository;
    @Autowired
    private Cloudinary cloudinary ;
    @Autowired
    private JavaMailSenderImpl javaMailSender;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public String saveDipendente(DipendenteDTO dipendenteDTO) {

        if(getDipendenteByEmail(dipendenteDTO.getEmail()).isEmpty()) {
            Dipendente dipendente = new Dipendente();
            dipendente.setUsername(dipendenteDTO.getUsername());
            dipendente.setName(dipendenteDTO.getName());
            dipendente.setSurname(dipendenteDTO.getSurname());
            dipendente.setEmail(dipendenteDTO.getEmail());
            dipendente.setRole(Role.USER);
            dipendente.setPassword( passwordEncoder.encode(dipendenteDTO.getPassword()));
            dipendente.setAvatar("https://ui-avatars.com/api/?name="+dipendenteDTO.getName()+"+"+dipendenteDTO.getSurname());
            sendMail(dipendente.getEmail());

            dipendenteRepository.save(dipendente);
            return "Dipendente  con id: "+dipendente.getId()+" creato con successo";
        }else{
            throw new BadRequestException("Dipendente con email " + dipendenteDTO.getEmail() + " già esistente");
        }

    }

    public Optional<Dipendente> getDipendenteById(int id){
        return dipendenteRepository.findById(id);
    }

    public Page<Dipendente> getAllDipendente(int page, int size, String sortBy){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return dipendenteRepository.findAll(pageable);
    }

    public Optional<Dipendente> getDipendenteByUsername(int username){
        return dipendenteRepository.findById(username);
    }





    public Dipendente updateDipendente(int username, DipendenteDTO dipendenteDTO) throws DipendenteNotFoundException {
        Optional<Dipendente> dipendenteOptional = getDipendenteByUsername(username);
        if(dipendenteOptional.isPresent()){
            Dipendente dipendente = dipendenteOptional.get();
            dipendente.setUsername(dipendenteDTO.getUsername());
            dipendente.setName(dipendenteDTO.getName());
            dipendente.setSurname(dipendenteDTO.getSurname());
            dipendente.setEmail(dipendenteDTO.getEmail());
            dipendente.setPassword( passwordEncoder.encode(dipendenteDTO.getPassword()));
            return dipendenteRepository.save(dipendente);
        }
        throw new DipendenteNotFoundException("Dipendente con username: "+ username + " non trovato");
    }

    public String deleteDipendente(int id) throws DipendenteNotFoundException {
        Optional<Dipendente> dipendenteOptional = getDipendenteById(id);

        if (dipendenteOptional.isPresent()) {
            dipendenteRepository.deleteById(id);
            return "User with id= " + id + " correctly deleted";
        } else {

            throw new DipendenteNotFoundException("Dipendente con id:" + id + " non trovata");
        }
    }


    public String patchAvatarDipendente(int id, MultipartFile avatar) throws IOException {
        Optional<Dipendente> dipendenteOpt = getDipendenteById(id);
        if (dipendenteOpt.isPresent()) {

            String url = (String) cloudinary.uploader().upload(avatar.getBytes(), Collections.emptyMap()).get("url");
            Dipendente dipendente = dipendenteOpt.get();
            dipendente.setAvatar(url);
            dipendenteRepository.save(dipendente);
            return "Dipendente con id" + id + " aggiornato correttamente la cover inviata";
        } else {
            throw new DipendenteNotFoundException("Studente non trovato");
        }
    }

    private void sendMail(String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Registrazione Servizio rest");//oggetto dell' email
        message.setText("Registrazione al servizio rest avvenuta con successo");//corpo dell'email

        javaMailSender.send(message);
    }

    public Optional <Dipendente> getDipendenteByEmail(String email) {
        Optional<Dipendente> dipendenteOptional = dipendenteRepository.findByEmail(email);

        return dipendenteOptional;
    }


}