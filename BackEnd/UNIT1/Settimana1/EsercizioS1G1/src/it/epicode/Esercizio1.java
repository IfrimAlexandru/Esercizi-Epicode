package it.epicode;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moltiplicazioni");
        System.out.println("Inserisci il primo numero");
        int x = scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int y = scanner.nextInt();
        int result = moltiplica(x, y);
        System.out.println("Il risultato della moltiplicazione è " + result);

        scanner.nextLine(); //per svuotare

        System.out.println("Concatenazione");
        System.out.println("Inserisci una stringa");
        String stringas = scanner.nextLine();
        System.out.println("Inserisci un numero intero");
        int c = scanner.nextInt();
        String result2 = concatena(stringas, c);
        System.out.println("L'output è " + result2);

        System.out.println("Esercizio Array");
        String[] nuovoArray = inserisciInArray(new String[]{"cane", "gatto", "cavallo", "zebra", "leone"}, "balena");
        System.out.println(Arrays.toString(nuovoArray));


    }

    public static String[] inserisciInArray(String[] array, String stringa) {

        return new String[]{array[0], array[1], stringa, array[2], array[3], array[4]};
    }


    public static int moltiplica(int x, int y){
        return x * y;
    }

    public static String concatena(String stringa, int c){
        return stringa + c;
    }

}
