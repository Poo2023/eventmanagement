package com.example.event.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.event.management.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}