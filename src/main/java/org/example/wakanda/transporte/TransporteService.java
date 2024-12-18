package org.example.wakanda.transporte;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
class TransporteService {

    private final List<Ruta> rutas = new ArrayList<>();
    private Long idCounter = 1L;


    public Ruta registrarRuta(Ruta ruta) {
        ruta.setId(idCounter++);
        rutas.add(ruta);
        return ruta;
    }


    public List<Ruta> obtenerRutas() {
        return rutas;
    }


    public Optional<Ruta> obtenerRuta(Long id) {
        return rutas.stream()
                .filter(ruta -> ruta.getId().equals(id))
                .findFirst();
    }
}
