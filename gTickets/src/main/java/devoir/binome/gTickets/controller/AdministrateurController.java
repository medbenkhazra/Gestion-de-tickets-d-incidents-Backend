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

import devoir.binome.gTickets.model.Administrateur;
import devoir.binome.gTickets.model.Ticket;
import devoir.binome.gTickets.service.AdministrateurService;

@RestController
@RequestMapping(value = "gTickets/administrateur")

public class AdministrateurController {
	@Autowired
	AdministrateurService administrateurService;
	
	/*
	@GetMapping("/tickets")
    public List<Ticket> findListTickets(){
    	
    	return administrateurService.findListTickets(idClient);	
    }*/
	
	
	@GetMapping("/id/{id}")
    public Optional<Administrateur> findById(@PathVariable Long id) {
        return administrateurService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
    	administrateurService.deleteById(id);
    }

    @GetMapping("/")
    public List<Administrateur> findAll() {
        return administrateurService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Administrateur administrateur) {
        return administrateurService.save(administrateur);
    }
   

}
