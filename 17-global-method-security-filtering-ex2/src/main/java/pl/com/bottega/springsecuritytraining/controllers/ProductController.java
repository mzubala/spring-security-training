package pl.com.bottega.springsecuritytraining.controllers;

import pl.com.bottega.springsecuritytraining.model.Product;
import pl.com.bottega.springsecuritytraining.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/sell")
    public List<Product> sellProduct() {
        List<Product> products = List.of(
                new Product("beer", "nikolai"),
                new Product("candy", "nikolai"),
                new Product("chocolate", "julien"));

        return productService.sellProducts(products);
    }
}
