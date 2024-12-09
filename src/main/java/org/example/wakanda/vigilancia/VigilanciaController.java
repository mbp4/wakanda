package org.example.wakanda.vigilancia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class VigilanciaController {

    private final VigilanciaService vigilanciaService;

    public VigilanciaController(VigilanciaService vigilanciaService) {
        this.vigilanciaService = vigilanciaService;
    }

    @GetMapping("/camaras")
    public Map<String, String> getCamaraStatus() {
        return vigilanciaService.getCamaraStatus();
    }

    @GetMapping("/drones")
    public Map<String, String> getDronePatrolStatus() {
        return vigilanciaService.getDronePatrolStatus();
    }

}
