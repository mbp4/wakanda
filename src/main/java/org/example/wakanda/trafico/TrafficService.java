package org.example.wakanda.trafico;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TrafficService {

    // Simulación de datos para sensores y rutas
    private Map<String, String> trafficSensors = new HashMap<>();
    private Map<String, String> parkingAvailability = new HashMap<>();
    private Map<String, String> publicTransportRoutes = new HashMap<>();

    public TrafficService() {
        // Datos de sensores de tráfico
        trafficSensors.put("Avenida Central", "Flujo normal");
        trafficSensors.put("Calle 8", "Congestión leve");

        // Disponibilidad de estacionamientos
        parkingAvailability.put("Estacionamiento Plaza", "10 espacios disponibles");
        parkingAvailability.put("Estacionamiento Norte", "Completo");

        // Rutas de transporte público
        publicTransportRoutes.put("Ruta 1", "Sin desvíos");
        publicTransportRoutes.put("Ruta 2", "Desvío por construcción en Calle 10");
    }

    public String getTrafficStatus() {
        return "El tráfico está fluyendo sin problemas en general.";
    }

    public Map<String, String> getTrafficSensors() {
        return trafficSensors;
    }

    public Map<String, String> getParkingAvailability() {
        return parkingAvailability;
    }

    public Map<String, String> getPublicTransportRoutes() {
        return publicTransportRoutes;
    }
}
