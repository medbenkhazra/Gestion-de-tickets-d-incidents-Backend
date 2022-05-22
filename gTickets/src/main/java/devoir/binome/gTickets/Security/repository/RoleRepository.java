package devoir.binome.gTickets.Security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import devoir.binome.gTickets.Security.models.ERole;
import devoir.binome.gTickets.Security.models.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
