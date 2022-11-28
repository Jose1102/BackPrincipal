package mintic.registraduria.app.service;

import mintic.registraduria.app.model.Candidato;

import java.util.List;
import java.util.Optional;

public interface CandidatoService {
    Candidato crearCandidato(Candidato candidato);

    Optional<Candidato> findByIdCandidato(int id);

    boolean deleteByIdCandidato(int id);


    Candidato updateByIdCandidato(int id, Candidato candidato);

    List<Candidato> findAllCandidato();
}
