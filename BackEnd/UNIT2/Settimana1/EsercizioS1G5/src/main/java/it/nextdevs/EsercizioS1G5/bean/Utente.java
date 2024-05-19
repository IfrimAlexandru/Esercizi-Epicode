package it.nextdevs.EsercizioS1G5.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Utente {

    @Id
    private String username;

    private String nomeCognome;



    private String mail;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioni;

    @Override
    public String toString() {
        return "Utente{" +
                ", nomeCognome='" + nomeCognome + '\'' +
                ", username='" + username + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
