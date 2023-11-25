package gt.edu.umg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gt.edu.umg.entity.Cliente;
import gt.edu.umg.repository.ClienteRepository;


@Service
public class ClienteService {

	@Autowired
	  private final ClienteRepository clienteRepository;

		public ClienteService(ClienteRepository clienteRepository) {
	        this.clienteRepository = clienteRepository;
	    }

	    public List<Cliente> getAllClientes() {
	        return clienteRepository.findAll();
	    }

	    public Cliente getClienteById(int id) {
	        return clienteRepository.findById(id).orElse(null);
	    }

	    public Cliente createCliente(Cliente cliente) {
	    
	        return clienteRepository.save(cliente);
	    }

	    public Cliente updateCliente(int id, Cliente cliente) {
	        if (clienteRepository.existsById(id)) {
	            cliente.setId(id);
	           
	            return clienteRepository.save(cliente);
	        } else {
	            return null; 
	        }
	    }

	    public void deleteCliente(int id) {
	        
	        clienteRepository.deleteById(id);
	    }
}
