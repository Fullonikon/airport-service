package com.netcracker.airport.service.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hangar")
public class Hangar {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="hangarId")
    long hangarId;
    boolean empty;
    String color;
    String hangarType;

    @OneToOne(mappedBy = "hangar")
    private Transport transport;


    public Hangar() {}

    public long getHangarId() {
        return hangarId;
    }

    public void setHangarId(int hangarId) {
        this.hangarId = hangarId;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHangarType() {
        return hangarType;
    }

    public void setHangarType(String hangarType) {
        this.hangarType = hangarType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hangar hangar = (Hangar) o;
        return hangarId == hangar.hangarId &&
                empty == hangar.empty &&
                Objects.equals(color, hangar.color) &&
                Objects.equals(hangarType, hangar.hangarType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hangarId, empty, color, hangarType);
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "hangarId=" + hangarId +
                ", capacity=" + empty +
                ", color='" + color + '\'' +
                ", type='" + hangarType + '\'' +
                '}';
    }
}
