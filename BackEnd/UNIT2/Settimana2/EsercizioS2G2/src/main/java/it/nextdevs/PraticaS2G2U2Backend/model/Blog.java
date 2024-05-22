package it.nextdevs.PraticaS2G2U2Backend.model;

import lombok.Data;

import java.time.Duration;
import java.time.LocalTime;
@Data
public class Blog {
    private int id;
    private static int contatore;
    private String titolo;
    private String categoria;
    private String contenuto;
    private String cover;
    private Duration tempoDiLettura;

    public Blog(String titolo, String categoria, String contenuto, Duration tempoDiLettura) {
        this.titolo = titolo;
        this.categoria = categoria;
        this.cover = "https://picsum.photos/200/300";
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
        contatore++;
        id=contatore;
    }
}
