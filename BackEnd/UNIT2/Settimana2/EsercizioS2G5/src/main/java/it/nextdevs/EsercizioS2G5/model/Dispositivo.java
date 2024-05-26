package it.nextdevs.EsercizioS2G5.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import it.nextdevs.EsercizioS2G5.enums.StatoDispositivo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "dispositivi")
public class Dispositivo {
    @Id
    @GeneratedValue
    private Integer id;
    private String model;
    private String tipoDispositivo;
    private StatoDispositivo statoDispositivo;
    @ManyToOne
    @JoinColumn(name = "dipendente_id")
    @JsonIgnore
    private Dipendente dipendente;
}
