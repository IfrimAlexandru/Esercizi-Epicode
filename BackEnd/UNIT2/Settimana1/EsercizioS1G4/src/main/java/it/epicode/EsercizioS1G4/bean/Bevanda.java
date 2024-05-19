package it.epicode.EsercizioS1G4.bean;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Bevanda extends VoceDiMenu {
    private String nome;
    private Integer ml;
    private double gradoAlcohol;

}
