package it.nextdevs.EsercizioS2G3.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.Duration;

@Data
public class Blog {
    @Id
    @GeneratedValue
    private int id;
    //private static int contatore;
    private String titolo;
    private String categoria;
    private String contenuto;
    private String cover;
    private Duration tempoDiLettura;
    @ManyToOne
    @JoinColumn(name = "autore_id")
    private Autore autore;

//    public Blog(String titolo, String categoria, String contenuto, Duration tempoDiLettura) {
//        this.titolo = titolo;
//        this.categoria = categoria;
//        this.cover = "https://picsum.photos/200/300";
//        this.contenuto = contenuto;
//        this.tempoDiLettura = tempoDiLettura;
//        contatore++;
//        id=contatore;
//    }
}
