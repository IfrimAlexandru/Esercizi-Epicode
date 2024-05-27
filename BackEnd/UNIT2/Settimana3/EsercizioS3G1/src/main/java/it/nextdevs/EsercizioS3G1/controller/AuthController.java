package it.nextdevs.EsercizioS3G1.controller;

import it.nextdevs.EsercizioS3G1.DTO.DipendenteDTO;
import it.nextdevs.EsercizioS3G1.DTO.DipendenteLoginDTO;
import it.nextdevs.EsercizioS3G1.exception.BadRequestException;
import it.nextdevs.EsercizioS3G1.service.AuthService;
import it.nextdevs.EsercizioS3G1.service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @Autowired
    private DipendenteService dipendenteService;

    @PostMapping("/auth/register")
    public String register(@RequestBody @Validated DipendenteDTO dipendenteDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new BadRequestException(bindingResult.getAllErrors().stream().map(error->error.getDefaultMessage()).
                    reduce("", (s, s2) -> s+s2));
        }

        return dipendenteService.saveDipendente(dipendenteDTO);
    }
    @PostMapping("/auth/login")
    public String login(@RequestBody @Validated DipendenteLoginDTO dipendenteLoginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new BadRequestException(bindingResult.getAllErrors().stream().map(error->error.getDefaultMessage()).
                    reduce("", (s, s2) -> s+s2));
        }

        return authService.authenticateUserAndCreateToken(dipendenteLoginDTO);
    }



}
