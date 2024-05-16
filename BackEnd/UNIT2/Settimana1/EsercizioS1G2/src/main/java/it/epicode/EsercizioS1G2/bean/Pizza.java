package it.epicode.EsercizioS1G2.bean;

import lombok.Data;

import java.util.List;

@Data
public class Pizza extends VoceDiMenu {
    private String nome;
    private List<Topping> toppings;
    private boolean xl;


}
