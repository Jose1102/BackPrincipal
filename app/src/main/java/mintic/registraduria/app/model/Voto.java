package mintic.registraduria.app.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = " voto")
public class Voto  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVoto;

    @ManyToOne
    @JoinColumn(name="candidato_id", nullable=false)
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name="mesa_id", nullable=false)
    private Mesa mesa;

    public Integer getIdVoto() {
        return idVoto;
    }

    public void setIdVoto(Integer idVoto) {
        this.idVoto = idVoto;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }



}
