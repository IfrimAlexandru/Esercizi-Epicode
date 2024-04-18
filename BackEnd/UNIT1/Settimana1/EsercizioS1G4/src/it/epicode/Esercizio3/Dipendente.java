package it.epicode.Esercizio3;

public abstract class Dipendente implements InterfacciaDipendente {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // Metodo setter per modificare il dipartimento
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public void checkIn() {
        System.out.println(this.matricola + " è entrato in servizio");
    }
}
