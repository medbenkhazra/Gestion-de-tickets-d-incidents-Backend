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
import devoir.binome.gTickets.service.TicketService;

@RestController
@RequestMapping(value = "gTickets/ticket")
public class TicketController {
	@Autowired
	TicketService ticketService;
	
	@PatchMapping("/")
	public int edit(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/nonaffected")
	public List<Ticket> findAllNonAffected() {
		return ticketService.findAllNonAffected();
	}
	
	@GetMapping("/id/{id}")
    public Optional<Ticket> findById(@PathVariable Long id) {
        return ticketService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
    	ticketService.deleteById(id);
    }
    
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT') or hasRole('ROLE_DEVELOPPEUR')")
    @GetMapping("/")
    public List<Ticket> findAll() {
        return ticketService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }
   

}
