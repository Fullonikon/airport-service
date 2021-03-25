package com.netcracker.airport.service.service;

import com.netcracker.airport.service.dto.Pilot;
import com.netcracker.airport.service.repository.PilotRepository;
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
