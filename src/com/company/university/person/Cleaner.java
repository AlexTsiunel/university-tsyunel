package com.company.university.person;

import java.util.Date;
import java.util.List;

public class Cleaner extends Employee {
    private static long countId = 1;
    private List<AreaOfResponsibility> areaOfResponsibility;

    public Cleaner(String firstName, String lastName, Sex sex, Date dateOfBirth) {
        super(firstName, lastName, sex, dateOfBirth);
        super.setId(countId++);
    }

    public List<AreaOfResponsibility> getAreaOfResponsibility() {
        return areaOfResponsibility;
    }

    public void setAreaOfResponsibility(List<AreaOfResponsibility> areaOfResponsibility) {
        this.areaOfResponsibility = areaOfResponsibility;
    }
    @Override
    public String introduceYourself() {
        String name = (super.getFirstName() == null ? "NOT ASSIGNED" : super.getFirstName());
        String subdivisionName = "NOT ASSIGNED";
        if (super.getStructuralSubdivision() != null && super.getStructuralSubdivision().getName() != null)
            subdivisionName = super.getStructuralSubdivision().getName();
        return String.format("My name is %s, I work as a cleaner.  I work in the %s", name, subdivisionName);
    }

    @Override
    public String toString() {
        String structuralSubdivision = (super.getStructuralSubdivision() == null ? "NOT ASSIGNED"
                : super.getStructuralSubdivision().getName());

        return String.format("Cliner  [id: %3d| name: %-8s %-8s| structural subdivision: %s]", 
                super.getId(), super.getFirstName(), super.getLastName(), structuralSubdivision);
    }
}

