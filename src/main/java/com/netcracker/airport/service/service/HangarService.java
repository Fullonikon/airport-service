package com.netcracker.airport.service.service;

import com.netcracker.airport.service.dto.Hangar;
import com.netcracker.airport.service.repository.HangarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HangarService {

    private final HangarRepository hangarRepository;

    @Autowired
    public HangarService(HangarRepository hangarRepository) {
        this.hangarRepository = hangarRepository;
    }


    public Hangar saveHangar(Hangar hangar) {
        return  this.hangarRepository.save(hangar);
    }
}
