package org.example.wakanda.luz;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LuzService {
    private Map<String, String> iluminacionPublica = new HashMap<>();
    private Map<String, String> smartGrid = new HashMap<>();

    public LuzService() {
        iluminacionPublica.put("Calle Principal", "Activa");
        iluminacionPublica.put("Calle Secundaria", "Inactiva");
        iluminacionPublica.put("Plaza principal", "Activa");
        iluminacionPublica.put("Carreteras", "Activa");

        smartGrid.put("Energía Solar", "100% Operativo");
        smartGrid.put("Energía Eólica", "75% Operativo");
    }

    public Map<String, String> getIluminacionPublica() {
        return iluminacionPublica;
    }

    public Map<String, String> getSmartGridStatus() {
        return smartGrid;
    }
}
