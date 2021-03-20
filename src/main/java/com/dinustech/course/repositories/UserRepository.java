package com.dinustech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dinustech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
