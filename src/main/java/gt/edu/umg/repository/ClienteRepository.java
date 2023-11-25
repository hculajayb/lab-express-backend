package gt.edu.umg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gt.edu.umg.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}