package com.netcracker.airport.service.dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "Schedule")
public class Schedule {
    @Id long flightID;
    LocalDate departureTime;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tailnuber", referencedColumnName = "tailnumber")
    private Transport transport;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeid", referencedColumnName = "employeeid")
    private Pilot pilot;

    public Schedule() {
    }

    public long getFlightID() {
        return flightID;
    }

    public void setFlightID(long flightID) {
        this.flightID = flightID;
    }

    public LocalDate getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDate departureTime) {
        this.departureTime = departureTime;
    }

    public long getEmployeeID() {
        return pilot.getEmployeeId();
    }

    public void setEmployeeID(long employeeID) {
        this.pilot.setEmployeeId(employeeID);
    }

    public long getTailNumber() {
        return transport.getTailNumber();
    }

    public void setTailNumber(long tailNumber) {
        this.transport.setTailNumber(tailNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return flightID == schedule.flightID &&
                departureTime.equals(schedule.departureTime) &&
                transport.equals(schedule.transport) &&
                pilot.equals(schedule.pilot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightID, departureTime, transport, pilot);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "flightID=" + flightID +
                ", departureTime=" + departureTime +
                ", transport=" + transport +
                ", pilot=" + pilot +
                '}';
    }
}
