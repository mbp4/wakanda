package org.example.wakanda.educacion;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EducationService {

    private Map<String, String> connectedClassrooms = new HashMap<>();
    private Map<String, Integer> studentPerformance = new HashMap<>();
    private Map<String, String> digitalCampus = new HashMap<>();

    public EducationService() {
        connectedClassrooms.put("Aula 1", "Conectada");
        connectedClassrooms.put("Aula 2", "Sin conexión");

        studentPerformance.put("Estudiante A", 85);
        studentPerformance.put("Estudiante B", 90);

        digitalCampus.put("Campus Virtual", "Activo");
    }

    public Map<String, String> getConnectedClassrooms() {
        return connectedClassrooms;
    }

    public Map<String, Integer> getStudentPerformance() {
        return studentPerformance;
    }

    public Map<String, String> getDigitalCampusStatus() {
        return digitalCampus;
    }
}
