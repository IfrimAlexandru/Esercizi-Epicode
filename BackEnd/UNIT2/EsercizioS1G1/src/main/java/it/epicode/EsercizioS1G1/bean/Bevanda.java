package it.epicode.EsercizioS1G1.bean;

import lombok.Data;

@Data
public class Bevanda extends VoceDiMenu {
    private String nome;
    private Integer ml;
    private double gradoAlcohol;

}
