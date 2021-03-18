package com.necracker.airport.service.service;

import com.necracker.airport.service.dto.Pilot;
import com.necracker.airport.service.repository.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotService {

    private final PilotRepository pilotRepository;

    @Autowired
    public PilotService(PilotRepository pilotRepository) {
        this.pilotRepository = pilotRepository;
    }

    public Pilot savePilot(Pilot pilot) {
        return this.pilotRepository.save(pilot);
    }
}
