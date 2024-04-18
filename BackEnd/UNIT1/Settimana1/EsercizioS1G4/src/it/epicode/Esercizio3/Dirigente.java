package it.epicode.Esercizio3;

public class Dirigente extends Dipendente {
    private double bonus;

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento, double bonus) {
        super(matricola, stipendio, dipartimento);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        // Implementazione del calcolo dello stipendio per un dirigente
        return getStipendio() + bonus; // Stipendio base più bonus
    }
}
