package gt.edu.umg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import gt.edu.umg.entity.Cliente;
import gt.edu.umg.repository.ClienteRepository;

@RestController
@RequestMapping("clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable int id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable int id, @RequestBody Cliente cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setId(id);
            return clienteRepository.save(cliente);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable int id) {
        clienteRepository.deleteById(id);
    }
}
