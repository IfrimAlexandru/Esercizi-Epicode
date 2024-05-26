package it.nextdevs.EsercizioS2G5.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DipendenteDTO {
    @Size(max =30)
    @NotNull
    private String username;
    @Size(max =30)
    @NotNull
    private String name;
    @Size(max =30)
    @NotNull
    private String surname;
    @Email(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    @NotNull
    private String email;
}
