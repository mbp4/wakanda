package org.example.wakanda.gobierno;

import org.jvnet.hk2.annotations.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GobiernoService {

    private Map<String, String> proyectos = new HashMap<>();
    private Map<String, String> serviciosOnline = new HashMap<>();

    public GobiernoService() {
        proyectos.put("Presupuesto 2024", "Publicado");
        proyectos.put("Proyectos Ciudadanos", "Actualizado");

        serviciosOnline.put("Pago de Impuestos", "Operativo");
        serviciosOnline.put("Registro Civil", "En mantenimiento");
    }

    public Map<String, String> getProyectosData() {
        return proyectos;
    }

    public Map<String, String> getOnlineServicesStatus() {
        return serviciosOnline;
    }
}
