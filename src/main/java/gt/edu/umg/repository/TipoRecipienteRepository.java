package gt.edu.umg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gt.edu.umg.entity.TipoRecipiente;

public interface TipoRecipienteRepository extends JpaRepository<TipoRecipiente, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}