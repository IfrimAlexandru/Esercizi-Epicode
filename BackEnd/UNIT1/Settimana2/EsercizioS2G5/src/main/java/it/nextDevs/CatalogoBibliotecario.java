package it.nextDevs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoBibliotecario {
    private HashMap<String, ProdottoCatalogo> catalogo;

    public HashMap<String, ProdottoCatalogo> getCatalogo() {
        return catalogo;
    }

    public  CatalogoBibliotecario(){
        this.catalogo = new HashMap<>();
    }

    public void aggiungiProdotto(ProdottoCatalogo prodotto ) throws CatalogoException {
       if (catalogo.containsKey(prodotto.getCodiceISBN())) {
           throw new CatalogoException("Codice ISBN già presente");
       }else {
           catalogo.put(prodotto.getCodiceISBN(), prodotto);
       }
    }

    public void rimuoviElemento(String codiceISBN)throws CatalogoException {
        if (catalogo.remove(codiceISBN)== null){
            throw new CatalogoException("Codice ISBN non trovato");
        } else {
            catalogo.remove(codiceISBN);
        }
    }

    public ProdottoCatalogo ricercaPerISBN(String codiceISBN) throws CatalogoException {
        if (catalogo.get(codiceISBN)==null){
            throw new CatalogoException("Nessun prodotto trovato");
        } else {
            return catalogo.get(codiceISBN);
        }
    }

    public List<ProdottoCatalogo> ricercaPerAnnoPubblicazione(String anno) throws CatalogoException {
        List<ProdottoCatalogo> prodotti = catalogo.values().stream().filter(prodotto ->
                prodotto.getAnnoPubblicazione().equals(anno)).toList();
        if (prodotti.isEmpty()){
            throw new CatalogoException("Nessun prodotto trovato nell'anno fornito");
        } else {
            return prodotti;
        }

    }

    public List<ProdottoCatalogo> cercaPerAutore(String autore) throws CatalogoException{
        List<ProdottoCatalogo> prodotti = catalogo.values().stream().filter(prodotto->prodotto instanceof
                Libri && ((Libri) prodotto).getAutore().equals(autore)).collect(Collectors.toList());
        if(prodotti.isEmpty()){
            throw new CatalogoException("Non è stato trovato nessun libro relativo all'autore fornito.");
        } else {
            return prodotti;
        }
    }

    @Override
    public String toString() {
        return "CatalogoBibliotecario{" +
                "catalogo=" + catalogo +
                '}';
    }
}
