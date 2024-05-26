package it.nextdevs.EsercizioS2G5.exception;

import it.nextdevs.EsercizioS2G5.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CentralizedExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DipendenteNotFoundException.class)
    public ResponseEntity<Object> DipendenteNonTrovatoHandler(DipendenteNotFoundException e) {
        Error error = new Error();
        error.setMessage(e.getMessage());
        error.setDataErrore(LocalDateTime.now());
        error.setStatoErrore(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DispositivoNotFoundException.class)
    public ResponseEntity<Object> DispositivoNonTrovatoHandler(DispositivoNotFoundException e) {
        Error error = new Error();
        error.setMessage(e.getMessage());
        error.setDataErrore(LocalDateTime.now());
        error.setStatoErrore(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ParametersErrorException.class)
    public ResponseEntity<Object> ParametriErratiHandler(ParametersErrorException e) {
        Error error = new Error();
        error.setMessage(e.getMessage());
        error.setDataErrore(LocalDateTime.now());
        error.setStatoErrore(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
