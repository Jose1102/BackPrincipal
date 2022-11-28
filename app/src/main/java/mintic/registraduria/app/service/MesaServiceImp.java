package mintic.registraduria.app.service;

import mintic.registraduria.app.model.Candidato;
import mintic.registraduria.app.model.Mesa;
import mintic.registraduria.app.repository.CandidatoRepository;
import mintic.registraduria.app.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MesaServiceImp implements MesaService {
    @Autowired
    private MesaRepository mesaRepository;

    @Override
    public Mesa crearMesa(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    @Override
    public Optional<Mesa> findByIdMesa(int id) {
        return mesaRepository.findById(id);
    }

    @Override
    public boolean deleteByIdMesa(int id) {
        if(mesaRepository.existsById(id)){
            mesaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Mesa updateByIdMesa(int id, Mesa mesa) {
        Mesa mesa1 = null;
        if(mesaRepository.existsById(id)){
            mesa1 = mesaRepository.findById(id).get();
            mesa1.update(mesa);
            mesaRepository.save(mesa1);
        }

        return mesa1;
    }

    @Override
    public List<Mesa> findAllMesa() {
        return (List<Mesa>) mesaRepository.findAll();
    }
}
