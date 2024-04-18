package it.epicode.Esercizio1;

public class Main {
    public static void main(String[] args) {
        // Creazione di tre dipendenti
        Dipendente d1 = new Dipendente("001", 2000.0, Dipartimento.PRODUZIONE);
        Dipendente d2 = new Dipendente("002", 2500.0, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente("003", 2200.0, Dipartimento.VENDITE);
        Dipendente d4 = new Dipendente("004", 1800.0,Dipartimento.PRODUZIONE);

        // Creazione di un array di dipendenti
        Dipendente[] dipendenti = {d1, d2, d3, d4};

        // Iterazione sull'array e stampa della matricola di ciascun dipendente
        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola n°" + dipendente.getMatricola() + ", Dipartimento :"
                    + dipendente.getDipartimento());
        }


    }
}
