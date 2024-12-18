package org.example.wakanda.agua;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
class AguaService {

    private final List<SensorAgua> sensores = new ArrayList<>();
    private Long idCounter = 1L;


    public SensorAgua registrarSensor(SensorAgua sensor) {
        sensor.setId(idCounter++);
        sensores.add(sensor);
        return sensor;
    }


    public List<SensorAgua> obtenerSensores() {
        return sensores;
    }




    public Optional<SensorAgua> obtenerSensor(Long id) {
        return sensores.stream()
                .filter(sensor -> sensor.getId().equals(id))
                .findFirst();
    }
}