package mintic.registraduria.app.service;

import mintic.registraduria.app.model.Mesa;
import mintic.registraduria.app.model.Voto;
import mintic.registraduria.app.repository.MesaRepository;
import mintic.registraduria.app.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VotoServiceImp implements VotoService{

    @Autowired
    private VotoRepository votoRepository;

    @Override
    public Voto crearVoto(Voto voto) {
        return votoRepository.save(voto);
    }

    @Override
    public Optional<Voto> findByIdVoto(int id) {
        return votoRepository.findById(id);
    }

    @Override
    public boolean deleteByIdVoto(int id) {
        if(votoRepository.existsById(id)){
            votoRepository.deleteById(id);
            return true;
        }
        return false;
    }


    @Override
    public List<Voto> findAllVoto() {
        return (List<Voto>) votoRepository.findAll();
    }
}
