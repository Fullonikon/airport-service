package com.netcracker.airport.service.repository;

import com.netcracker.airport.service.dto.Schedule;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
}
