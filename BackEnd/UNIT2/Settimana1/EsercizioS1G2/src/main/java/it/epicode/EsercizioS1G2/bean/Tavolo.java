package it.epicode.EsercizioS1G2.bean;

import it.epicode.EsercizioS1G2.enumerators.StatoTavolo;
import lombok.Data;

@Data
public class Tavolo {
    private Integer numero;
    private StatoTavolo statoTavolo;
    private Integer maxCoperti;
    private double coperto;
}
