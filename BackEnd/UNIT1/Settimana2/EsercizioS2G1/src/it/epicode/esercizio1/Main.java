package it.epicode.esercizio1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    static Logger logger = LoggerFactory.getLogger("logger");
    public static void main(String[] args) {

        // Creazione dell'array di 5 interi con valori casuali tra 1 e 10
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,11);
        }

        Scanner scanner = new Scanner(System.in);

        // Stampare l'array iniziale
        logger.info("Array iniziale:");
        stampaArray(array);

        // Chiedere all'utente di inserire un numero in una posizione specificata
        while (true) {
            try {
                logger.info("Inserisci un numero (0 per uscire): ");
                int numero = scanner.nextInt();
                if (numero == 0) {
                    break;
                }

                int posizione;
                do {
                    logger.info("Inserisci la posizione (da 1 a 5): ");
                    try {
                        posizione = scanner.nextInt();
                        if (posizione < 1 || posizione > 5) {
                            throw new InputMismatchException();
                        }
                    } catch (InputMismatchException e) {
                        logger.error("Errore: inserire una posizione valida.");
                        scanner.next(); // Pulisce il buffer di input
                        continue; // Ripete il loop per richiedere nuovamente la posizione
                    }
                    break; // Esce dal loop una volta che la posizione è stata inserita correttamente
                } while (true);

                array[posizione - 1] = numero;
                // Stampare il nuovo stato dell'array
                logger.info("Nuovo stato dell'array:");
                stampaArray(array);
            } catch (InputMismatchException e) {
                logger.error("Errore: inserire un numero valido.");
                scanner.next(); // Pulisce il buffer di input
            }
        }

        System.out.println("Programma terminato.");
    }


    // Metodo per stampare l'array
    public static void stampaArray(int[] array) {
        for (int num : array) {
            System.out.print( num + " ");
        }
        System.out.println();
    }
}
