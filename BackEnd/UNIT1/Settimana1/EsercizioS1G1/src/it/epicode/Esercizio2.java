package it.epicode;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa");
        String stringa1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa");
        String stringa2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa");
        String stringa3 = scanner.nextLine();

        // Stampa le stringhe nell'ordine in cui sono state inserite
        System.out.println("Stringhe in ordine:");
        System.out.println(stringa1);
        System.out.println(stringa2);
        System.out.println(stringa3);

        // Stampa le stringhe in ordine inverso
        System.out.println("Stringhe in ordine inverso:");
        String stringaInversa1 = new StringBuilder(stringa1).reverse().toString();
        String stringaInversa2 = new StringBuilder(stringa2).reverse().toString();
        String stringaInversa3 = new StringBuilder(stringa3).reverse().toString();
        System.out.println(stringaInversa3);
        System.out.println(stringaInversa2);
        System.out.println(stringaInversa1);
    }

    public static String concatenazione(String stringa1, String stringa2, String stringa3){
        return stringa1 + stringa2 + stringa3;
    }
}
