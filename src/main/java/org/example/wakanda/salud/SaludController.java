package org.example.wakanda.salud;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salud")
public class SaludController {

    private final SaludService saludService;

    public SaludController(SaludService saludService) {
        this.saludService = saludService;
    }


    @PostMapping("/dispositivos")
    public ResponseEntity<DispositivoSalud> registrarDispositivo(@RequestBody DispositivoSalud dispositivo) {
        DispositivoSalud nuevoDispositivo = saludService.registrarDispositivo(dispositivo);
        return ResponseEntity.ok(nuevoDispositivo);
    }


    @GetMapping("/dispositivos")
    public ResponseEntity<List<DispositivoSalud>> obtenerDispositivos() {
        return ResponseEntity.ok(saludService.obtenerDispositivos());
    }


    @GetMapping("/dispositivos/{id}")
    public ResponseEntity<DispositivoSalud> obtenerDispositivo(@PathVariable Long id) {
        Optional<DispositivoSalud> dispositivo = saludService.obtenerDispositivo(id);
        return dispositivo.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}