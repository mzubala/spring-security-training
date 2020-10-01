package pl.com.bottega.springsecuritytraining.repositories;

import pl.com.bottega.springsecuritytraining.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findUserByUsername(String username);
}
