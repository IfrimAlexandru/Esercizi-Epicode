package it.epicode.Esercizio3;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        // Implementazione del calcolo dello stipendio per un dipendente a tempo pieno
        return getStipendio(); // Stipendio fisso mensile
    }
}
