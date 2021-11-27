package com.example.labtest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.labtest1.model.Product;
import com.example.labtest1.service.ProductService;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;



    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public List<Product> getAllStudents(){
        return productService.getAllProducts();
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @RequestMapping(path = "/products", method = RequestMethod.PUT)
    public void update(@RequestBody Product product){
        productService.saveProduct(product);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable(value = "id") Long id){
        productService.deleteProduct(id);
    }

    @RequestMapping(path = "/products/{id}", method = RequestMethod.GET)
    public Product getStudent(@PathVariable(value = "id") Long id){
        return productService.getProduct(id);
    }

}
