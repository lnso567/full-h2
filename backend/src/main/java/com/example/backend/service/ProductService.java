package com.example.backend.service;

import com.example.backend.model.Product;
import jaba.util.List;
import javautil.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductsById(Long id);
    Product saveProduct(Product Product);
    Product updateProduct(Product Product);
    void deleteProduct(Long id);
}