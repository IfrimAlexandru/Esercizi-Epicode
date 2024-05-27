package it.nextdevs.EsercizioS3G1.exception;

public class DispositivoNotFoundException extends RuntimeException {
    public DispositivoNotFoundException(String message) {
        super(message);
    }
}