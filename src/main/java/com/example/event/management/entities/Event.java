package com.example.event.management.entities;

import java.time.LocalDateTime;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Title can't be null")
	@Size(min = 1, max = 255, message = "Title must be between 1 and 255 characters")
	private String title;
	
	@NotNull(message = "Event date time can't be null")
	private LocalDateTime dateTime;
	
	@OneToMany(mappedBy = "event")
	private List<Attendee> attendees;
	
	@ManyToOne
	@JoinColumn(name = "venue_id")
	@NotNull(message = "Venue is required")
	private Venue venue;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	@NotNull(message = "Category is required")
	private Category category;
}