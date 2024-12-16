package org.example.wakanda.ocio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/ocio")
public class OcioController {
    private final OcioService ocioService;

    public OcioController(OcioService ocioService) {
        this.ocioService = ocioService;
    }

    @GetMapping("/eventos")
    public Map<String, String> getEventosCulturales() {
        return ocioService.getEventosCulturales();
    }

    @GetMapping("/espacios")
    public Map<String, String> getEspaciosCulturalesStatus() {
        return ocioService.getEspaciosCulturalesStatus();
    }
}
