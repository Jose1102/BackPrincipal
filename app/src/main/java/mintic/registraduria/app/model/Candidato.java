package mintic.registraduria.app.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = " candidato")
public class Candidato implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCandidato;

    @ManyToOne
    @JoinColumn(name="partido_id", nullable=false)
    private Partido partido;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "candidato")
    @JsonIgnoreProperties("candidato")
    private List<Voto> votos;


    @Column(name="nombre", nullable=false,unique=true)
    private String nombre;

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void update(Candidato candidato) {
        nombre = candidato.getNombre();

    }
}
