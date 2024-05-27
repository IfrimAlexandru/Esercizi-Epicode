package it.nextdevs.EsercizioS3G1.service;

import it.nextdevs.EsercizioS3G1.DTO.DipendenteLoginDTO;
import it.nextdevs.EsercizioS3G1.exception.UnauthorizedException;
import it.nextdevs.EsercizioS3G1.model.Dipendente;
import it.nextdevs.EsercizioS3G1.security.JwtTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private DipendenteService dipendenteService;
    @Autowired
    private JwtTool jwtTool;

    public String authenticateUserAndCreateToken(DipendenteLoginDTO dipendenteLoginDTO){
        Dipendente dipendente = dipendenteService.getDipendenteByEmail(dipendenteLoginDTO.getEmail());

        if(dipendente.getPassword().equals(dipendenteLoginDTO.getPassword())){
            return jwtTool.createToken(dipendente);
        }
        else{
            throw  new UnauthorizedException("Error in authorization, relogin!");
        }
    }
}