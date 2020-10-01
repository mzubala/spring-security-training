package pl.com.bottega.springsecuritytraining.repositories;

import pl.com.bottega.springsecuritytraining.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaTokenRepository extends JpaRepository<Token, Integer> {

    Optional<Token> findTokenByIdentifier(String identifier);
}
