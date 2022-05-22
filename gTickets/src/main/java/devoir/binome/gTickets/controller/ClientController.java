package devoir.binome.gTickets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devoir.binome.gTickets.model.Client;
import devoir.binome.gTickets.model.Ticket;
import devoir.binome.gTickets.service.ClientService;


@RestController
@RequestMapping(value = "gTickets/client")
@PreAuthorize("hasRole('ROLE_CLIENT')")
public class ClientController {
	@Autowired
	ClientService clientService;
	
	@GetMapping("/idClient/{idClient}")
    public List<Ticket> findListTickets(@PathVariable Long idClient){
    	
    	return clientService.findListTickets(idClient);	
    }
	
	
	@GetMapping("/id/{id}")
    public Optional<Client> findById(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
         clientService.deleteById(id);
    }

    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Client client) {
        return clientService.save(client);
    }
   

}
