package it.nextdevs.EsercizioS3G2.service;

import it.nextdevs.EsercizioS3G2.DTO.DipendenteLoginDTO;
import it.nextdevs.EsercizioS3G2.exception.UnauthorizedException;
import it.nextdevs.EsercizioS3G2.model.Dipendente;
import it.nextdevs.EsercizioS3G2.security.JwtTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AuthService {
    @Autowired
    private DipendenteService dipendenteService;
    @Autowired
    private JwtTool jwtTool;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public String authenticateDipendenteAndCreateToken(DipendenteLoginDTO dipendenteLoginDTO) {
        Optional <Dipendente> dipendenteOptional = dipendenteService.getDipendenteByEmail(dipendenteLoginDTO.getEmail());
        if (dipendenteOptional.isEmpty()) {
            throw new UnauthorizedException("Error in authorization, relogin!");
        }else{
            Dipendente dipendente= dipendenteOptional.get();
            if (passwordEncoder.matches(dipendenteLoginDTO.getPassword(),dipendente.getPassword())){
                return jwtTool.createToken(dipendente);
            }else {
                throw new UnauthorizedException("Error in authorization, relogin!");
            }
        }


    }

}