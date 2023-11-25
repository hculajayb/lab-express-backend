package gt.edu.umg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import gt.edu.umg.entity.TipoMuestra;
import gt.edu.umg.services.TipoMuestraService;

@RestController
@RequestMapping("tipoMuestra")
@CrossOrigin(origins = "*")
public class TipoMuestraController {
	  @Autowired
    private final TipoMuestraService tipoMuestraService;

  
    public TipoMuestraController(TipoMuestraService tipoMuestraService) {
        this.tipoMuestraService = tipoMuestraService;
    }

    @GetMapping
    public List<TipoMuestra> getAllTiposMuestra() {
        return tipoMuestraService.getAllTiposMuestra();
    }

    @GetMapping("/{id}")
    public TipoMuestra getTipoMuestraById(@PathVariable int id) {
        return tipoMuestraService.getTipoMuestraById(id);
    }

    @PostMapping
    public TipoMuestra createTipoMuestra(@RequestBody TipoMuestra tipoMuestra) {
        return tipoMuestraService.createTipoMuestra(tipoMuestra);
    }

    @PutMapping("/{id}")
    public TipoMuestra updateTipoMuestra(@PathVariable int id, @RequestBody TipoMuestra tipoMuestra) {
        return tipoMuestraService.updateTipoMuestra(id, tipoMuestra);
    }

    @DeleteMapping("/{id}")
    public void deleteTipoMuestra(@PathVariable int id) {
        tipoMuestraService.deleteTipoMuestra(id);
    }
}