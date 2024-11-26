package org.example.wakanda.educacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/education-status")
    public String getEducationStatus() {
        return educationService.getEducationStatus();
    }
}
