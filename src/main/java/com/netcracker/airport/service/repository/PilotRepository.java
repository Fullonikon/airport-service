package com.netcracker.airport.service.repository;

import com.netcracker.airport.service.dto.Pilot;
import org.springframework.data.repository.CrudRepository;

public interface PilotRepository extends CrudRepository<Pilot, Long> {
}
