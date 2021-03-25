package com.dinustech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinustech.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
