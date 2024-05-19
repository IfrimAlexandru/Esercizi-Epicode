package it.nextdevs.EsercizioS1G5.bean;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
public class Prenotazione {

@Id
@GeneratedValue
private Integer id;

@ManyToOne
@JoinColumn(name="postazione_id")
private Postazione postazione;

@ManyToOne
@JoinColumn(name="utente_username")
private Utente utente;

private LocalDate data;
}
