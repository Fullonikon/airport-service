package com.necracker.airport.service.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "pilot")
public class Pilot {
    @Id private long employeeId;
    private String firstName;
    private String lastName;
    private String category;

    @OneToOne(mappedBy = "pilot")
    private Schedule schedule;

    public Pilot() {
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pilot pilot = (Pilot) o;
        return employeeId == pilot.employeeId &&
                Objects.equals(firstName, pilot.firstName) &&
                Objects.equals(lastName, pilot.lastName) &&
                Objects.equals(category, pilot.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, category);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
