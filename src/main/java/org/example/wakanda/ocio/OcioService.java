package org.example.wakanda.ocio;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OcioService {
    private Map<String, String> eventos = new HashMap<>();
    private Map<String, String> espacios = new HashMap<>();

    public OcioService() {
        eventos.put("Festival de Música", "Activo");
        eventos.put("Concierto de Rock", "Finalizado");
        eventos.put("Feria de Antigüedades", "Activo");
        eventos.put("Mercadillo Navideño", "Proximamente");
        eventos.put("Tour por el laboratorio", "Abierto");


        espacios.put("Museo Histórico", "Abierto");
        espacios.put("Centro Cultural", "Cerrado por mantenimiento");
        espacios.put("Museo Black Panther", "Cerrado por mantenimiento");
        espacios.put("Centro de reclutamiento de Dora Milaje", "Abierto");
        espacios.put("Centro de entrenamiento", "En mantenimiento");
    }

    public Map<String, String> getEventosCulturales() {
        return eventos;
    }

    public Map<String, String> getEspaciosCulturalesStatus() {
        return espacios;
    }
}
