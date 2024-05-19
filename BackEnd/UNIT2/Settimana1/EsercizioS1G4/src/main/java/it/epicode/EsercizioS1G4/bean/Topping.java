package it.epicode.EsercizioS1G4.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Topping extends VoceDiMenu {
    private String nome;
    @ManyToMany(mappedBy = "toppings", fetch = FetchType.EAGER)
    private List<Pizza> pizze;


    @Override
    public String toString() {
        return "Topping{" +
                super.toString() +
                "nome='" + nome + '\'' +
                '}';
    }
}
