package it.epicode.Esercizio3;

import java.util.ArrayList;

public class Carrello {
    // Dichiarazione di variabili membro private
    private Cliente cliente;               // Cliente associato al carrello
    private ArrayList<Articolo> articoli; // Lista degli articoli nel carrello
    private double totale;                 // Totale del carrello

    // Costruttore che inizializza il cliente e la lista degli articoli del carrello
    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<Articolo>();
    }

    // Metodo per aggiungere un articolo al carrello
    public boolean aggiungiArticolo(Articolo articolo) {
        // Verifica se la quantità dell'articolo è maggiore di zero
        if (articolo.getQuantita() > 0) {
            articolo.setQuantita(articolo.getQuantita() - 1); // Decrementa la quantità dell'articolo
            this.articoli.add(articolo); // Aggiunge l'articolo alla lista del carrello
            totale += articolo.getPrezzo(); // Aggiorna il totale del carrello
            return true; // Restituisce true se l'articolo è stato aggiunto con successo
        } else {
            return false; // Restituisce false se la quantità dell'articolo è zero
        }
    }

    // Metodo per visualizzare il contenuto del carrello
    public void controllaCarrello() {
        System.out.println("Carrello di: " + this.cliente.getNomeCognome()); // Stampa il nome del cliente
        System.out.println("Articoli nel carrello:");
        for (Articolo articolo : articoli) { // Itera attraverso gli articoli nel carrello
            System.out.println("-------------------");
            System.out.println("Nome articolo: " + articolo.getDescrizione()); // Stampa il nome dell'articolo
            System.out.println("Prezzo articolo: " + articolo.getPrezzo()); // Stampa il prezzo dell'articolo
            System.out.println("Quantità disponibile: " + articolo.getQuantita()); // Stampa la quantità disponibile dell'articolo
        }
        System.out.println("-----------------------");
        System.out.println("Totale carrello: " + this.totale + " euro"); // Stampa il totale del carrello
    }
}
