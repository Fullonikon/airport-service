package com.necracker.airport.service.repository;

import com.necracker.airport.service.dto.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
}
