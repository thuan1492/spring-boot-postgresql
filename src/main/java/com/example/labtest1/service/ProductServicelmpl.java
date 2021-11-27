package com.example.labtest1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import com.example.labtest1.model.Product;
import com.example.labtest1.repository.ProductRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProductServicelmpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product){
        this.productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public Product getProduct(Long id){
        Product product = null;
        try {
            product = this.productRepository.findById(id)
                    .orElseThrow(() -> new Exception("Product not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    public Product deleteProduct(Long id){

        Product product = getProduct(id);
        this.productRepository.delete(product);
        return product;
    }



}
