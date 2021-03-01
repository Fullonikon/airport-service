package com.necracker.airport.service.repository;

import com.necracker.airport.service.dto.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends CrudRepository<Transport, Long> {
}
