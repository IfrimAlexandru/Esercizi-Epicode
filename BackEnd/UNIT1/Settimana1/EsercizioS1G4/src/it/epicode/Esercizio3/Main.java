package it.epicode.Esercizio3;

public class Main {
    public static void main(String[] args) {
        // Creazione di diverse istanze di dipendenti
        Dipendente dipendente1 = new DipendenteFullTime("001", 3000.0, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new DipendentePartTime("002", 0.0, Dipartimento.VENDITE, 20, 15.0);
        Dipendente dipendente3 = new Dirigente("003", 5000.0, Dipartimento.AMMINISTRAZIONE, 1000.0);
        Volontario volontario1 = new Volontario("Giuseppe", 30, "Medici senza frontiere");

        // Mettere i dipendenti in un array
        InterfacciaDipendente[] lavoratori = {dipendente1, dipendente2, dipendente3, volontario1};

        for (InterfacciaDipendente lavoratore : lavoratori){
            lavoratore.checkIn();
        }




    }
}
