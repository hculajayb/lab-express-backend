package gt.edu.umg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import gt.edu.umg.entity.TipoRecipiente;
import gt.edu.umg.services.TipoRecipienteService;

@RestController
@RequestMapping("tipoRecipiente")
@CrossOrigin(origins = "*")
public class TipoRecipienteController {
	  @Autowired
    private final TipoRecipienteService tipoRecipienteService;

  
    public TipoRecipienteController(TipoRecipienteService tipoRecipienteService) {
        this.tipoRecipienteService = tipoRecipienteService;
    }

    @GetMapping
    public List<TipoRecipiente> getAllTiposRecipientes() {
        return tipoRecipienteService.getAllTiposRecipientes();
    }

    @GetMapping("/{id}")
    public TipoRecipiente getTipoRecipienteById(@PathVariable int id) {
        return tipoRecipienteService.getTipoRecipienteById(id);
    }

    @PostMapping
    public TipoRecipiente createTipoRecipiente(@RequestBody TipoRecipiente tipoRecipiente) {
        return tipoRecipienteService.createTipoRecipiente(tipoRecipiente);
    }

    @PutMapping("/{id}")
    public TipoRecipiente updateTipoRecipiente(@PathVariable int id, @RequestBody TipoRecipiente tipoRecipiente) {
        return tipoRecipienteService.updateTipoRecipiente(id, tipoRecipiente);
    }

    @DeleteMapping("/{id}")
    public void deleteTipoRecipiente(@PathVariable int id) {
        tipoRecipienteService.deleteTipoRecipiente(id);
    }
}