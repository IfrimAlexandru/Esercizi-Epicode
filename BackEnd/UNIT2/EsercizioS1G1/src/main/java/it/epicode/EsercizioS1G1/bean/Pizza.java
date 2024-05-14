package it.epicode.EsercizioS1G1.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Pizza extends VoceDiMenu {
    private String nome;
    private List<Topping> toppings;


}
