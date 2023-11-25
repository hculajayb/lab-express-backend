package gt.edu.umg.repository;

import gt.edu.umg.entity.Examen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamenRepository extends JpaRepository<Examen, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}