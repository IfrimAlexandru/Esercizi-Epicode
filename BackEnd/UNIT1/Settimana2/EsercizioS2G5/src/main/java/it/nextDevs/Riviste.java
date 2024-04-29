package it.nextDevs;

import java.time.LocalDate;
import java.util.HashSet;

public class Riviste extends ProdottoCatalogo {
    private Periodicita periodicita;

    public Riviste(String codiceISBN, String titolo, LocalDate annoPubblicazione, Integer numeroPagine, Periodicita periodicita) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicita=" + periodicita +
                '}';
    }
}
