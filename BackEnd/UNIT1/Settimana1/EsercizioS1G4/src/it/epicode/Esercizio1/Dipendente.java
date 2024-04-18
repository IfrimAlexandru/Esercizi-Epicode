package it.epicode.Esercizio1;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    //costruttore
    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public Dipartimento getDipartimento() {
        return this.dipartimento;
    }



    public String getMatricola() {
        return this.matricola;
    }



    public double getStipendio() {
        return this.stipendio;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}



