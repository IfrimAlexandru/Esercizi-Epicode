package it.epicode.EsercizioS1G1.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
public class Menu {
    private List<Pizza> pizze;
    private List<Bevanda> bevande;
    private List<Topping> toppings;

    public void stampaMenu(){
        System.out.println("Menu");
        System.out.println();
        System.out.println("******Bevande******");
        System.out.println();
        bevande.forEach(bevanda -> System.out.println(bevanda.getNome() +" ml: "+ bevanda.getMl() + " kcal: "
                + bevanda.getCalorie() + " prezzo: " + bevanda.getPrezzo()));
        System.out.println();
        System.out.println("******Ingredienti******");
        System.out.println();
        toppings.forEach(ingrediente -> System.out.println(ingrediente.getNome() + " kcal: " + ingrediente.getCalorie()
        + " prezzo: " + ingrediente.getPrezzo()));
        System.out.println();
        System.out.println("******Pizze******");
        System.out.println();
        pizze.forEach(pizza -> System.out.println(pizza.getNome() + " kcal: " + pizza.getCalorie() + " prezzo: " + pizza.getPrezzo()));
    }
}
