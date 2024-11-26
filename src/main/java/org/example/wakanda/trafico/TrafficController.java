package org.example.wakanda.trafico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrafficController {

    private final TrafficService trafficService;

    public TrafficController(TrafficService trafficService) {
        this.trafficService = trafficService;
    }

    @GetMapping("/traffic-status")
    public String getTrafficStatus() {
        return trafficService.getTrafficStatus();
    }
}
