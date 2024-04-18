package it.epicode.Esercizio2;

public class Main {
    public static void main(String[] args) {
        // Creazione di diverse istanze di dipendenti
        Dipendente dipendente1 = new DipendenteFullTime("001", 3000.0, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new DipendentePartTime("002", 0.0, Dipartimento.VENDITE, 20, 15.0);
        Dipendente dipendente3 = new Dirigente("003", 5000.0, Dipartimento.AMMINISTRAZIONE, 1000.0);

        // Mettere i dipendenti in un array
        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        // Calcolare gli stipendi totali
        double stipendiTotali = 0.0;
        for (Dipendente dipendente : dipendenti) {
            stipendiTotali += dipendente.calculateSalary();
        }

        // Stampare lo stipendio di ogni singolo dipendente
        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola() + ", Stipendio: " + dipendente.calculateSalary());
        }

        // Stampare gli stipendi totali
        System.out.println("Stipendi totali: " + stipendiTotali);


    }
}
