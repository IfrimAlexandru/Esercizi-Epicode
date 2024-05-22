package it.nextdevs.EsercizioS2G3.DTO;

import lombok.Data;

import java.time.Duration;
@Data
public class BlogDTO {
    private String titolo;
    private String contenuto;
    private String categoria;
    private Duration tempoDiLettura;

    private int autoreId;
}
