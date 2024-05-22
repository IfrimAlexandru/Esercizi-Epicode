package it.nextdevs.EsercizioS2G3.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

@Data
public class Error {
    private String message;
    private LocalDate dateErrore;
    private HttpStatus httpErrore;
}
