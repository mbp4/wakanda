package org.example.wakanda.residuos;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/waste")
public class WasteController {

    private final WasteService wasteService;

    public WasteController(WasteService wasteService) {
        this.wasteService = wasteService;
    }

    @GetMapping("/bins")
    public Map<String, String> getBinSensors() {
        return wasteService.getBinSensors();
    }

    @GetMapping("/recycling-centers")
    public Map<String, String> getRecyclingCenters() {
        return wasteService.getRecyclingCenters();
    }

    @GetMapping("/classify/{type}")
    public String classifyWaste(@PathVariable("type") String wasteType) {
        return wasteService.classifyWaste(wasteType);
    }
}
