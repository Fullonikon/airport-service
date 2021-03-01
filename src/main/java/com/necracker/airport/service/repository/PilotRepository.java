package com.necracker.airport.service.repository;

import com.necracker.airport.service.dto.Pilot;
import org.springframework.data.repository.CrudRepository;

public interface PilotRepository extends CrudRepository<Pilot, Long> {
}
