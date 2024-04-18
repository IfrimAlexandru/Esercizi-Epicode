package it.epicode.Esercizio3;

public class Volontario implements InterfacciaDipendente {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario "+ this.nome + " è entrato in servizio");
    }
}


