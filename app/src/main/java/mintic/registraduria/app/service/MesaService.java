package mintic.registraduria.app.service;

import mintic.registraduria.app.model.Candidato;
import mintic.registraduria.app.model.Mesa;

import java.util.List;
import java.util.Optional;

public interface MesaService {

    Mesa crearMesa(Mesa mesa);

    Optional<Mesa> findByIdMesa(int id);

    boolean deleteByIdMesa(int id);


    Mesa updateByIdMesa(int id, Mesa mesa);

    List<Mesa> findAllMesa();
}
