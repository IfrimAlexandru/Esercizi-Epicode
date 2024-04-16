package it.epicode.esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fornisci un numero intero");
        int n = scanner.nextInt();
        rovescia(n);

    }

    public static void rovescia(int num) {
        System.out.println("Conto alla rovescia da " + num + " a 0");
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }


}
