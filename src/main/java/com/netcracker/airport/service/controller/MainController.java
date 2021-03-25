package com.netcracker.airport.service.controller;

import com.netcracker.airport.service.dto.Hangar;
import com.netcracker.airport.service.dto.Transport;
import com.netcracker.airport.service.service.HangarService;
import com.netcracker.airport.service.service.TransportService;
import com.netcracker.airport.service.dto.Pilot;
import com.netcracker.airport.service.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class MainController {

    private final TransportService transportService;
    private final PilotService pilotService;
    private final HangarService hangarService;

    @Autowired
    public MainController(TransportService transportService, PilotService pilotService, HangarService hangarService) {
        this.transportService = transportService;
        this.pilotService = pilotService;
        this.hangarService = hangarService;
    }

    @GetMapping("/findAllTransport")
    @CrossOrigin(origins = "http://localhost:4200")
    public Iterable<Transport> findAll() {
        return this.transportService.findAll();
    }

    @PostMapping("/saveTransport")
    @CrossOrigin(origins = "http://localhost:4200")
    public Transport saveTransport(@RequestBody Transport transport) {
        return this.transportService.saveTransport(transport);
    }

    @PostMapping("/savePilot")
    @CrossOrigin(origins = "http://localhost:4200")
    public Pilot savePilot(@RequestBody Pilot pilot) {
        return this.pilotService.savePilot(pilot);
    }

    @PostMapping("/saveHangar")
    @CrossOrigin(origins = "http://localhost:4200")
    public Hangar saveHangar(@RequestBody Hangar hangar) {
        return this.hangarService.saveHangar(hangar);
    }


}
