package gt.edu.umg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.SolicitudDetalle;
import gt.edu.umg.services.SolicitudDetalleService;

@RestController
@RequestMapping("solicitudDetalle")
@CrossOrigin(origins = "*")
public class SolicitudDetalleController {
    @Autowired
    private final SolicitudDetalleService solicitudDetalleService;


    public SolicitudDetalleController(SolicitudDetalleService solicitudDetalleService) {
        this.solicitudDetalleService = solicitudDetalleService;
    }

    @GetMapping
    public List<SolicitudDetalle> getAllSolicitudesDetalle() {
        return solicitudDetalleService.getAllSolicitudesDetalle();
    }

    @GetMapping("/{id}")
    public SolicitudDetalle getSolicitudDetalleById(@PathVariable int id) {
        return solicitudDetalleService.getSolicitudDetalleById(id);
    }

    @PostMapping
    public SolicitudDetalle createSolicitudDetalle(@RequestBody SolicitudDetalle solicitudDetalle) {
        return solicitudDetalleService.createSolicitudDetalle(solicitudDetalle);
    }

    @PutMapping("/{id}")
    public SolicitudDetalle updateSolicitudDetalle(@PathVariable int id, @RequestBody SolicitudDetalle solicitudDetalle) {
        return solicitudDetalleService.updateSolicitudDetalle(id, solicitudDetalle);
    }

    @DeleteMapping("/{id}")
    public void deleteSolicitudDetalle(@PathVariable int id) {
        solicitudDetalleService.deleteSolicitudDetalle(id);
    }

}