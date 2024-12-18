package org.example.wakanda.trafico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/trafico")
public class TrafficController {

    private final TrafficService trafficService;

    public TrafficController(TrafficService trafficService) {
        this.trafficService = trafficService;
    }

    @GetMapping("/traffic-status")
    public String getTrafficStatus() {
        return trafficService.getTrafficStatus();
    }

    @GetMapping("/traffic-sensors")
    public Map<String, String> getTrafficSensors() {
        return trafficService.getTrafficSensors();
    }

    @GetMapping("/parking-availability")
    public Map<String, String> getParkingAvailability() {
        return trafficService.getParkingAvailability();
    }

    @GetMapping("/public-transport-routes")
    public Map<String, String> getPublicTransportRoutes() {
        return trafficService.getPublicTransportRoutes();
    }
}
