package com.company.university.division;

import java.util.List;

import com.company.university.person.Employee;

public class StructuralSubdivision {
    private static long countId;
    private Long id;
    private String name;
    private List<Employee> employees;

    public StructuralSubdivision(String name) {
        super();
        this.id = countId++;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
