package it.epicode.EsercizioS1G3.bean;

import it.epicode.EsercizioS1G3.enumerators.StatoTavolo;
import lombok.Data;

@Data
public class Tavolo {
    private Integer numero;
    private StatoTavolo statoTavolo;
    private Integer maxCoperti;
    private double coperto;
}
