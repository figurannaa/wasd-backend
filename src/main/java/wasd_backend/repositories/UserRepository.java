package wasd_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wasd_backend.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
