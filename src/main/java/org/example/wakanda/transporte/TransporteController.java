package org.example.wakanda.transporte;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transporte")
public class TransporteController {

    private final TransporteService transporteService;

    public TransporteController(TransporteService transporteService) {
        this.transporteService = transporteService;
    }


    @PostMapping("/rutas")
    public ResponseEntity<Ruta> registrarRuta(@RequestBody Ruta ruta) {
        Ruta nuevaRuta = transporteService.registrarRuta(ruta);
        return ResponseEntity.ok(nuevaRuta);
    }


    @GetMapping("/rutas")
    public ResponseEntity<List<Ruta>> obtenerRutas() {
        return ResponseEntity.ok(transporteService.obtenerRutas());
    }


    @GetMapping("/rutas/{id}")
    public ResponseEntity<Ruta> obtenerRuta(@PathVariable Long id) {
        Optional<Ruta> ruta = transporteService.obtenerRuta(id);
        return ruta.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}