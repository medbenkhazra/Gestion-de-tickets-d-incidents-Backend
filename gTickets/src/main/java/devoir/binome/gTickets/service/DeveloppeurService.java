package devoir.binome.gTickets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import devoir.binome.gTickets.repository.DeveloppeurRepository;
import devoir.binome.gTickets.repository.TicketRepository;
import devoir.binome.gTickets.model.Developpeur;
import devoir.binome.gTickets.model.Ticket;
@Service
public class DeveloppeurService {
	@Autowired
	DeveloppeurRepository developpeurRepository;
	@Autowired
	TicketRepository ticketRepository;

	public Optional<Developpeur> findById(Long id) {
		return developpeurRepository.findById(id);
	}

	public Developpeur findByNom(String nom) {
		return developpeurRepository.findByNom(nom);
	}

	public int save(Developpeur developpeur) {
		if (findByNom(developpeur.getNom()) != null) {
			return -1;
		} else {

			developpeurRepository.save(developpeur);
			return 1;
		}
	}

	public List<Developpeur> findAll() {
		return developpeurRepository.findAll();
	}
	
	@Transactional
	public void deleteById(Long id) {
		developpeurRepository.deleteById(id);
	}
	
	@Transactional
	public void deleteByNom(String nom) {
		developpeurRepository.deleteByNom(nom);
	}
	
	
	  public List<Ticket> findListTickets(Long id){
	    	List<Ticket> tickets=ticketRepository.findByDeveloppeurId(id);
	    	return tickets;	
	    }

}
