package it.nextDevs;

import java.time.LocalDate;
import java.util.HashSet;

public class Libri extends ProdottoCatalogo {
    private String autore;
    private String genere;

    public Libri(String codiceISBN, String titolo, LocalDate annoPubblicazione, Integer numeroPagine, String autore, String genere) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
