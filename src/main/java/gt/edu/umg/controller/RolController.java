package gt.edu.umg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gt.edu.umg.entity.Rol;
import gt.edu.umg.services.RolService;

@RestController
@RequestMapping("roles")
@CrossOrigin(origins = "*")
public class RolController {

    @Autowired
    private final RolService rolService;


    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public List<Rol> getAllRol() {
        return rolService.getAllRol();
    }

    @GetMapping("/{id}")
    public Rol getRolById(@PathVariable int id) {
        return rolService.getRolById(id);
    }

    @PostMapping
    public Rol createRol(@RequestBody Rol rol) {
        return rolService.createRol(rol);
    }

    @PutMapping("/{id}")
    public Rol updateRol(@PathVariable int id, @RequestBody Rol rol) {
        return rolService.updateRol(id, rol);
    }

    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable int id) {
        rolService.deleteRol(id);
    }
}