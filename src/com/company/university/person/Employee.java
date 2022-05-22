package com.company.university.person;

import java.util.Date;
import com.company.university.Salary;
import com.company.university.division.StructuralSubdivision;

public abstract class Employee extends Person {
    private static long countId = 1;
    private StructuralSubdivision structuralSubdivision;
    private int workExperience;
    private int vacationDuration;
    private int hoursWorked;
    private Salary salary;

    public Employee(String firstName, String lastName, Sex sex, Date dateOfBirth) {
        super(firstName, lastName, sex, dateOfBirth);
        super.setId(countId++);
        this.salary = new Salary();
    }

    public StructuralSubdivision getStructuralSubdivision() {
        return structuralSubdivision;
    }

    public void setStructuralSubdivision(StructuralSubdivision structuralSubdivision) {
        this.structuralSubdivision = structuralSubdivision;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int getVacationDuration() {
        return vacationDuration;
    }

    public void setVacationDuration(int vacationDuration) {
        this.vacationDuration = vacationDuration;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
