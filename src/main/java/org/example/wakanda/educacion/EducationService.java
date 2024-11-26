package org.example.wakanda.educacion;

import org.springframework.stereotype.Service;

@Service
public class EducationService {

    public String getEducationStatus() {
        return "Todos los colegios están funcionando.";
    }
}
