package pl.com.bottega.springsecuritytraining.services;

import pl.com.bottega.springsecuritytraining.entities.Product;
import pl.com.bottega.springsecuritytraining.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
