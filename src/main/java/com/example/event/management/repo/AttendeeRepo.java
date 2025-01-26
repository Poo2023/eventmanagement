package com.example.event.management.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.event.management.entities.Attendee;

public interface AttendeeRepo extends JpaRepository<Attendee, Long> {

}