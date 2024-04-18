package it.epicode.Esercizio1;

public class MetodiRettangolo {
    private double altezza;
    private double larghezza;

    public MetodiRettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodo per calcolare il perimetro
    private double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    // Metodo per calcolare l'area
    private double calcolaArea() {
        return altezza * larghezza;
    }

    // Metodo per stampare area e perimetro
    public static void stampaRettangolo(MetodiRettangolo rettangolo) {
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
    }

    public static void stampaDueRettangoli(MetodiRettangolo metodiRettangolo1, MetodiRettangolo metodiRettangolo2) {
        // Stampa informazioni del primo rettangolo
        System.out.println("Primo rettangolo:");
        metodiRettangolo1.stampaRettangolo(metodiRettangolo1);

        // Stampa informazioni del secondo rettangolo
        System.out.println("\nSecondo rettangolo:");
        metodiRettangolo2.stampaRettangolo(metodiRettangolo2);

        // Calcola e stampa la somma delle aree
        double sommaAree = metodiRettangolo1.calcolaArea() + metodiRettangolo2.calcolaArea();
        System.out.println("\nSomma delle aree: " + sommaAree);

        // Calcola e stampa la somma dei perimetri
        double sommaPerimetri = metodiRettangolo1.calcolaPerimetro() + metodiRettangolo2.calcolaPerimetro();
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }




}
