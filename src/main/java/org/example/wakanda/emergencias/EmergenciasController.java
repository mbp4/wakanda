package org.example.wakanda.emergencias;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/emergencias")
public class EmergenciasController {

    private final EmergenciasService emergenciasService; // Campo final para asegurar inmutabilidad.

    //contrurctorr
    public EmergenciasController(EmergenciasService emergenciasService) {
        this.emergenciasService = emergenciasService;
    }

    //registrar emergencia
    @PostMapping
    public ResponseEntity<Emergencia> registrarEmergencia(@RequestBody Emergencia emergencia) {
        Emergencia nuevaEmergencia = emergenciasService.registrarEmergencia(emergencia);
        return ResponseEntity.ok(nuevaEmergencia);
    }

    //obtener todas las emergencias
    @GetMapping
    public ResponseEntity<List<Emergencia>> obtenerEmergencias() {
        return ResponseEntity.ok(emergenciasService.obtenerEmergencias());
    }


    @PatchMapping("/{id}/resolver")
    public ResponseEntity<Emergencia> resolverEmergencia(@PathVariable Long id) {
        Optional<Emergencia> emergenciaResuelta = emergenciasService.resolverEmergencia(id);
        return emergenciaResuelta.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

