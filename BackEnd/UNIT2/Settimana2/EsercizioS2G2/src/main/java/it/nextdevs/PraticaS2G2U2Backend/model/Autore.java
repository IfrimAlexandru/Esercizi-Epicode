package it.nextdevs.PraticaS2G2U2Backend.model;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Autore {
    private int id;
    private static int contatore;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private String avatar;

    public Autore(String nome, String cognome, String email, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.avatar = "https://ui-avatars.com/api/?name="+nome+"+"+cognome;

        contatore++;

        id = contatore;
    }
}
