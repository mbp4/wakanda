package org.example.wakanda.vigilancia;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VigilanciaService {

    private Map<String, String> camaras = new HashMap<>();
    private Map<String, String> drones = new HashMap<>();

    public VigilanciaService() {
        camaras.put("Plaza Central", "Operativa");
        camaras.put("Parque Urbano", "Inoperativa");
        camaras.put("Centro Comercial", "Operativa");
        camaras.put("Calle principal", "Operativa");
        camaras.put("Calles secundarias", "En mantenimiento");

        drones.put("Zona A", "En Patrulla");
        drones.put("Zona B", "Base");
        drones.put("Zona C", "Base");
        drones.put("Afueras A", "En Patrulla");
        drones.put("Afueras B", "En mantenimiento");
    }

    public Map<String, String> getCamaraStatus() {
        return camaras;
    }

    public Map<String, String> getDronePatrolStatus() {
        return drones;
    }
}
