package org.example.wakanda.agua;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agua")
public class AguaController {

    private final AguaService aguaService;

    public AguaController(AguaService aguaService) {
        this.aguaService = aguaService;
    }

    //registrar un sensor de agua
    @PostMapping("/sensores")
    public ResponseEntity<SensorAgua> registrarSensor(@RequestBody SensorAgua sensor) {
        SensorAgua nuevoSensor = aguaService.registrarSensor(sensor);
        return ResponseEntity.ok(nuevoSensor);
    }

    //oobtener todos los sensores
    @GetMapping("/sensores")
    public ResponseEntity<List<SensorAgua>> obtenerSensores() {
        return ResponseEntity.ok(aguaService.obtenerSensores());
    }

    //obtener un sensor por ID
    @GetMapping("/sensores/{id}")
    public ResponseEntity<SensorAgua> obtenerSensor(@PathVariable Long id) {
        Optional<SensorAgua> sensor = aguaService.obtenerSensor(id);
        return sensor.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}