package com.example.labtest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.labtest1.model.Product;

import java.util.List;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
