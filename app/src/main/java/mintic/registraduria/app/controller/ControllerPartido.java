package mintic.registraduria.app.controller;

import mintic.registraduria.app.model.Partido;
import mintic.registraduria.app.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping( "/v1/partido" )
public class ControllerPartido {

    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public ResponseEntity<List<Partido>> all()
    {
        return ResponseEntity.ok( partidoService.findAllPartido() );
    }

    @PostMapping("/crear")
    public ResponseEntity<Partido> crearPartido(@RequestBody Partido partido){
        return ResponseEntity.ok(partidoService.crearPartido( partido));
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Optional<Partido>> findByPartido(@PathVariable int id ){
        return ResponseEntity.ok(partidoService.findByIdPartido(id));

    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> deletePartido(@PathVariable int id ){
        return ResponseEntity.ok(partidoService.deleteByIdPartido(id));
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Partido> updatePartido(@RequestBody Partido partido, @PathVariable int id){
        return ResponseEntity.ok(partidoService.updateByIdPartido(id,partido));
    }



}
