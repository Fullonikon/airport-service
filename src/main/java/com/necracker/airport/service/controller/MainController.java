package com.necracker.airport.service.controller;

import com.necracker.airport.service.dto.Transport;
import com.necracker.airport.service.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final TransportService transportService;

    @Autowired
    public MainController(TransportService transportService) {
        this.transportService = transportService;
    }

    @GetMapping("/findAll")
    public Iterable<Transport> findAll() {
        return this.transportService.findAll();
    }

}
