package org.example.wakanda.emergencias;


import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
class EmergenciasService {

    private final List<Emergencia> emergencias = new ArrayList<>();
    private Long idCounter = 1L;

    //registrar nueva emergencia
    public Emergencia registrarEmergencia(Emergencia emergencia) {
        emergencia.setId(idCounter++);
        emergencias.add(emergencia);
        return emergencia;
    }

    //obtener todas las emergencias
    public List<Emergencia> obtenerEmergencias() {
        return emergencias;
    }


    public Optional<Emergencia> resolverEmergencia(Long id) {
        return emergencias.stream()
                .filter(emergencia -> emergencia.getId().equals(id))
                .peek(emergencia -> emergencia.setResuelta(true))
                .findFirst();
    }
}
