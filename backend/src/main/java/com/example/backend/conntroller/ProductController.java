package com.example.backend.conntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Product;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    public class ProductService;

    @GetMapping
    public List<Product> getAllProducts(){
        return ProductService.getAllProducts();
    }

    List<Product> getAllProducts();
    Optional<Product> getProductsById(Long id);
    Product saveProduct(Product Product);
    Product updateProduct(Product Product);
    void deleteProduct(Long id);

    
}

    @Override
    public String toString() {
        return "ProductController []";
    }
