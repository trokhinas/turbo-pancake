package com.organizer_project.repositories;

import com.organizer_project.entity.Firm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFirmRepository extends JpaRepository<Firm, Integer> {
}
