package devoir.binome.gTickets.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import devoir.binome.gTickets.model.Administrateur;
import devoir.binome.gTickets.model.Developpeur;
import devoir.binome.gTickets.model.Ticket;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {
	Optional<Administrateur> findById(Long id);
	Administrateur findByNom(String nom);
	
	int deleteById(Integer id);
	int deleteByNom(String nom);

}
