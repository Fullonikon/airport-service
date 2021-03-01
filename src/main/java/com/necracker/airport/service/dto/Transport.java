package com.necracker.airport.service.dto;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "transport")
public class Transport {
    private String type;
    private int capacity;
    private int spaceLeft;
    private int flightRange;
    private String model;

    @Id private long tailNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hangarid", referencedColumnName = "hangarid")
    private Hangar hangar;

    @OneToOne(mappedBy = "transport")
    private Schedule schedule;

    public Transport() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(long tailNumber) {
        this.tailNumber = tailNumber;
    }

    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return capacity == transport.capacity &&
                flightRange == transport.flightRange &&
                tailNumber == transport.tailNumber &&
                Objects.equals(type, transport.type) &&
                Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, flightRange, model, tailNumber);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", flightRange=" + flightRange +
                ", model='" + model + '\'' +
                ", tailNumber=" + tailNumber +
                '}';
    }
}
