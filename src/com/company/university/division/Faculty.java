package com.company.university.division;

import java.util.ArrayList;
import java.util.List;


public class Faculty extends DivisionUnit {
    private static long countId = 1;
    private List<Department> departments;
    private List<Group> groups;

    public Faculty(String name) {
        super(name);
        super.setId(countId++);
        this.groups = new ArrayList<>();
        this.departments = new ArrayList<>();
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        String facultyName = (super.getName() == null ? "NOT ASSIGNED" : super.getName());
        int numberDepartments = departments.size();
        int numberGroups = groups.size();
        return String.format("Faculty name: %s\n   id: %d.\n   number of departments: %d.\n   number of groups: %d.",
                facultyName, super.getId(), numberDepartments, numberGroups);
    }
}
