package it.epicode.EsercizioS1G3.bean;

import it.epicode.EsercizioS1G3.enumerators.StatoOrdine;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Ordine {
    private Integer numeroOrdine;
    private StatoOrdine statoOrdine;
    private Integer numeroCoperti;
    private LocalDateTime dataAcquisizione;
    private Tavolo tavolo;
    private List<Bevanda> bevande;
    private List<Topping> toppings;
    private List<Pizza> pizze;

    public double costoTotale() {
        double totale = bevande.stream().mapToDouble(Bevanda::getPrezzo).sum();
        totale += toppings.stream().mapToDouble(Topping::getPrezzo).sum();
        totale += pizze.stream().mapToDouble(Pizza::getPrezzo).sum();
        totale += tavolo.getCoperto()*numeroCoperti;
        return totale;
    }

    public Ordine(Integer numeroCoperti, Tavolo tavolo) throws Exception {
        if(numeroCoperti <= tavolo.getMaxCoperti()){
            this.numeroCoperti = numeroCoperti;
            this.tavolo = tavolo;
        } else {
            throw new Exception("Numero coperti superiore ai coperti dei tavolo");
        }
    }

    public void stampaOrdine() {
        System.out.println();
        System.out.println("------Ordine n°" + numeroOrdine + "------");
        System.out.println();
        System.out.println("------Bevande------");
        bevande.forEach(bevanda -> System.out.println(bevanda.getNome() +" ml: "+ bevanda.getMl() + " kcal: "
                + bevanda.getCalorie() + " prezzo: " + bevanda.getPrezzo()));
        System.out.println();
        System.out.println("------Ingredienti------");
        System.out.println();
        toppings.forEach(ingrediente -> System.out.println(ingrediente.getNome() + " kcal: " + ingrediente.getCalorie()
        + " prezzo: " + ingrediente.getPrezzo()));
        System.out.println();
        System.out.println("------Pizze------");
        System.out.println();
        pizze.forEach(pizza -> System.out.println(pizza.getNome() + " kcal: " + pizza.getCalorie()
                + " prezzo: " + pizza.getPrezzo()));
        System.out.println();
        System.out.println("Costo totale: " + costoTotale());
    }
}
