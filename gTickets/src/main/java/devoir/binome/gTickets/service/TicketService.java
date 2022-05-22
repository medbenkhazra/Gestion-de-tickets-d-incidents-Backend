package devoir.binome.gTickets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import devoir.binome.gTickets.model.Ticket;
import devoir.binome.gTickets.repository.TicketRepository;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketRepository;
	

	public Optional<Ticket> findById(Long id) {
		return ticketRepository.findById(id);
	}

	public Ticket findByTitre(String titre) {
		return ticketRepository.findByTitre(titre);
	}
	
	public List<Ticket> findAllNonAffected() {
		return ticketRepository.findAllNonAffected();
	}

	public int save(Ticket ticket) {
		

			ticketRepository.save(ticket);
			return 1;
		}
	

	public List<Ticket> findAll() {
		return ticketRepository.findAll();
	}
	
	@Transactional
	public void deleteById(Long id) {
		ticketRepository.deleteById(id);
	}
	
	@Transactional
	public void deleteByTitre(String titre) {
		ticketRepository.deleteByTitre(titre);
	}

}
