package org.example.wakanda.wifi;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/wifi")
public class WifiController {

    private final WifiService wifiService;

    public WifiController(WifiService wifiService) {
        this.wifiService = wifiService;
    }

    @GetMapping("/public-wifi")
    public Map<String, String> getPublicWifi() {
        return wifiService.getPublicWifi();
    }

    @GetMapping("/iot-sensors")
    public Map<String, String> getIoTSensors() {
        return wifiService.getIoTSensors();
    }

    @GetMapping("/open-data")
    public Map<String, String> getOpenDataPlatforms() {
        return wifiService.getOpenDataPlatforms();
    }
}
