package gt.edu.umg.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.SolicitudDetalle;
import gt.edu.umg.repository.SolicitudDetalleRepository;


@Service
public class SolicitudDetalleService {
    @Autowired
    private final SolicitudDetalleRepository solicitudDetalleRepository;

    public SolicitudDetalleService(SolicitudDetalleRepository solicitudDetalleRepository) {
        this.solicitudDetalleRepository = solicitudDetalleRepository;
    }

    public List<SolicitudDetalle> getAllSolicitudesDetalle() {
        return solicitudDetalleRepository.findAll();
    }

    public SolicitudDetalle getSolicitudDetalleById(int id) {
        return solicitudDetalleRepository.findById(id).orElse(null);
    }

    public SolicitudDetalle createSolicitudDetalle(SolicitudDetalle solicitudDetalle) {
        return solicitudDetalleRepository.save(solicitudDetalle);
    }

    public SolicitudDetalle updateSolicitudDetalle(int id, SolicitudDetalle solicitudDetalle) {
        if (solicitudDetalleRepository.existsById(id)) {

            solicitudDetalle.setId(id);
            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return solicitudDetalleRepository.save(solicitudDetalle);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteSolicitudDetalle(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        solicitudDetalleRepository.deleteById(id);
    }
}