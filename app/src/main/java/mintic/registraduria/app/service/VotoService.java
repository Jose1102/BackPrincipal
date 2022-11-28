package mintic.registraduria.app.service;

import mintic.registraduria.app.model.Partido;
import mintic.registraduria.app.model.Voto;

import java.util.List;
import java.util.Optional;

public interface VotoService {

    Voto crearVoto(Voto voto);

    Optional<Voto> findByIdVoto(int id);

    boolean deleteByIdVoto(int id);




    List<Voto> findAllVoto();
}
