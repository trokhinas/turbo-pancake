package com.organizer_project.controllers;


import com.organizer_project.DTO.EventDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.organizer_project.services.impl.EventService;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(path = "/{id}")
    public EventDTO getById(@PathVariable("id") int id) {
        return eventService.getByID(id);
    }
}
