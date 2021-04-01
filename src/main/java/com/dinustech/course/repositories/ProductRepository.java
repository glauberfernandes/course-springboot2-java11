package com.dinustech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinustech.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
