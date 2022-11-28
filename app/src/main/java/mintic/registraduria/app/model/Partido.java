package mintic.registraduria.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "partido")
public class Partido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombre", nullable=false,unique=true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name="mesa_id", nullable=false)
    private Mesa mesa;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "partido")
    @JsonIgnoreProperties("partido")
    private List<Candidato> candidatos;

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void update(Partido partido) {
        nombre = partido.getNombre();

    }

}

