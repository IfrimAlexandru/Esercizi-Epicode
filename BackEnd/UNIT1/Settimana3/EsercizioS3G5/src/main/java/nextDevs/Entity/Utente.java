package nextDevs.Entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "utenti")
public class Utente {
    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private String cognome;
    @Column(name = "data_di_nascita")
    private LocalDate dataNascita;
    @Column(name = "numero_di_tessera")
    private Integer numeroDiTessera;

    public Utente(String nome, String cognome, LocalDate dataNascita, Integer numeroDiTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.numeroDiTessera = numeroDiTessera;
    }

    public Utente(){

    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Integer getNumeroDiTessera() {
        return numeroDiTessera;
    }

    public void setNumeroDiTessera(Integer numeroDiTessera) {
        this.numeroDiTessera = numeroDiTessera;
    }

    @Override
    public String toString() {
        return
                "Nome: '" + nome + '\'' +
                ", Cognome: '" + cognome + '\'';
    }
}
