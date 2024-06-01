package it.nextdevs.EsercizioS3G2.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DipendenteLoginDTO {
    @Email
    @NotBlank(message = "L'email non può essere vuota o mancante o composta da soli spazi")
    private String email;
    @NotBlank(message = "La password non può essere vuota o mancante o composta da soli spazi")
    private String password;

}
