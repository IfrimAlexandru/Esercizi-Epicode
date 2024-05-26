package it.nextdevs.EsercizioS2G5.exception;

public class DispositivoNotFoundException extends RuntimeException {
    public DispositivoNotFoundException(String message) {
        super(message);
    }
}