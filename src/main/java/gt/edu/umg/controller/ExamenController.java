package gt.edu.umg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.Examen;
import gt.edu.umg.services.ExamenService;

@RestController
@RequestMapping("examenes")
@CrossOrigin(origins = "*")
public class ExamenController {

    @Autowired
    private final ExamenService examenService;

    public ExamenController(ExamenService examenService) {
        this.examenService = examenService;
    }

    @GetMapping
    public List<Examen> getAllExamenes() {
        return examenService.getAllExamenes();
    }

    @GetMapping("/{id}")
    public Examen getExamenById(@PathVariable int id) {
        return examenService.getExamenById(id);
    }

    @PostMapping
    public Examen createExamen(@RequestBody Examen examen) {
        return examenService.createExamen(examen);
    }

    @PutMapping("/{id}")
    public Examen updateExamen(@PathVariable int id, @RequestBody Examen examen) {
        return examenService.updateExamen(id, examen);
    }

    @DeleteMapping("/{id}")
    public void deleteExamen(@PathVariable int id) {
        examenService.deleteExamen(id);
    }
}