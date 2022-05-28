package com.company.university.division;

import com.company.university.util.datastructures.DynamicArray;

public class StructuralSubdivision {
    private static long countId;
    private Long id;
    private String name;
    private DynamicArray employees;

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

    public DynamicArray getEmployees() {
        return employees;
    }

    public void setEmployees(DynamicArray employees) {
        this.employees = employees;
    }
}
