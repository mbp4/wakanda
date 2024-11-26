package org.example.wakanda.trafico;

import org.springframework.stereotype.Service;

@Service
public class TrafficService {

    public String getTrafficStatus() {
        return "El tráfico está fluyendo sin problemas.";
    }
}
