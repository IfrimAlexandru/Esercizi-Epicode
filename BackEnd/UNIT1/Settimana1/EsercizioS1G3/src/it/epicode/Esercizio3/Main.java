package it.epicode.Esercizio3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creazione di due articoli
        Articolo articolo1 = new Articolo("itlibro", "Il signore degli anelli", 10, 50);
        Articolo articolo2 = new Articolo("itdisco", "Michael Jackson", 40, 1);

        // Creazione di un cliente
        Cliente cliente = new Cliente("itAlexandru", "Ionut Alexandru Ifrim",
                "alexandruifrim@gmail.com", new Date());

        // Creazione di un carrello associato al cliente
        Carrello carrello = new Carrello(cliente);

        // Aggiunta degli articoli al carrello e stampa di un messaggio appropriato in base all'esito
        if (carrello.aggiungiArticolo(articolo1)) {
            System.out.println("Articolo aggiunto con successo");
        } else {
            System.out.println("Errore nell'aggiunta dell'articolo");
        }
        if (carrello.aggiungiArticolo(articolo1)) {
            System.out.println("Articolo aggiunto con successo");
        } else {
            System.out.println("Errore nell'aggiunta dell'articolo");
        }
        if (carrello.aggiungiArticolo(articolo1)) {
            System.out.println("Articolo aggiunto con successo");
        } else {
            System.out.println("Errore nell'aggiunta dell'articolo");
        }
        if (carrello.aggiungiArticolo(articolo2)) {
            System.out.println("Articolo aggiunto con successo");
        } else {
            System.out.println("Errore nell'aggiunta dell'articolo");
        }
        if (carrello.aggiungiArticolo(articolo2)) {
            System.out.println("Articolo aggiunto con successo");
        } else {
            System.out.println("Errore nell'aggiunta dell'articolo");
        }

        // Visualizzazione del contenuto del carrello
        carrello.controllaCarrello();
    }
}
