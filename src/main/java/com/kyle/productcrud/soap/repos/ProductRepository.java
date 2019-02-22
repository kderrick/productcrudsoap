package com.kyle.productcrud.soap.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyle.productcrud.soap.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer > {

}
