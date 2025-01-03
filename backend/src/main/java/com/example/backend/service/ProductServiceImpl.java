package com.example.backend.service;

import com.example.backend.model.Product;
import com.example.backend.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD

=======
>>>>>>> d05275e7f3a8dc2cc236de44e5bfc1adcf1f9716
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
<<<<<<< HEAD

=======
    
>>>>>>> d05275e7f3a8dc2cc236de44e5bfc1adcf1f9716
    @Override
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
<<<<<<< HEAD

    @Override
    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    @Override
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
=======
    @Override
    public Optional<Product> getProductsById(Long id){
        return productRepository.findById(id);
    }
    @Override
    public Product saveProduct(Product Product){
        return productRepository.save(product);
    }
    @Override
    public Product updateProduct(Product Product){
        return productRepository.save(product);
    }
    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id)
    }

}
>>>>>>> d05275e7f3a8dc2cc236de44e5bfc1adcf1f9716
