package gt.edu.umg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import gt.edu.umg.entity.UnidadMedida;
import gt.edu.umg.services.UnidadMedidaService;

@RestController
@RequestMapping("unidadMedida")
@CrossOrigin(origins = "*")
public class UnidadMedidaController {
    @Autowired
    private final UnidadMedidaService unidadMedidaService;


    public UnidadMedidaController(UnidadMedidaService unidadMedidaService) {
        this.unidadMedidaService = unidadMedidaService;
    }

    @GetMapping
    public List<UnidadMedida> getAllUnidadesMedida() {
        return unidadMedidaService.getAllUnidadesMedida();
    }

    @GetMapping("/{id}")
    public UnidadMedida getUnidadMedidaById(@PathVariable int id) {
        return unidadMedidaService.getUnidadMedidaById(id);
    }

    @PostMapping
    public UnidadMedida createUnidadMedida(@RequestBody UnidadMedida unidadMedida) {
        return unidadMedidaService.createUnidadMedida(unidadMedida);
    }

    @PutMapping("/{id}")
    public UnidadMedida updateUnidadMedida(@PathVariable int id, @RequestBody UnidadMedida unidadMedida) {
        return unidadMedidaService.updateUnidadMedida(id, unidadMedida);
    }

    @DeleteMapping("/{id}")
    public void deleteUnidadMedida(@PathVariable int id) {
        unidadMedidaService.deleteUnidadMedida(id);
    }
}