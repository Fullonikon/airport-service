package com.necracker.airport.service.repository;


import com.necracker.airport.service.dto.Hangar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangarRepository extends CrudRepository<Hangar, Long> {
}
