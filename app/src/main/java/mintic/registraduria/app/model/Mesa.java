package mintic.registraduria.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = " mesa")
public class Mesa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMesa;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "mesa")
    @JsonIgnoreProperties("mesa")
    private List<Voto> votos;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "mesa")
    @JsonIgnoreProperties("mesa")
    private List<Partido> partidos;

    @Column(name= "numeroMesa",nullable=false,unique=true,length=50 )
    private int numeroMesa;

    public void update(Mesa mesa) {
        numeroMesa = mesa.getNumeroMesa();

    }

    public Integer getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
}
