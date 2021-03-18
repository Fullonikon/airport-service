package com.necracker.airport.service.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hangar")
public class Hangar {
    @Id int hangarId;
    int capacity;
    String color;
    String type;

    @OneToOne(mappedBy = "hangar")
    private Transport transport;


    public Hangar() {}

    public int getHangarId() {
        return hangarId;
    }

    public void setHangarId(int hangarID) {
        this.hangarId = hangarID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hangar hangar = (Hangar) o;
        return hangarId == hangar.hangarId &&
                capacity == hangar.capacity &&
                Objects.equals(color, hangar.color) &&
                Objects.equals(type, hangar.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hangarId, capacity, color, type);
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "hangarID=" + hangarId +
                ", capacity=" + capacity +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
