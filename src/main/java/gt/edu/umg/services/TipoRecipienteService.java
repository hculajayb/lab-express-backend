package gt.edu.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gt.edu.umg.entity.TipoRecipiente;
import gt.edu.umg.repository.TipoRecipienteRepository;

@Service
public class TipoRecipienteService {
	 @Autowired
    private final TipoRecipienteRepository tipoRecipienteRepository;

   
    public TipoRecipienteService(TipoRecipienteRepository tipoRecipienteRepository) {
        this.tipoRecipienteRepository = tipoRecipienteRepository;
    }

    public List<TipoRecipiente> getAllTiposRecipientes() {
        return tipoRecipienteRepository.findAll();
    }

    public TipoRecipiente getTipoRecipienteById(int id) {
        return tipoRecipienteRepository.findById(id).orElse(null);
    }

    public TipoRecipiente createTipoRecipiente(TipoRecipiente tipoRecipiente) {
        // Aquí puedes agregar lógica de negocio antes de guardar en la base de datos
        return tipoRecipienteRepository.save(tipoRecipiente);
    }

    public TipoRecipiente updateTipoRecipiente(int id, TipoRecipiente tipoRecipiente) {
        if (tipoRecipienteRepository.existsById(id)) {
            tipoRecipiente.setId(id);
            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return tipoRecipienteRepository.save(tipoRecipiente);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteTipoRecipiente(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        tipoRecipienteRepository.deleteById(id);
    }
}