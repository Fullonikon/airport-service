package com.netcracker.airport.service.service;

import com.netcracker.airport.service.dto.Transport;
import com.netcracker.airport.service.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportService {

    private final TransportRepository transportRepository;

    @Autowired
    public TransportService(TransportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }

    public Iterable<Transport> findAll() {
        return this.transportRepository.findAll();
    }

    public Transport saveTransport(Transport transport) {
        return this.transportRepository.save(transport);
    }

}
