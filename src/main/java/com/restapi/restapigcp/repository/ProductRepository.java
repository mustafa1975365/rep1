package com.restapi.restapigcp.repository;

import com.restapi.restapigcp.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

}