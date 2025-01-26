package com.example.event.management.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.event.management.entities.Event;

public interface EventRepo extends JpaRepository<Event, Long> {

}