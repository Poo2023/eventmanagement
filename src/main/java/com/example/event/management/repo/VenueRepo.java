package com.example.event.management.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.event.management.entities.Venue;

public interface VenueRepo extends JpaRepository<Venue, Long> {

}