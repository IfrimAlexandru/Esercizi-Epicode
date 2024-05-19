package it.epicode.EsercizioS1G4.bean;

import jakarta.persistence.*;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString(callSuper = true)
@Entity
public class Pizza extends VoceDiMenu {
    private String nome;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="pizza_toppings",
            joinColumns = @JoinColumn(name="pizza_id"),
            inverseJoinColumns = @JoinColumn(name="ingrediente_id"))
    private List<Topping> toppings;
    private boolean xl;


}
