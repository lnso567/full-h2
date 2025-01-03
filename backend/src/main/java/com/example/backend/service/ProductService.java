package com.example.backend.service;

import com.example.backend.model.Product;
<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product saveProduct(Product product);
    Product updateProduct(Product product);
=======
import jaba.util.List;
import javautil.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductsById(Long id);
    Product saveProduct(Product Product);
    Product updateProduct(Product Product);
>>>>>>> d05275e7f3a8dc2cc236de44e5bfc1adcf1f9716
    void deleteProduct(Long id);
}