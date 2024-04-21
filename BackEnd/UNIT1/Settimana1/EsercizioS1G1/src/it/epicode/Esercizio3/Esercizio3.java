package it.epicode.Esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ESERCIZIO PERIMETRO
        System.out.println("Calcolo perimetro rettangolo");
        System.out.println("Inserisci la base del rettangolo");

        double base = scanner.nextDouble();

        System.out.println("Inserisci l'altezza del rettangolo");

        double altezza = scanner.nextDouble();

        System.out.println("Perimetro = " + perimetro(base, altezza));

        //ESERCIZIO PARI O DISPARI

        System.out.println("Inserisci un numero intero");
        int n = scanner.nextInt();

        System.out.println("Il risultato è " + pariDispari(n));

        //ESERCIZIO AREA TRIANGOLO CON FORMULA DI ERONE


        System.out.println("Inserisci la lunghezza del primo lato:");
        double lato1 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del secondo lato:");
        double lato2 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del terzo lato:");
        double lato3 = scanner.nextDouble();

        double area = calcolaAreaTriangolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + area);
    }

    public static double perimetro (double base, double altezza) {
        return (base + altezza) * 2;
    }

    public static int pariDispari (int n){
        if (n % 2 == 0){
            return 0;
        } else {
            return 1;
        }

    }

    // Metodo per calcolare l'area di un triangolo utilizzando la formula di Erone
    public static double calcolaAreaTriangolo(double lato1, double lato2, double lato3) {
        // Calcola il semiperimetro
        double semiperimetro = (lato1 + lato2 + lato3) / 2;

        // Calcola l'area utilizzando la formula di Erone
        double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));

        return area;
    }
}
