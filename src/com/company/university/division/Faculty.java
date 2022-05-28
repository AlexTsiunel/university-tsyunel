package com.company.university.division;

import com.company.university.util.datastructures.DynamicArray;
import com.company.university.util.datastructures.MyDynamicArray;

public class Faculty extends DivisionUnit {
    private static long countId = 1;
    private DynamicArray departments;
    private DynamicArray groups;

    public Faculty(String name) {
        super(name);
        super.setId(countId++);
        this.groups = new MyDynamicArray();
        this.departments = new MyDynamicArray();
    }

    public DynamicArray getDepartments() {
        return departments;
    }

    public void setDepartments(DynamicArray departments) {
        this.departments = departments;
    }

    public DynamicArray getGroups() {
        return groups;
    }

    public void setGroups(DynamicArray groups) {
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
