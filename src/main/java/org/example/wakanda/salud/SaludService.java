package org.example.wakanda.salud;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
class SaludService {

    private final List<DispositivoSalud> dispositivos = new ArrayList<>();
    private Long idCounter = 1L;


    public DispositivoSalud registrarDispositivo(DispositivoSalud dispositivo) {
        dispositivo.setId(idCounter++);
        dispositivos.add(dispositivo);
        return dispositivo;
    }

    public List<DispositivoSalud> obtenerDispositivos() {
        return dispositivos;
    }


    public Optional<DispositivoSalud> obtenerDispositivo(Long id) {
        return dispositivos.stream()
                .filter(dispositivo -> dispositivo.getId().equals(id))
                .findFirst();
    }
}