package it.nextdevs.EsercizioS2G5.exception;

public class ParametersErrorException extends RuntimeException {
    public ParametersErrorException(String message) {
        super(message);
    }
}
