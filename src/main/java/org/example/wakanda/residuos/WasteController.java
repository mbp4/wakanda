package org.example.wakanda.residuos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WasteController {

    private final WasteService wasteService;

    public WasteController(WasteService wasteService) {
        this.wasteService = wasteService;
    }

    @GetMapping("/waste-management")
    public String getWasteManagementStatus() {
        return wasteService.getWasteManagementStatus();
    }
}
