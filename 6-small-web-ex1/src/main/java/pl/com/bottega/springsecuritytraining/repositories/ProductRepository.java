package pl.com.bottega.springsecuritytraining.repositories;

import pl.com.bottega.springsecuritytraining.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
