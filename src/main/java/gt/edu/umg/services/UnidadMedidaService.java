package gt.edu.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.edu.umg.entity.UnidadMedida;
import gt.edu.umg.repository.UnidadMedidaRepository;

@Service
public class UnidadMedidaService {
    @Autowired
    private final UnidadMedidaRepository unidadMedidaRepository;


    public UnidadMedidaService(UnidadMedidaRepository unidadMedidaRepository) {
        this.unidadMedidaRepository = unidadMedidaRepository;
    }

    public List<UnidadMedida> getAllUnidadesMedida() {
        return unidadMedidaRepository.findAll();
    }

    public UnidadMedida getUnidadMedidaById(int id) {
        return unidadMedidaRepository.findById(id).orElse(null);
    }

    public UnidadMedida createUnidadMedida(UnidadMedida unidadMedida) {
        return unidadMedidaRepository.save(unidadMedida);
    }

    public UnidadMedida updateUnidadMedida(int id, UnidadMedida unidadMedida) {
        if (unidadMedidaRepository.existsById(id)) {
            unidadMedida.setId(id);
            return unidadMedidaRepository.save(unidadMedida);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteUnidadMedida(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        unidadMedidaRepository.deleteById(id);
    }
}