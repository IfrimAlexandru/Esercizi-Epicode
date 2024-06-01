package it.nextdevs.EsercizioS3G2.controller;

import it.nextdevs.EsercizioS3G2.DTO.DipendenteDTO;
import it.nextdevs.EsercizioS3G2.DTO.DipendenteLoginDTO;
import it.nextdevs.EsercizioS3G2.exception.BadRequestException;
import it.nextdevs.EsercizioS3G2.service.AuthService;
import it.nextdevs.EsercizioS3G2.service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
    public String saveDipendente(@RequestBody @Validated DipendenteDTO dipendenteDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            throw new BadRequestException(bindingResult.getAllErrors().stream()
                    .map(ObjectError::getDefaultMessage).reduce("",((s1, s2) -> s1+s2)));
        }
        return dipendenteService.saveDipendente(dipendenteDTO);
    }

    @PostMapping("/auth/login")
    public String login(@RequestBody @Validated DipendenteLoginDTO dipendenteLoginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new BadRequestException(bindingResult.getAllErrors().stream().map(error->error.getDefaultMessage()).
                    reduce("", (s, s2) -> s+s2));
        }

        return authService.authenticateDipendenteAndCreateToken(dipendenteLoginDTO);
    }
}
