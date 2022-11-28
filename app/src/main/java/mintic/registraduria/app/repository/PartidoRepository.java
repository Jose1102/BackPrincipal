package mintic.registraduria.app.repository;

import mintic.registraduria.app.model.Partido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository  extends CrudRepository<Partido, Integer> {
}
