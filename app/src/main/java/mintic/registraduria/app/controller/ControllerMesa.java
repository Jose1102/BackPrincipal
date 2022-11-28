package mintic.registraduria.app.controller;

import mintic.registraduria.app.model.Candidato;
import mintic.registraduria.app.model.Mesa;
import mintic.registraduria.app.service.CandidatoService;
import mintic.registraduria.app.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping( "/v1/mesa" )
public class ControllerMesa {

    @Autowired
    private MesaService mesaService;

    @GetMapping
    public ResponseEntity<List<Mesa>> all()
    {
        return ResponseEntity.ok( mesaService.findAllMesa() );
    }

    @PostMapping("/crear")
    public ResponseEntity<Mesa> crearMesa(@RequestBody Mesa mesa){
        return ResponseEntity.ok(mesaService.crearMesa( mesa));
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<Optional<Mesa>> findByMesa(@PathVariable int id ){
        return ResponseEntity.ok(mesaService.findByIdMesa(id));

    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> deleteMesa(@PathVariable int id ){
        return ResponseEntity.ok(mesaService.deleteByIdMesa(id));
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<Mesa> updateMesa(@RequestBody Mesa mesa, @PathVariable int id){
        return ResponseEntity.ok(mesaService.updateByIdMesa(id,mesa));
    }
}
