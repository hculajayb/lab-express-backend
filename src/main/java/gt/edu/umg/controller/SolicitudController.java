package gt.edu.umg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.Solicitud;
import gt.edu.umg.services.SolicitudService;

@RestController
@RequestMapping("solicitud")
@CrossOrigin(origins = "*")
public class SolicitudController {
    @Autowired
	private final SolicitudService solicitudService;


    public SolicitudController(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }

    @GetMapping
    public List<Solicitud> getAllSolicitudes() {
        return solicitudService.getAllSolicitudes();
    }

    @GetMapping("/{id}")
    public Solicitud getSolicitudById(@PathVariable int id) {
        return solicitudService.getSolicitudById(id);
    }

    @PostMapping
    public Solicitud createSolicitud(@RequestBody Solicitud solicitud) {
        return solicitudService.createSolicitud(solicitud);
    }

    @PutMapping("/{id}")
    public Solicitud updateSolicitud(@PathVariable int id, @RequestBody Solicitud solicitud) {
        return solicitudService.updateSolicitud(id, solicitud);
    }

    @DeleteMapping("/{id}")
    public void deleteSolicitud(@PathVariable int id) {
        solicitudService.deleteSolicitud(id);
    }
    
}
