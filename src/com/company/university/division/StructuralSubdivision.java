package com.company.university.division;

import java.util.List;

import com.company.university.myutil.PrintToConsole;
import com.company.university.person.Employee;
import com.company.university.util.datastructures.DynamicArray;

public class StructuralSubdivision {
    private static long countId;
    private Long id;
    private String name;
//    private List<Employee> employees;
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

//    List<Employee> getEmployees() {
//        return employees;
//    }
//
//    void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }
    
}
