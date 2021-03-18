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
    @JoinColumn(name = "hangarId", referencedColumnName = "hangarId")
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

    public int getSpaceLeft() {
        return spaceLeft;
    }

    public void setSpaceLeft(int spaceLeft) {
        this.spaceLeft = spaceLeft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return capacity == transport.capacity && spaceLeft == transport.spaceLeft && flightRange == transport.flightRange && tailNumber == transport.tailNumber && type.equals(transport.type) && model.equals(transport.model) && hangar.equals(transport.hangar) && Objects.equals(schedule, transport.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, spaceLeft, flightRange, model, tailNumber, hangar, schedule);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                ", spaceLeft=" + spaceLeft +
                ", flightRange=" + flightRange +
                ", model='" + model + '\'' +
                ", tailNumber=" + tailNumber +
                ", hangar=" + hangar +
                '}';
    }
}
