package it.nextDevs;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class Main {
    static Logger logger = LoggerFactory.getLogger("logger");
    public static void main(String[] args) {
        CatalogoBibliotecario catalogo = new CatalogoBibliotecario();
        Riviste rivista1 = new Riviste("SIsbn0001", "Vogue", LocalDate.of(2021,10,6),
                57, Periodicita.SEMESTRALE);
        Riviste rivista2 = new Riviste("SIsbn0002", "Forbes", LocalDate.of(2020,10,6),
                64, Periodicita.MENSILE);
        Riviste rivista3 = new Riviste("SIsbn0003", "Rolling Stones", LocalDate.of(2019,10,6),
                82, Periodicita.SETTIMANALE);


        Libri libro1 = new Libri("LIsbn0004", "Il signore degli anelli", LocalDate.of(2022,10,6),
                415,
                "J.R.R. Tolkien", "Fantasy");
        Libri libro2 = new Libri("LIsbn0005", "Shining", LocalDate.of(2023,10,6),
                454,
                "Stephen King", "Horror");
        Libri libro3 = new Libri("LIsbn0006", "L'assassinio di Roger Ackroyd", LocalDate.of(2018,10,
                6),
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

        // Qui ho fatto varie prove per vedere il funzionamento dei metodi e delle eccezioni

        Libri libro4 = new Libri("LIsbn0007", "Il guardiano degli innocenti",
                LocalDate.of(2017,4,14), 650, "Andrei Sapkowski", "Fantasy");
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

        String stringaCatalogo = catalogo.getCatalogo().values().stream().map(elemento -> {
            if (elemento instanceof Libri) {
                return "Libro" + "@" + elemento.getCodiceISBN() + "@" + elemento.getTitolo() + "@" + elemento.getAnnoPubblicazione()
                        + "@" + elemento.getNumeroPagine() + "@" + ((Libri) elemento).getAutore() + "@" + ((Libri) elemento).getGenere();
            } else {
                return "Rivista" + "@" + elemento.getCodiceISBN() + "@" + elemento.getTitolo() + "@" + elemento.getAnnoPubblicazione()
                        + "@" + elemento.getNumeroPagine() + "@" + ((Riviste) elemento).getPeriodicita();
            }
        }).collect(Collectors.joining("#"));


        File file = new File("./salvataggio/nuovoFile.txt");

        try {
            FileUtils.writeStringToFile(file, stringaCatalogo, Charset.defaultCharset());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        // Lettura del catalogo da file

        try {
            String contenutoFile = FileUtils.readFileToString(file, Charset.defaultCharset());

            String[] prodottiStringa = contenutoFile.split("#");

            for (String prodottoStringa : prodottiStringa) {
                String[] attributi = prodottoStringa.split("@");


                    if (attributi[0].equals("Libro")) {

                        Libri libro = new Libri(attributi[1], attributi[2], LocalDate.parse(attributi[3]),
                                Integer.parseInt(attributi[4]), attributi[5], attributi[6]);
                        catalogo.aggiungiProdotto(libro);
                    } else if (attributi[0].equals("Rivista")) {

                        Riviste rivista = new Riviste(attributi[1], attributi[2], LocalDate.parse(attributi[3]),
                                Integer.parseInt(attributi[4]), Periodicita.valueOf(attributi[5]));
                        catalogo.aggiungiProdotto(rivista);
                    }
                }

        } catch (IOException | CatalogoException e) {
            logger.error(e.getMessage());
        }

        System.out.println(catalogo);
    }
}


