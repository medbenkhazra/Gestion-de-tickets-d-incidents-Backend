package devoir.binome.gTickets.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import devoir.binome.gTickets.model.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	Optional<Client> findById(Long id);
	Client findByNom(String nom);
	
	int deleteById(Integer id);
	int deleteByNom(String nom);
}
