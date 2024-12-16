package org.example.wakanda.luz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/luz")
public class LuzController {

    private final LuzService luzService;

    public LuzController(LuzService luzService) {
        this.luzService = luzService;
    }

    @GetMapping("/publica")
    public Map<String, String> getIluminacionPublica() {
        return luzService.getIluminacionPublica();
    }

    @GetMapping("/smart-grid")
    public Map<String, String> getSmartGridStatus() {
        return luzService.getSmartGridStatus();
    }
}
