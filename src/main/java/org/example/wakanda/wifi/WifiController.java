package org.example.wakanda.wifi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WifiController {

    private final WifiService wifiService;

    public WifiController(WifiService wifiService) {
        this.wifiService = wifiService;
    }

    @GetMapping("/wifi-status")
    public String getWifiStatus() {
        return wifiService.getWifiStatus();
    }
}
