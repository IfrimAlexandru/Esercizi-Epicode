package it.epicode.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Esercizio1 {
    static Logger logger = LoggerFactory.getLogger("logger1");
    public static void main(String[] args) {
        logger.info("Sto lanciando l'applicazione");
        Scanner scanner = new Scanner(System.in);
        //ESERCIZIO #1
        System.out.println("Scrivi una parola");
        String stringa = scanner.nextLine();

        boolean pari = pariODispari(stringa);
        System.out.println("La lunghezza della stringa è un numero pari? " + pari);

        //ESERCIZIO #2
        System.out.println("Inserisci l'anno");
        int anno = scanner.nextInt();
        boolean bisestile = annoBisestile(anno);
        System.out.println("L'anno inserito è bisestile? " + bisestile );
        logger.info("Sto terminando l'applicazione");
    }

    public static Boolean pariODispari(String stringa){
        int lunghezza = stringa.length();
        if (lunghezza % 2 == 0) {
            return true;
        } else {
            return false;
        }
    };

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 4 == 0 && anno % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

}