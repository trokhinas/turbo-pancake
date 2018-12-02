package com.organizer_project.services;

public interface SimpleService<Entity, DTO, ID> {

    public DTO create(DTO dto);
    public DTO delete(DTO dto);
    public DTO update(DTO dto);
    public DTO getByID(ID id);
}
