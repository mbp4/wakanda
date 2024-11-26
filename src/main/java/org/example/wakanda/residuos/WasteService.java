package org.example.wakanda.residuos;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WasteService {

    private Map<String, String> binSensors = new HashMap<>();
    private Map<String, String> recyclingCenters = new HashMap<>();

    public WasteService() {
        // Simulación de sensores de contenedores
        binSensors.put("Contenedor A", "Lleno al 80%");
        binSensors.put("Contenedor B", "Lleno al 40%");

        // Puntos de reciclaje y compostaje
        recyclingCenters.put("Centro de Reciclaje Norte", "Operativo");
        recyclingCenters.put("Compostaje Plaza Central", "Operativo");
    }

    public Map<String, String> getBinSensors() {
        return binSensors;
    }

    public Map<String, String> getRecyclingCenters() {
        return recyclingCenters;
    }

    public String classifyWaste(String wasteType) {
        switch (wasteType.toLowerCase()) {
            case "plástico":
                return "Desecho reciclable";
            case "orgánico":
                return "Desecho compostable";
            default:
                return "Desecho general";
        }
    }
}
