package mintic.registraduria.app.service;

import mintic.registraduria.app.model.Candidato;
import mintic.registraduria.app.model.Partido;
import mintic.registraduria.app.repository.CandidatoRepository;
import mintic.registraduria.app.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoServiceImp implements CandidatoService {
    @Autowired
    private CandidatoRepository candidatoRepository;

    @Override
    public Candidato crearCandidato(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    @Override
    public Optional<Candidato> findByIdCandidato(int id) {
        return candidatoRepository.findById(id);
    }

    @Override
    public boolean deleteByIdCandidato(int id) {
        if(candidatoRepository.existsById(id)){
            candidatoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Candidato updateByIdCandidato(int id, Candidato candidato) {
        Candidato candidato1 = null;
        if(candidatoRepository.existsById(id)){
            candidato1 = candidatoRepository.findById(id).get();
            candidato1.update(candidato);
            candidatoRepository.save(candidato1);
        }

        return candidato1;
    }

    @Override
    public List<Candidato> findAllCandidato() {
        return (List<Candidato>) candidatoRepository.findAll();
    }
}
