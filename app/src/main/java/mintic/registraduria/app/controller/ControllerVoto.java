package mintic.registraduria.app.controller;

import mintic.registraduria.app.model.Mesa;
import mintic.registraduria.app.model.Voto;
import mintic.registraduria.app.service.MesaService;
import mintic.registraduria.app.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping( "/v1/voto" )
public class ControllerVoto {

    @Autowired
    private VotoService votoService;

    @GetMapping
    public ResponseEntity<List<Voto>> all()
    {
        return ResponseEntity.ok( votoService.findAllVoto());
    }

    @PostMapping("/crear")
    public ResponseEntity<Voto> crearVoto(@RequestBody Voto voto){
        return ResponseEntity.ok(votoService.crearVoto( voto));
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Optional<Voto>> findByVoto(@PathVariable int id ){
        return ResponseEntity.ok(votoService.findByIdVoto(id));

    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> deleteVoto(@PathVariable int id ){
        return ResponseEntity.ok(votoService.deleteByIdVoto(id));
    }

}
