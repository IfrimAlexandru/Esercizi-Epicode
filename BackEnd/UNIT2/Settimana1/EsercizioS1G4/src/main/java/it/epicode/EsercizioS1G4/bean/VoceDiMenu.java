package it.epicode.EsercizioS1G4.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class VoceDiMenu {
    @Id
    @GeneratedValue
    private int id;
    private Integer calorie;
    private double prezzo;
}
