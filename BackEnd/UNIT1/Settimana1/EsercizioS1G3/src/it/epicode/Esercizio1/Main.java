package it.epicode.Esercizio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci altezza del rettangolo:");
        double altezza = scanner.nextDouble();

        System.out.println("Inserisci larghezza del rettangolo:");
        double larghezza = scanner.nextDouble();

        MetodiRettangolo rettangolo = new MetodiRettangolo(altezza, larghezza);

        System.out.println("\nRettangolo:");
        rettangolo.stampaRettangolo(rettangolo);

        System.out.println("Inserisci altezza del primo rettangolo:");
        double altezza1 = scanner.nextDouble();

        System.out.println("Inserisci larghezza del primo rettangolo:");
        double larghezza1 = scanner.nextDouble();

        MetodiRettangolo metodiRettangolo1 = new MetodiRettangolo(altezza1, larghezza1);

        System.out.println("Inserisci altezza del secondo rettangolo:");
        double altezza2 = scanner.nextDouble();

        System.out.println("Inserisci larghezza del secondo rettangolo:");
        double larghezza2 = scanner.nextDouble();

        MetodiRettangolo metodiRettangolo2 = new MetodiRettangolo(altezza2, larghezza2);

        MetodiRettangolo.stampaDueRettangoli(metodiRettangolo1, metodiRettangolo2);

        scanner.close();
    }
}
