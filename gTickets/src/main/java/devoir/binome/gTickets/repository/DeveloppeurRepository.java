package devoir.binome.gTickets.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import devoir.binome.gTickets.model.Developpeur;
import devoir.binome.gTickets.model.Ticket;

@Repository
public interface DeveloppeurRepository extends JpaRepository<Developpeur, Long> {
	
	Optional<Developpeur> findById(Long id);
	Developpeur findByNom(String nom);
	List<Developpeur> findBySpecialite(String specialite);
	
	int deleteById(Integer id);
	int deleteByNom(String nom);

}
