package gt.edu.umg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.EstadoSolicitud;
import gt.edu.umg.services.EstadoSolicitudService;

@RestController
@RequestMapping("estadoSolicitud")
@CrossOrigin(origins = "*")
public class EstadoSolicitudController {
    @Autowired
    private final EstadoSolicitudService estadoSolicitudService;

    public EstadoSolicitudController(EstadoSolicitudService estadoSolicitudService) {
        this.estadoSolicitudService = estadoSolicitudService;
    }

    @GetMapping
    public List<EstadoSolicitud> getAllEstadosSolicitudes() {
        return estadoSolicitudService.getAllEstadosSolicitudes();
    }

    @GetMapping("/{id}")
    public EstadoSolicitud getEstadoSolicitudById(@PathVariable int id) {
        return estadoSolicitudService.getEstadoSolicitudById(id);
    }

    @PostMapping
    public EstadoSolicitud createEstadoSolicitud(@RequestBody EstadoSolicitud solicitud) {
        return estadoSolicitudService.createEstadoSolicitud(solicitud);
    }

    @PutMapping("/{id}")
    public EstadoSolicitud updateEstadoSolicitud(@PathVariable int id, @RequestBody EstadoSolicitud solicitud) {
        return estadoSolicitudService.updateEstadoSolicitud(id, solicitud);
    }

    @DeleteMapping("/{id}")
    public void deleteEstadoSolicitud(@PathVariable int id) {
        estadoSolicitudService.deleteEstadoSolicitud(id);
    }

}