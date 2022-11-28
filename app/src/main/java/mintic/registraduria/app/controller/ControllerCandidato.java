package mintic.registraduria.app.controller;

import mintic.registraduria.app.model.Candidato;
import mintic.registraduria.app.model.Partido;
import mintic.registraduria.app.service.CandidatoService;
import mintic.registraduria.app.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( "/v1/candidato" )
public class ControllerCandidato {

    @Autowired
    private CandidatoService candidatoService;

    @GetMapping
    public ResponseEntity<List<Candidato>> all()
    {
        return ResponseEntity.ok( candidatoService.findAllCandidato() );
    }

    @PostMapping("/crear")
    public ResponseEntity<Candidato> crearCandidato(@RequestBody Candidato candidato){
        return ResponseEntity.ok(candidatoService.crearCandidato( candidato));
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Optional<Candidato>> findByCandidato(@PathVariable int id ){
        return ResponseEntity.ok(candidatoService.findByIdCandidato(id));

    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> deleteCandidato(@PathVariable int id ){
        return ResponseEntity.ok(candidatoService.deleteByIdCandidato(id));
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Candidato> updateCandidato(@RequestBody Candidato candidato, @PathVariable int id){
        return ResponseEntity.ok(candidatoService.updateByIdCandidato(id,candidato));
    }
}
