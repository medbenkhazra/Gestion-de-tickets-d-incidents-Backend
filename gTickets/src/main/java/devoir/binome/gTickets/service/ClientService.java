package devoir.binome.gTickets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import devoir.binome.gTickets.model.Client;
import devoir.binome.gTickets.model.Ticket;
import devoir.binome.gTickets.repository.ClientRepository;
import devoir.binome.gTickets.repository.TicketRepository;


@Service
public class ClientService {
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	TicketRepository ticketRepository;
	
	

	public Optional<Client> findById(Long id) {
		return clientRepository.findById(id);
	}

	public Client findByNom(String nom) {
		return clientRepository.findByNom(nom);
	}

	public int save(Client client) {
		if (findByNom(client.getNom()) != null) {
			return -1;
		} else {

			clientRepository.save(client);
			return 1;
		}
	}

	public List<Client> findAll() {
		return clientRepository.findAll();
	}
	
	@Transactional
	public void deleteById(Long id) {
		clientRepository.deleteById(id);
	}
	
	@Transactional
	public void deleteByNom(String nom) {
		clientRepository.deleteByNom(nom);
	}
	
	  public List<Ticket> findListTickets(Long id){
	    	List<Ticket> tickets=ticketRepository.findByClientId(id);
	    	return tickets;	
	    }



}
