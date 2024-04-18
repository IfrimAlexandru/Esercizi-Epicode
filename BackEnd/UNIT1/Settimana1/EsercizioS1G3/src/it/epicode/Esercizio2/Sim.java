package it.epicode.Esercizio2;

public class Sim {

    private int numero;
    private double credito;

    private Chiamata[] chiamate;

    public Sim(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getCredito() {
        return credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void stampaDatiSim(){
        System.out.println("Il numero di telefono è " + numero);
        System.out.println("Il credito residuo è " + credito );

        for(int i=0; i<chiamate.length; i++){
            System.out.println("Il numero chiamato è " + chiamate[i].getNumeroChiamato() +
                    ", i minuti di conversazione sono " + chiamate[i].getMinutiConversazione());
        }
    }
}
