package com.app.runners.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.runners.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
