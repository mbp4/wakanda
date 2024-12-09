package org.example.wakanda.gobierno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/gobierno")
public class GobiernoController {

    private final GobiernoService gobiernoService;

    public GobiernoController(GobiernoService gobiernoService) {
        this.gobiernoService = gobiernoService;
    }

    @GetMapping("/proyectos")
    public Map<String, String> getTransparenciaData() {
        return gobiernoService.getProyectosData();
    }

    @GetMapping("/tramites")
    public Map<String, String> getOnlineServicesStatus() {
        return gobiernoService.getOnlineServicesStatus();
    }
}
