package com.organizer_project.services.impl;

import com.organizer_project.DTO.EventDTO;
import com.organizer_project.entity.Event;
import com.organizer_project.repositories.IEventRepository;
import com.organizer_project.mappers.IEventMapper;
import org.springframework.stereotype.Service;
import com.organizer_project.services.SimpleService;

@Service
public class EventService implements SimpleService<Event, EventDTO, Integer> {

    private final IEventRepository eventRepository;
    private final IEventMapper eventMapper;

    public EventService(IEventRepository eventRepository,
                        IEventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    @Override
    public EventDTO create(EventDTO eventDTO) {
        Event event = fromDTO(eventDTO);

        EventDTO response = toDTO(eventRepository.save(event));

        return response;
    }

    @Override
    public EventDTO delete(EventDTO eventDTO) {
        return delete(eventDTO.getEventId());
    }

    private EventDTO delete(Integer id) {
        var event = eventRepository.findById(id);

        event.ifPresent(eventRepository::delete);

        return event.map(this::toDTO).orElse(null);
    }

    @Override
    public EventDTO update(EventDTO eventDTO) {
        var event = eventRepository.getOne(eventDTO.getEventId());

        event = fromDTO(eventDTO);

        EventDTO response = toDTO(eventRepository.save(event));

        return response;
    }

    @Override
    public EventDTO getByID(Integer id) {
        var event = eventRepository.findById(id);

        return event.map(this::toDTO).orElse(null);
    }

    private Event fromDTO(EventDTO eventDTO) {
        Event event = eventMapper.fromDto(eventDTO);

        return event;
    }
    private EventDTO toDTO(Event event) {
        EventDTO eventDTO = eventMapper.toDto(event);

        return eventDTO;
    }
}
