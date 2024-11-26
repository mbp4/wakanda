package org.example.wakanda.residuos;

import org.springframework.stereotype.Service;

@Service
public class WasteService {

    public String getWasteManagementStatus() {
        return "La recolección de residuos se realiza según lo previsto.";
    }
}
