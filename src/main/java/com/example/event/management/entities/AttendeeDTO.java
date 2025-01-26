package com.example.event.management.entities;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AttendeeDTO {

    
    private Long id;

    private String name;

    private String email;

    private Long eventId;
    private String eventTitle;
	
	private String eventDate;
	
	public AttendeeDTO(Long id, String name, String email, Long eventId, String eventTitle, String eventDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.eventDate = eventDate;
    }

}
