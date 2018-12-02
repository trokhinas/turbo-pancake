package com.organizer_project.mappers;


import com.organizer_project.DTO.EventDTO;
import com.organizer_project.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface IEventMapper {

    @Mappings({
            @Mapping(target = "eventId", ignore = true),
    })
    Event fromDto(EventDTO eventDTO);


    EventDTO toDto(Event event);
}
