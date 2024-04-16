package it.epicode.esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ESERCIZIO#2
        System.out.println("Inserisci un numero intero");
        int n = scanner.nextInt();
        System.out.println(stampa(n));
    }

    public static String stampa(int n) {
        String risultato;
        switch (n) {
            case 0: {
                risultato = "zero";
                break;
            }
            case 1: {
                risultato = "uno";
                break;
            }
            case 2: {
                risultato = "due";
                break;
            }
            case 3: {
                risultato = "tre";
                break;
            }
            default:
                risultato = "Il numero fornito non è compreso tra 0 e 3";
        }
        return risultato;
    }
}
