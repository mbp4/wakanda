package org.example.wakanda.wifi;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WifiService {

    private Map<String, String> publicWifi = new HashMap<>();
    private Map<String, String> iotSensors = new HashMap<>();
    private Map<String, String> openDataPlatforms = new HashMap<>();

    public WifiService() {
        publicWifi.put("Parque Central", "Activo");
        publicWifi.put("Estación Norte", "Sin conexión");

        iotSensors.put("Temperatura", "22°C");
        iotSensors.put("Calidad del Aire", "Buena");

        openDataPlatforms.put("Datos de Tráfico", "Disponible");
    }

    public Map<String, String> getPublicWifi() {
        return publicWifi;
    }

    public Map<String, String> getIoTSensors() {
        return iotSensors;
    }

    public Map<String, String> getOpenDataPlatforms() {
        return openDataPlatforms;
    }
}
