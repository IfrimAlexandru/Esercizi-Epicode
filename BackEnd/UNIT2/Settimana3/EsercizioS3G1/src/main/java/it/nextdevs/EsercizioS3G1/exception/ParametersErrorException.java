package it.nextdevs.EsercizioS3G1.exception;

public class ParametersErrorException extends RuntimeException {
    public ParametersErrorException(String message) {
        super(message);
    }
}
