package it.epicode.esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        do {
            System.out.println("Fornisci una stringa oppure scrivi ':q' per chiudere il programma");
            stringa = scanner.nextLine();
            if (!stringa.equals(":q")) {
                String[] caratteri = stringa.split("");
                System.out.println(String.join(",", caratteri));
            }

        } while (!stringa.equals(":q"));
        scanner.close();
        System.out.println("Fine");
    }
}
