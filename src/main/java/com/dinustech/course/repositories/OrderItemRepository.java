package com.dinustech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinustech.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
