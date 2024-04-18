package it.epicode.Esercizio2;

public class DipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double tariffaOraria;

    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento, int oreLavorate, double tariffaOraria) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
        this.tariffaOraria = tariffaOraria;
    }

    @Override
    public double calculateSalary() {
        // Implementazione del calcolo dello stipendio per un dipendente part-time
        return oreLavorate * tariffaOraria; // Stipendio basato sulle ore lavorate e sulla tariffa oraria
    }
}
