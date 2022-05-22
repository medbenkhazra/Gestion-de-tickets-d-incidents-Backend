package devoir.binome.gTickets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devoir.binome.gTickets.model.Developpeur;
import devoir.binome.gTickets.model.Ticket;
import devoir.binome.gTickets.service.DeveloppeurService;

@RestController
@RequestMapping(value = "gTickets/developpeur")
@PreAuthorize("hasRole('ROLE_DEVELOPPEUR')")
public class DeveloppeurController {
	@Autowired
	DeveloppeurService developpeurService;

	
	@GetMapping("/iddeveloppeur/{iddeveloppeur}")
    public List<Ticket> findListTickets(@PathVariable Long iddeveloppeur){
    	
    	return developpeurService.findListTickets(iddeveloppeur);	
    }
	
	
	
	
	@GetMapping("/id/{id}")
    public Optional<Developpeur> findById(@PathVariable Long id) {
        return developpeurService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
    	developpeurService.deleteById(id);
    }

    @GetMapping("/")
    public List<Developpeur> findAll() {
        return developpeurService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Developpeur developpeur) {
        return developpeurService.save(developpeur);
    }
}
