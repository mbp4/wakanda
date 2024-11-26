package org.example.wakanda.educacion;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/education")
public class EducationController {

    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/classrooms")
    public Map<String, String> getConnectedClassrooms() {
        return educationService.getConnectedClassrooms();
    }

    @GetMapping("/performance")
    public Map<String, Integer> getStudentPerformance() {
        return educationService.getStudentPerformance();
    }

    @GetMapping("/campus")
    public Map<String, String> getDigitalCampusStatus() {
        return educationService.getDigitalCampusStatus();
    }
}
