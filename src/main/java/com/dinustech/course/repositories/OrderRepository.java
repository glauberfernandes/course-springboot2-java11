package com.dinustech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinustech.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
