package gt.edu.umg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.Empleado;
import gt.edu.umg.services.EmpleadoService;

@RestController
@RequestMapping("empleados")
@CrossOrigin(origins = "*")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    public List<Empleado> getAllEmpleados() {
        return empleadoService.getAllEmpleados();
    }

    @GetMapping("/{id}")
    public Empleado getEmpleadoById(@PathVariable int id) {
        return empleadoService.getEmpleadoById(id);
    }

    @PostMapping
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.createEmpleado(empleado);
    }

    @PutMapping("/{id}")
    public Empleado updateEmpleado(@PathVariable int id, @RequestBody Empleado empleado) {
        return empleadoService.updateEmpleado(id, empleado);
    }

    @DeleteMapping("/{id}")
    public void deleteEmpleado(@PathVariable int id) {
        empleadoService.deleteEmpleado(id);
    }
}
