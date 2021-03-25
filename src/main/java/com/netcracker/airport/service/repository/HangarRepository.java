package com.netcracker.airport.service.repository;


import com.netcracker.airport.service.dto.Hangar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangarRepository extends CrudRepository<Hangar, Long> {
}
