package it.nextdevs.EsercizioS3G1.exception;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message){
        super(message);
    }
}
