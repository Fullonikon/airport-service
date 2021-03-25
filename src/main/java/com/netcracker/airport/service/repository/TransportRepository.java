package com.netcracker.airport.service.repository;

import com.netcracker.airport.service.dto.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends CrudRepository<Transport, Long> {
}
