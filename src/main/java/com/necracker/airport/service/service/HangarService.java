package com.necracker.airport.service.service;

import com.necracker.airport.service.dto.Hangar;
import com.necracker.airport.service.repository.HangarRepository;
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
