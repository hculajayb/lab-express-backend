package gt.edu.umg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gt.edu.umg.entity.Muestra;

public interface MuestraRepository extends JpaRepository<Muestra, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}