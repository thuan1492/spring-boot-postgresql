package com.example.labtest1.service;

import com.example.labtest1.model.Product;

import java.util.List;
public interface ProductService {
    public void saveProduct(Product product);

    public List<Product> getAllProducts();

    public Product getProduct(Long id);

    public Product deleteProduct(Long id);

}
