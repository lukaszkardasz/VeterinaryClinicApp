package com.qvetka.veterinaryclinicapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String academicDegree;
    private String pwz;
    private double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String academicDegree, String pwz, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.academicDegree = academicDegree;
        this.pwz = pwz;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getpwz() {
        return pwz;
    }

    public void setpwz(String pwz) {
        this.pwz = pwz;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", academicDegree='" + academicDegree + '\'' +
                ", PWZ='" + pwz + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
