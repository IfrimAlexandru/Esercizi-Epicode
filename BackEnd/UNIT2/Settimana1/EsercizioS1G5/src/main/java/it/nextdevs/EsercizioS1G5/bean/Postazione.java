package it.nextdevs.EsercizioS1G5.bean;

import it.nextdevs.EsercizioS1G5.enumerators.TipoPostazione;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Postazione {

    @Id
    @GeneratedValue
    private Integer id;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    private Integer numeroMaxPartecipanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
}
