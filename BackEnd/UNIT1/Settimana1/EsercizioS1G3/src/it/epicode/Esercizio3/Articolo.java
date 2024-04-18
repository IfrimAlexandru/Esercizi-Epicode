package it.epicode.Esercizio3;

public class Articolo {
    // Dichiarazione di variabili membro private
    private String codice;        // Codice univoco dell'articolo
    private String descrizione;   // Descrizione dell'articolo
    private double prezzo;        // Prezzo dell'articolo
    private int quantita;         // Quantità disponibile dell'articolo

    // Costruttore che inizializza le variabili membro con i valori passati come argomenti
    public Articolo(String codice, String descrizione, double prezzo, int quantita) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    // Metodo getter per ottenere il prezzo dell'articolo
    public double getPrezzo() {
        return prezzo;
    }

    // Metodo getter per ottenere la descrizione dell'articolo
    public String getDescrizione() {
        return descrizione;
    }

    // Metodo getter per ottenere la quantità disponibile dell'articolo
    public int getQuantita() {
        return quantita;
    }

    // Metodo setter per impostare la quantità disponibile dell'articolo
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}

