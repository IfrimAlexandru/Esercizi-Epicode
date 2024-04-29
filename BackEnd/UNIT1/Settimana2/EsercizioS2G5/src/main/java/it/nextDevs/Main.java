package it.nextDevs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        CatalogoBibliotecario catalogo = new CatalogoBibliotecario();
        Riviste rivista1 = new Riviste("SIsbn0001", "Vogue", LocalDate.of(2021, 10, 6),
                57, Periodicita.SEMESTRALE);
        Riviste rivista2 = new Riviste("SIsbn0002", "Forbes", LocalDate.of(2020, 10, 6),
                64, Periodicita.MENSILE);
        Riviste rivista3 = new Riviste("SIsbn0003", "Rolling Stones", LocalDate.of(2019, 10, 6),
                82, Periodicita.SETTIMANALE);

        Libri libro1 = new Libri("LIsbn0004", "Il signore degli anelli", LocalDate.of(2022, 10, 6),
                415, "J.R.R. Tolkien", "Fantasy");
        Libri libro2 = new Libri("LIsbn0005", "Shining", LocalDate.of(2023, 10, 6),
                454, "Stephen King", "Horror");
        Libri libro3 = new Libri("LIsbn0006", "L'assassinio di Roger Ackroyd", LocalDate.of(2018, 10, 6),
                530, "Agatha Christie", "Thriller");

        try {
            catalogo.aggiungiProdotto(rivista1);
            catalogo.aggiungiProdotto(rivista2);
            catalogo.aggiungiProdotto(rivista3);
            catalogo.aggiungiProdotto(libro1);
            catalogo.aggiungiProdotto(libro2);
            catalogo.aggiungiProdotto(libro3);
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        System.out.println(catalogo);

        // Utilizzo dei vari metodi

        Libri libro4 = new Libri("LIsbn0007", "Il guardiano degli innocenti",
                LocalDate.of(2017, 4, 14), 650, "Andrei Sapkowski", "Fantasy");
        try {
            catalogo.aggiungiProdotto(libro4);
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            System.out.println(catalogo.ricercaPerAnnoPubblicazione("2022"));
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            catalogo.cercaPerAutore("J.R.R. Tolkien");
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            System.out.println(catalogo.ricercaPerISBN("LIsbn0006"));
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            catalogo.rimuoviElemento("SIsbn0001");
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        try {
            System.out.println(catalogo.cercaPerAutore("J.R.R. Tolkien"));
        } catch (CatalogoException e) {
            logger.error(e.getMessage());
        }

        // Scrittura del catalogo su file
        scriviCatalogoSuFile(catalogo);
    }

    private static void scriviCatalogoSuFile(CatalogoBibliotecario catalogo) {
        File file = new File("./salvataggio/nuovoFile.txt");

        String stringaCatalogo = catalogo.getCatalogo().values().stream()
                .map(elemento -> {
                    if (elemento instanceof Libri) {
                        return mapLibro((Libri) elemento);
                    } else {
                        return mapRivista((Riviste) elemento);
                    }
                })
                .collect(Collectors.joining("\n")); // Usiamo il carattere di nuova linea come delimitatore

        // Salvataggio su file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(stringaCatalogo);
        } catch (IOException e) {
            logger.error("Errore durante la scrittura su file: " + e.getMessage());
        }
    }

    // Funzione per mappare un libro
    private static String mapLibro(Libri libro) {
        return "Libro: " + libro.getTitolo() +
                ", ISBN: " + libro.getCodiceISBN() +
                ", Anno di pubblicazione: " + libro.getAnnoPubblicazione() +
                ", Numero pagine: " + libro.getNumeroPagine() +
                ", Autore: " + libro.getAutore() +
                ", Genere: " + libro.getGenere();
    }

    // Funzione per mappare una rivista
    private static String mapRivista(Riviste rivista) {
        return  "Rivista: " + rivista.getTitolo() +
                ", ISBN: " + rivista.getCodiceISBN() +
                ", Anno di pubblicazione: " + rivista.getAnnoPubblicazione() +
                ", Numero pagine: " + rivista.getNumeroPagine() +
                ", Periodicità: " + rivista.getPeriodicita();
    }
}



