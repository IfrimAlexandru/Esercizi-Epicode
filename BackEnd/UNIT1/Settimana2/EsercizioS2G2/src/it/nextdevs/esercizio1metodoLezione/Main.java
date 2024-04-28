package it.nextdevs.esercizio1metodoLezione;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashSet<String> parole = new HashSet<>();

        ArrayList<String> listaDuplicati = new ArrayList<>();

        System.out.println("Dammi la quantità di parole");
        int n = scanner.nextInt();
        int i = 0;
        scanner.nextLine();
        while (i < n){
            System.out.println("Dammi una parola");
            String parola = scanner.nextLine();
          if(!parole.add(parola)) {
              listaDuplicati.add(parola);
          }
          i++;
        }
        System.out.println("Lista dei duplicati");
        System.out.println(listaDuplicati);
        System.out.println();
        System.out.println("Il numero delle parole distinte è: " + parole.size());
        System.out.println();
        System.out.println("Lista delle parole distinte");
        System.out.println(parole);
    }
}
