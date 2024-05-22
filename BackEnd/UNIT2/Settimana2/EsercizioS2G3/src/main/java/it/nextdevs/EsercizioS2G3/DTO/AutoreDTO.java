package it.nextdevs.EsercizioS2G3.DTO;



import lombok.Data;

import java.time.LocalDate;
@Data
public class AutoreDTO {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private String email;
}
