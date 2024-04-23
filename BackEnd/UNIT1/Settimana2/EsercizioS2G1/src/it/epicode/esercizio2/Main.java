package it.epicode.esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static Logger logger = LoggerFactory.getLogger("logger2");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Richiesta all'utente del numero di km percorsi
            logger.info("Inserisci il numero di km percorsi: ");
            double kmPercorsi = scanner.nextDouble();

            // Richiesta all'utente dei litri di carburante consumati
            logger.info("Inserisci i litri di carburante consumati: ");
            double litriConsumati = scanner.nextDouble();

            // Calcolo dei km/litro
            double kmPerLitro = calcolaKmPerLitro(kmPercorsi, litriConsumati);

            // Stampare il risultato
            System.out.println("Il consumo di carburante è di " + kmPerLitro + " km/litro.");
        } catch (InputMismatchException e) {
            logger.error("Errore: inserire un numero valido.");
        } catch (ArithmeticException e) {
            logger.error("Errore: impossibile dividere per zero. Assicurati di inserire un valore diverso da zero per i litri consumati.");
        }
    }

    // Metodo per calcolare i km/litro
    public static double calcolaKmPerLitro(double kmPercorsi, double litriConsumati) {
        if (litriConsumati == 0) {
            throw new ArithmeticException();
        }
        return kmPercorsi / litriConsumati;
    }
}
