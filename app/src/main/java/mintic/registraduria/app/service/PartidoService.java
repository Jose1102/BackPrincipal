package mintic.registraduria.app.service;

import mintic.registraduria.app.model.Partido;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface PartidoService {

    Partido crearPartido(Partido partido);

    Optional<Partido> findByIdPartido(int id);

    boolean deleteByIdPartido(int id);


    Partido updateByIdPartido(int id, Partido partido);

    List<Partido> findAllPartido();
}
