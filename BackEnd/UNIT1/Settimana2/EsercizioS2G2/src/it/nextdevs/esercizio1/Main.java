package it.nextdevs.esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        Integer elementiN = 0;
        Boolean continua;
        Set elementi = new HashSet();
        do {
            try {
                System.out.println("Quanti elementi vuoi inserire?");
                elementiN = scanner.nextInt();
                continua = true;
                if (elementiN <= 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Devi inserire un numero intero e maggione di 0");
                continua = false;
            }
        }while (!continua);
        scanner.nextLine();

        for (int i = 0; i < elementiN; i++) {
            System.out.println("Scrivi la stringa che vuoi aggiungere - Slot " + (i+1));
            String parola = scanner.nextLine();
            if (elementi.add(parola)) {
                System.out.println(parola);
            } else {
                System.err.println("Duplicato: "+parola);
                i--;
            }
        }


    }

}
