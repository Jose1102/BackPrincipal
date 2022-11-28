package mintic.registraduria.app.service;

import mintic.registraduria.app.model.Partido;
import mintic.registraduria.app.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PartidoServiceImp implements PartidoService{

    @Autowired
    private PartidoRepository partidoRepository;



    @Override
    public Partido crearPartido(Partido partido) {
        return partidoRepository.save(partido);
    }

    @Override
    public Optional<Partido> findByIdPartido(int id) {

        return partidoRepository.findById(id);
    }


    @Override
    public boolean deleteByIdPartido(int id) {
        if(partidoRepository.existsById(id)){
            partidoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Partido updateByIdPartido(int id,Partido partido) {

        Partido partido1 = null;
        if(partidoRepository.existsById(id)){
            partido1 = partidoRepository.findById(id).get();
            partido1.update(partido);
            partidoRepository.save(partido1);
        }

        return partido1;
    }

    public List<Partido> findAllPartido() {
        return (List<Partido>) partidoRepository.findAll();
    }
}
