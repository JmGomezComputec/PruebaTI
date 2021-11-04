package com.example.PruebaTI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PruebaTI.entitys.Product;

public interface ProductsDAO extends JpaRepository<Product, Long>{
	
}
