package gt.edu.umg.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.Examen;
import gt.edu.umg.repository.ExamenRepository;


@Service
public class ExamenService {

    @Autowired
    private final ExamenRepository examenRepository;

    public ExamenService(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    public List<Examen> getAllExamenes() {
        return examenRepository.findAll();
    }

    public Examen getExamenById(int id) {
        return examenRepository.findById(id).orElse(null);
    }

    public Examen createExamen(Examen examen) {
        // Aquí puedes agregar lógica de negocio antes de guardar en la base de datos
        return examenRepository.save(examen);
    }

    public Examen updateExamen(int id, Examen examen) {
        if (examenRepository.existsById(id)) {
            examen.setId(id);

            // Aquí puedes agregar lógica de negocio antes de actualizar en la base de datos
            return examenRepository.save(examen);
        } else {
            return null; // Manejar la lógica de error según sea necesario
        }
    }

    public void deleteExamen(int id) {
        // Aquí puedes agregar lógica de negocio antes de eliminar de la base de datos
        examenRepository.deleteById(id);
    }
}