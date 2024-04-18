package it.epicode.Esercizio3;

import java.util.Date;

public class Cliente {
    // Dichiarazione di variabili membro private
    private String codice;          // Codice univoco del cliente
    private String nomeCognome;     // Nome e cognome del cliente
    private String email;           // Email del cliente
    private Date iscrizione;        // Data di iscrizione del cliente

    // Costruttore che inizializza le variabili membro con i valori passati come argomenti
    public Cliente(String codice, String nomeCognome, String email, Date iscrizione) {
        this.codice = codice;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.iscrizione = iscrizione;
    }

    // Metodo getter per ottenere il nome e cognome del cliente
    public String getNomeCognome() {
        return nomeCognome;
    }
}

