package devoir.binome.gTickets.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import devoir.binome.gTickets.model.Ticket;




@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
	Optional<Ticket> findById(Long id);
	Ticket findByTitre(String titre);
	List<Ticket> findByEnvironnement(String environnement);
	List<Ticket> findByLogiciel(String logiciel);
	List<Ticket> findByStatut(String statut);
	List<Ticket> findByPriorite(String priorite);
	
	//List<Ticket> findByClientNomAndPrenom(String nom,String prenom);
	//List<Ticket> findByDeveloppeurNomAndPrenom(String nom,String prenom);
	List<Ticket> findByClientNom(String nom);
	List<Ticket> findByDeveloppeurNom(String nom);
	
	
	List<Ticket> findByClientId(Long id);
	List<Ticket> findByDeveloppeurId(Long id);
	
	int deleteById(Integer id);
	int deleteByTitre(String titre);
	int deleteByEnvironnement(String environnement);
	
	int deleteByLogiciel(String logiciel);
    @Query("SELECT t FROM Ticket t where t.developpeur=null")
    List<Ticket> findAllNonAffected();
}
