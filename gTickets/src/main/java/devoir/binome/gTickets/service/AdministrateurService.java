package devoir.binome.gTickets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import devoir.binome.gTickets.model.Administrateur;
import devoir.binome.gTickets.model.Client;
import devoir.binome.gTickets.repository.AdministrateurRepository;

@Service
public class AdministrateurService {
	@Autowired
	AdministrateurRepository administrateurRepository;
	
	

	public Optional<Administrateur> findById(Long id) {
		return administrateurRepository.findById(id);
	}

	public Administrateur findByNom(String nom) {
		return administrateurRepository.findByNom(nom);
	}

	public int save(Administrateur administrateur) {
		if (findByNom(administrateur.getNom()) != null) {
			return -1;
		} else {

			administrateurRepository.save(administrateur);
			return 1;
		}
	}

	public List<Administrateur> findAll() {
		return administrateurRepository.findAll();
	}
	
	@Transactional
	public void deleteById(Long id) {
		administrateurRepository.deleteById(id);
	}
	
	@Transactional
	public void deleteByNom(String nom) {
		administrateurRepository.deleteByNom(nom);
	}

}
