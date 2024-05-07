package nextdevs.entity;
@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany(mappedBy = "persona", fetch = FetchType.EAGER)
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private GestioneEventi evento;;
    private Stato stato;
    public Partecipazione(int id, Persona persona, Stato stato, GestioneEventi evento) {
        this.id = id;
        this.persona = persona;
        this.stato = stato;
        this.evento = evento;
    }
    public Partecipazione () {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {

    }
