package it.nextdevs.EsercizioS3G1.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "dipendenti")
public class Dipendente {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private String avatar;
    private String password;
    @OneToMany(mappedBy = "dipendente")
    private List<Dispositivo> dispositivi;
}
